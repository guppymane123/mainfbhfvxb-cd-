package com.kekboy.Core.ArmorAndItems;

import com.kekboy.Core.MainCore;
import com.kekboy.Core.baseplate.interfaces.Model;
import com.kekboy.Core.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements Model {

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setRegistryName(name);
		setUnlocalizedName(name);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		MainCore.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
