package net.meteor.common;

import net.meteor.common.item.ItemDetector;
import net.meteor.common.item.ItemEnchArmor;
import net.meteor.common.item.ItemEnchAxe;
import net.meteor.common.item.ItemEnchHoe;
import net.meteor.common.item.ItemEnchPickaxe;
import net.meteor.common.item.ItemEnchSpade;
import net.meteor.common.item.ItemEnchSword;
import net.meteor.common.item.ItemFoodMeteorsMod;
import net.meteor.common.item.ItemFrezariteAxe;
import net.meteor.common.item.ItemFrezariteHoe;
import net.meteor.common.item.ItemFrezaritePickaxe;
import net.meteor.common.item.ItemFrezariteSpade;
import net.meteor.common.item.ItemFrezariteSword;
import net.meteor.common.item.ItemKreknoSword;
import net.meteor.common.item.ItemMeteorsMod;
import net.meteor.common.item.ItemSummoner;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class MeteorItems {
	
	public static final ArmorMaterial MeteoriteArmor = EnumHelper.addArmorMaterial("METEORITE", 36, new int[] { 2, 7, 5, 2 }, 15);
	public static final ArmorMaterial FrezariteArmor = EnumHelper.addArmorMaterial("FREZARITE", 7, new int[] { 2, 5, 3, 1 }, 20);
	public static final ArmorMaterial KreknoriteArmor = EnumHelper.addArmorMaterial("KREKNORITE", 40, new int[] { 3, 8, 6, 3 }, 10);

	public static final ToolMaterial MeteoriteTool = EnumHelper.addToolMaterial("METEORITE", 3, 900, 10.0F, 2, 15);
	public static final ToolMaterial FrezariteTool = EnumHelper.addToolMaterial("FREZARITE", 2, 225, 7.0F, 2, 20);
	
	public static final Item itemMeteorChips 			= new ItemMeteorsMod().setTexture("MeteorChips").setMaxStackSize(64).setTranslationKey("MeteorChips");
	public static final Item itemRedMeteorGem 			= new ItemMeteorsMod().setTexture("RedMeteorGem").setMaxStackSize(64).setTranslationKey("RedMeteorGem");
	public static final Item itemMeteorSummoner 		= new ItemSummoner().setTexture("MeteorSummoner").setTranslationKey("MeteorSummoner");
	public static final Item itemFrezaCrystal 			= new ItemMeteorsMod().setTexture("FrezariteCrystal").setMaxStackSize(64).setTranslationKey("FrezariteCrystal");
	public static final Item itemKreknoChip 			= new ItemMeteorsMod().setTexture("KreknoriteChip").setMaxStackSize(64).setTranslationKey("KreknoriteChip");
	public static final Item itemVanillaIceCream 		= new ItemFoodMeteorsMod(4, false).setTexture("VanillaIceCream").setMaxStackSize(64).setTranslationKey("VanillaIceCream");
	public static final Item itemChocolateIceCream 		= new ItemFoodMeteorsMod(6, false).setTexture("ChocolateIceCream").setMaxStackSize(64).setTranslationKey("ChocolateIceCream");
	public static final Item itemMeteorProximityDetector= new ItemDetector(0).setTexture("MeteorDetectorProximity").setTranslationKey("MeteorDetectorProximity");
	public static final Item itemMeteorTimeDetector 	= new ItemDetector(1).setTexture("MeteorDetectorTime").setTranslationKey("MeteorDetectorTime");
	public static final Item itemMeteorCrashDetector 	= new ItemDetector(2).setTexture("MeteorDetectorCrash").setTranslationKey("MeteorDetectorCrash");
	public static final Item MeteoriteHelmet 			= new ItemEnchArmor(MeteoriteArmor, 3, 0).setEnch(MeteorsMod.Magnetization, 1).setTexture("MeteoriteHelmet").setArmorTexture("Meteorite").setTranslationKey("MeteoriteHelmet");
	public static final Item MeteoriteBody 				= new ItemEnchArmor(MeteoriteArmor, 3, 1).setEnch(MeteorsMod.Magnetization, 1).setTexture("MeteoriteChest").setArmorTexture("Meteorite").setTranslationKey("MeteoriteChest");
	public static final Item MeteoriteLegs 				= new ItemEnchArmor(MeteoriteArmor, 3, 2).setEnch(MeteorsMod.Magnetization, 1).setTexture("MeteoriteLegs").setArmorTexture("Meteorite").setTranslationKey("MeteoriteLegs");
	public static final Item MeteoriteBoots 			= new ItemEnchArmor(MeteoriteArmor, 3, 3).setEnch(MeteorsMod.Magnetization, 1).setTexture("MeteoriteBoots").setArmorTexture("Meteorite").setTranslationKey("MeteoriteBoots");
	public static final Item MeteoriteAxe 				= new ItemEnchAxe(MeteoriteTool).setTexture("MeteoriteAxe").setEnch(MeteorsMod.Magnetization, 1).setTranslationKey("MeteoriteAxe");
	public static final Item MeteoriteSpade 			= new ItemEnchSpade(MeteoriteTool).setTexture("MeteoriteSpade").setEnch(MeteorsMod.Magnetization, 1).setTranslationKey("MeteoriteSpade");
	public static final Item MeteoriteSword 			= new ItemEnchSword(MeteoriteTool).setTexture("MeteoriteSword").setEnch(MeteorsMod.Magnetization, 1).setTranslationKey("MeteoriteSword");
	public static final Item MeteoritePickaxe 			= new ItemEnchPickaxe(MeteoriteTool).setTexture("MeteoritePickaxe").setEnch(MeteorsMod.Magnetization, 1).setTranslationKey("MeteoritePickaxe");
	public static final Item MeteoriteHoe 				= new ItemEnchHoe(MeteoriteTool).setTexture("MeteoriteHoe").setEnch(MeteorsMod.Magnetization, 1).setTranslationKey("MeteoriteHoe");
	public static final Item FrezariteHelmet 			= new ItemEnchArmor(FrezariteArmor, 3, 0).setEnch(Enchantments.RESPIRATION, 3).setTexture("FrezariteHelmet").setArmorTexture("Frezarite").setTranslationKey("FrezariteHelmet");
	public static final Item FrezariteBody 				= new ItemEnchArmor(FrezariteArmor, 3, 1).setEnch(Enchantments.AQUA_AFFINITY, 1).setTexture("FrezariteChest").setArmorTexture("Frezarite").setTranslationKey("FrezariteChest");
	public static final Item FrezariteLegs 				= new ItemEnchArmor(FrezariteArmor, 3, 2).setEnch(MeteorsMod.ColdTouch, 1).setTexture("FrezariteLegs").setArmorTexture("Frezarite").setTranslationKey("FrezariteLegs");
	public static final Item FrezariteBoots 			= new ItemEnchArmor(FrezariteArmor, 3, 3).setEnch(MeteorsMod.ColdTouch, 1).setTexture("FrezariteBoots").setArmorTexture("Frezarite").setTranslationKey("FrezariteBoots");
	public static final Item FrezaritePickaxe 			= new ItemFrezaritePickaxe(FrezariteTool).setTexture("FrezaritePickaxe").setTranslationKey("FrezaritePickaxe");
	public static final Item FrezariteSpade 			= new ItemFrezariteSpade(FrezariteTool).setTexture("FrezariteSpade").setTranslationKey("FrezariteSpade");
	public static final Item FrezariteSword 			= new ItemFrezariteSword(FrezariteTool).setTexture("FrezariteSword").setTranslationKey("FrezariteSword");
	public static final Item FrezariteAxe 				= new ItemFrezariteAxe(FrezariteTool).setTexture("FrezariteAxe").setTranslationKey("FrezariteAxe");
	public static final Item FrezariteHoe 				= new ItemFrezariteHoe(FrezariteTool).setTexture("FrezariteHoe").setTranslationKey("FrezariteHoe");
	public static final Item KreknoriteHelmet 			= new ItemEnchArmor(KreknoriteArmor, 3, 0).setEnch(Enchantments.FIRE_PROTECTION, 4).setTexture("KreknoriteHelmet").setArmorTexture("Kreknorite").setTranslationKey("KreknoriteHelmet");
	public static final Item KreknoriteBody 			= new ItemEnchArmor(KreknoriteArmor, 3, 1).setEnch(Enchantments.FIRE_PROTECTION, 4).setTexture("KreknoriteChest").setArmorTexture("Kreknorite").setTranslationKey("KreknoriteChest");
	public static final Item KreknoriteLegs 			= new ItemEnchArmor(KreknoriteArmor, 3, 2).setEnch(Enchantments.FIRE_PROTECTION, 4).setTexture("KreknoriteLegs").setArmorTexture("Kreknorite").setTranslationKey("KreknoriteLegs");
	public static final Item KreknoriteBoots 			= new ItemEnchArmor(KreknoriteArmor, 3, 3).setEnch(Enchantments.FIRE_PROTECTION, 4).setTexture("KreknoriteBoots").setArmorTexture("Kreknorite").setTranslationKey("KreknoriteBoots");
	public static final Item KreknoriteSword 			= new ItemKreknoSword(MeteoriteTool).setTexture("KreknoriteSword").setTranslationKey("KreknoriteSword");

	// Begin industrialization! :D
	public static final Item MeteoriteIngot				= new ItemMeteorsMod().setTexture("MeteoriteIngot").setTranslationKey("MeteoriteIngot");
	public static final Item FrozenIron					= new ItemMeteorsMod().setTexture("FrozenIron").setTranslationKey("FrozenIron");
	public static final Item KreknoriteIngot			= new ItemMeteorsMod().setTexture("KreknoriteIngot").setTranslationKey("KreknoriteIngot");
	
	public static void readyItems() {
		MeteoriteAxe.setHarvestLevel("axe", 3);
		MeteoritePickaxe.setHarvestLevel("pickaxe", 3);
		MeteoriteSpade.setHarvestLevel("shovel", 3);
		FrezaritePickaxe.setHarvestLevel("pickaxe", 2);
		FrezariteSpade.setHarvestLevel("shovel", 2);
		FrezariteAxe.setHarvestLevel("axe", 2);
	}
	
	public static void registerItems() {
		GameRegistry.registerItem(itemMeteorChips, "MeteorChips");
		GameRegistry.registerItem(itemRedMeteorGem, "RedMeteorGem");
		GameRegistry.registerItem(itemFrezaCrystal, "FrezaCrystal");
		GameRegistry.registerItem(itemKreknoChip, "KreknoChip");
		GameRegistry.registerItem(itemVanillaIceCream, "VanillaICream");
		GameRegistry.registerItem(itemChocolateIceCream, "ChocolateICream");
		GameRegistry.registerItem(itemMeteorCrashDetector, "MeteorCrashDet");
		GameRegistry.registerItem(itemMeteorProximityDetector, "MeteorProxDet");
		GameRegistry.registerItem(itemMeteorTimeDetector, "MeteorTimeDet");
		GameRegistry.registerItem(itemMeteorSummoner, "MeteorSummoner");
		GameRegistry.registerItem(FrezariteHelmet, "FrezHelm");
		GameRegistry.registerItem(FrezariteBody, "FrezBody");
		GameRegistry.registerItem(FrezariteLegs, "FrezLegs");
		GameRegistry.registerItem(FrezariteBoots, "FrezBoots");
		GameRegistry.registerItem(FrezaritePickaxe, "FrezPick");
		GameRegistry.registerItem(FrezariteSpade, "FrezSpade");
		GameRegistry.registerItem(KreknoriteHelmet, "KrekHelm");
		GameRegistry.registerItem(KreknoriteBody, "KrekBody");
		GameRegistry.registerItem(KreknoriteLegs, "KrekLegs");
		GameRegistry.registerItem(KreknoriteBoots, "KrekBoots");
		GameRegistry.registerItem(KreknoriteSword, "KrekSword");
		GameRegistry.registerItem(MeteoriteAxe, "MetAxe");
		GameRegistry.registerItem(MeteoriteBody, "MetBody");
		GameRegistry.registerItem(MeteoriteBoots, "MetBoots");
		GameRegistry.registerItem(MeteoriteHelmet, "MetHelm");
		GameRegistry.registerItem(MeteoriteHoe, "MetHoe");
		GameRegistry.registerItem(MeteoriteLegs, "MetLegs");
		GameRegistry.registerItem(MeteoritePickaxe, "MetPick");
		GameRegistry.registerItem(MeteoriteSpade, "MetSpade");
		GameRegistry.registerItem(MeteoriteSword, "MetSword");
		GameRegistry.registerItem(FrezariteSword, "FrezSword");
		GameRegistry.registerItem(FrezariteAxe, "FrezAxe");
		GameRegistry.registerItem(FrezariteHoe, "FrezHoe");
		GameRegistry.registerItem(MeteoriteIngot, "MeteoriteIngot");
		GameRegistry.registerItem(FrozenIron, "FrozenIron");
		GameRegistry.registerItem(KreknoriteIngot, "KreknoriteIngot");
		
		// Ore Dictionary
		OreDictionary.registerOre("ingotMeteorite", MeteoriteIngot);
		OreDictionary.registerOre("ingotFrozenIron", FrozenIron);
		OreDictionary.registerOre("ingotKreknorite", KreknoriteIngot);
	}
	
}
