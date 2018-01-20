package com.kekboy.Core.baseplate.blocks;

import com.kekboy.Core.MainCore;
import com.kekboy.Core.baseplate.interfaces.Model;
import com.kekboy.Core.init.ModBlocks;
import com.kekboy.Core.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements Model{

public BlockBase(String name, Material material) {
	super(material);
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(CreativeTabs.MATERIALS);
	
	ModBlocks.BLOCKS.add(this);
	ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
}

	@Override
	public void registerModels() 
	{
		MainCore.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}



}
