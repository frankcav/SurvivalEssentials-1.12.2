package com.mineundermatter.survivalessentials.recipe;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.mineundermatter.survivalessentials.init.EssentialBlocks;
import com.mineundermatter.survivalessentials.init.EssentialItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLLog;

public class TitaniumForgeRecipes {

	
	private static final TitaniumForgeRecipes FORGING = new TitaniumForgeRecipes();
	private final Map<ItemStack, ItemStack> forgingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

	public static TitaniumForgeRecipes instance() {

		return FORGING;

	}
	
	private TitaniumForgeRecipes() {
		this.addForgingRecipe(new ItemStack(EssentialBlocks.miamium_ore), new ItemStack(EssentialItems.miamium_beam), 2f);
	}
	
	
	public void addForgingRecipe(ItemStack input1, ItemStack result,float experience) {
		if(getForgingResult(input1) != ItemStack.EMPTY) {
			FMLLog.info("Ignored forging recipe with conflicting input: " + input1 + " = " + result);
			return;
		}
			this.forgingList.put(input1, result);
			this.experienceList.put(result, Float.valueOf(experience));
	}

    public ItemStack getForgingResult(ItemStack stack)
    {
        for (Entry<ItemStack, ItemStack> entry : this.forgingList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return entry.getValue();
            }
        }

        return ItemStack.EMPTY;
    }
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Map<ItemStack, ItemStack> getSmeltingList() {
		return this.forgingList;
	}
	
	public float getSmeltingExperience(ItemStack stack) {
		for(Entry<ItemStack, Float> entry : this.experienceList.entrySet())
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
				return ((Float)entry.getValue()).floatValue();
		return 0.0F;
	}
}
