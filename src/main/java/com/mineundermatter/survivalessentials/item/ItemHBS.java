package com.mineundermatter.survivalessentials.item;

import javax.annotation.Nonnull;

import com.mineundermatter.survivalessentials.entity.EntityHBS;
import com.mineundermatter.survivalessentials.entity.EntityMBS;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


	public class ItemHBS extends ItemArrow {

		

		





		

			

			 public ItemHBS()

			    {

			        

			    }



			    public EntityHBS createArrow(@Nonnull World world, @Nonnull ItemStack itemstack, EntityLivingBase shooter) {

			        return new EntityHBS(world, shooter);

				}

				



			    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.EntityPlayer player)

			    {

			        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY, bow);

			        return enchant <= 0 ? false : this.getClass() == ItemHBS.class;

			    }

			





																				//Crafting Recipe\\





			    		



			}
