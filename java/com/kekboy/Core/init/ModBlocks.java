package com.kekboy.Core.init;

import java.util.ArrayList;
import java.util.List;

import com.kekboy.Core.baseplate.blocks.BlockBase;
import com.kekboy.Core.baseplate.blocks.BlockOres;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block>	BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_VOCO = new BlockBase("ore_voco", Material.IRON);
	public static final Block BLOCK_VOCO = new BlockBase("block_voco", Material.IRON);
	
	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
}
