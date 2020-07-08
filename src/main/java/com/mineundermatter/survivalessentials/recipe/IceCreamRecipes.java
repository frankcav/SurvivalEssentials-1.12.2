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

public class IceCreamRecipes {
	
	private static final IceCreamRecipes CREAMING = new IceCreamRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> iceCreamingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

	public static IceCreamRecipes instance() {

		return CREAMING;

	}
	
	private IceCreamRecipes() {
		this.addIceCreamingRecipe(new ItemStack(EssentialItems.cream), new ItemStack(EssentialItems.vanilla), new ItemStack(EssentialItems.vanilla_ice_cream), 10F);
		this.addIceCreamingRecipe(new ItemStack(EssentialItems.cream), new ItemStack(EssentialItems.chocolate), new ItemStack(EssentialItems.chocolate_ice_cream), 10F);
	}
	
	public void addIceCreamingRecipe(ItemStack input1, ItemStack input2, ItemStack result,float experience) {
		if(getIceCreamingResult(input1, input2) != ItemStack.EMPTY) {
			FMLLog.info("Ignored ice creaming recipe with conflicting input: " + input1 + "and " + input2 + " = " + result);
			return;
		}
			this.iceCreamingList.put(input1, input2, result);
			this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getIceCreamingResult(ItemStack input1, ItemStack input2) {
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.iceCreamingList.columnMap().entrySet())
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
						return (ItemStack)ent.getValue();
			return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getIceCreamingList() {
		return this.iceCreamingList;
	}
	
	public float getIceCreamingExperience(ItemStack stack) {
		for(Entry<ItemStack, Float> entry : this.experienceList.entrySet())
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
				return ((Float)entry.getValue()).floatValue();
		return 0.0F;
	}
	
}
