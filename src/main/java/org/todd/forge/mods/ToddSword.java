package org.todd.forge.mods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ToddSword extends ItemSword {

	public ToddSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName("toddSword");
	}
	
	@SubscribeEvent
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		entity.worldObj.createExplosion(entity, entity.posX, entity.posY, entity.posZ, 3, false);
		entity.setFire(10);
		float dmg = 25;
		entity.attackEntityFrom(DamageSource.generic, dmg);
		return true;
	}
}
