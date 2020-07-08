package com.mineundermatter.survivalessentials.item;

import javax.annotation.Nonnull;

import com.mineundermatter.survivalessentials.entity.EntityMBS;
import com.mineundermatter.survivalessentials.entity.EntityMissile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


	public class ItemMissile extends ItemArrow {

		

		





		

			

			 public ItemMissile()

			    {

			        

			    }



			    public EntityMissile createArrow(@Nonnull World world, @Nonnull ItemStack itemstack, EntityLivingBase shooter) {

			        return new EntityMissile(world, shooter);

				}

				



			    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.EntityPlayer player)

			    {

			        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY, bow);

			        return enchant <= 0 ? false : this.getClass() == ItemMissile.class;

			    }

			





																				//Crafting Recipe\\





			    		



			}
