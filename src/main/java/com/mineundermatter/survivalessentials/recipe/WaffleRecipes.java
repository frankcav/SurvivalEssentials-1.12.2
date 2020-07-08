package com.mineundermatter.survivalessentials.recipe;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.mineundermatter.survivalessentials.init.EssentialItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLLog;

public class WaffleRecipes {
	
	private static final WaffleRecipes MAKING = new WaffleRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> waffleMakingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

	public static WaffleRecipes instance() {

		return MAKING;

	}
	
	private WaffleRecipes() {
		this.addWaffleMakingRecipe(new ItemStack(EssentialItems.waffle_mix), new ItemStack(EssentialItems.cream), new ItemStack(EssentialItems.waffle), 10F);
		this.addWaffleMakingRecipe(new ItemStack(EssentialItems.cream), new ItemStack(EssentialItems.waffle_mix), new ItemStack(EssentialItems.waffle), 10F);
	}
	
	public void addWaffleMakingRecipe(ItemStack input1, ItemStack input2, ItemStack result,float experience) {
		if(getWaffleMakingResult(input1, input2) != ItemStack.EMPTY) {
			FMLLog.info("Ignored waffle making recipe with conflicting input: " + input1 + "and " + input2 + " = " + result);
			return;
		}
			this.waffleMakingList.put(input1, input2, result);
			this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getWaffleMakingResult(ItemStack input1, ItemStack input2) {
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.waffleMakingList.columnMap().entrySet())
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
						return (ItemStack)ent.getValue();
			return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getWaffleMakingList() {
		return this.waffleMakingList;
	}
	
	public float getWaffleMakingExperience(ItemStack stack) {
		for(Entry<ItemStack, Float> entry : this.experienceList.entrySet())
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
				return ((Float)entry.getValue()).floatValue();
		return 0.0F;
	}
	
}
