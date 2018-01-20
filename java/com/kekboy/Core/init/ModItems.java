package com.kekboy.Core.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.List;

import com.kekboy.Core.ArmorAndItems.ArmorBase;
import com.kekboy.Core.baseplate.hub;
import com.kekboy.Core.items.ItemBase;

import java.util.ArrayList;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ArmorMaterial ARMOR_DA_WAE = EnumHelper.addArmorMaterial("armor_da_wae", hub.MOD_ID + ":da_wae", 89, new int[] {13, 21, 19, 10}, 0, SoundEvents.ENTITY_ENDERDRAGON_FLAP, 5.0F);
	public static final ArmorMaterial ARMOR_SHARK = EnumHelper.addArmorMaterial("armor_shark", hub.MOD_ID + ":shark", 8, new int[] {1, 1, 1, 1}, 0, SoundEvents.ENTITY_ENDERDRAGON_FLAP, 0.0F);
	
	
	//items
	public static final Item VOCO_INGOT = new ItemBase("voco_ingot");
	public static final Item INGOT_AINSLEY = new ItemBase("ainsley_dad");
	public static final Item INGOT_SHARK = new ItemBase("shark_ingot");

	//armor
	public static final Item HELMET_DA_WAE = new ArmorBase("helmet_da_wae", ARMOR_DA_WAE, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_DA_WAE = new ArmorBase("chestplate_da_wae", ARMOR_DA_WAE, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_DA_WAE = new ArmorBase("leggings_da_wae", ARMOR_DA_WAE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_DA_WAE = new ArmorBase("boots_da_wae", ARMOR_DA_WAE, 1, EntityEquipmentSlot.FEET);
	public static final Item HELMET_SHARK = new ArmorBase("helmet_shark", ARMOR_SHARK, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_SHARK = new ArmorBase("chestplate_shark", ARMOR_SHARK, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_SHARK = new ArmorBase("leggings_shark", ARMOR_SHARK, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_SHARK = new ArmorBase("boots_shark", ARMOR_SHARK, 1, EntityEquipmentSlot.FEET);
}
