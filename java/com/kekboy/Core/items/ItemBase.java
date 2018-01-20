package com.kekboy.Core.items;

import com.kekboy.Core.MainCore;
import com.kekboy.Core.baseplate.interfaces.Model;
import com.kekboy.Core.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements Model {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		MainCore.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
