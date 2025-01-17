package net.meteor.common;

import net.meteor.common.item.ItemBlockSlippery;
import net.meteor.common.tileentity.TileEntitySlippery;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabMeteor extends CreativeTabs {

	public CreativeTabMeteor(String label) {
		super(label);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
    public void displayAllRelevantItems(NonNullList<ItemStack> items) {
		super.displayAllRelevantItems(items);

		//TODO 1.12.2
		//items.add(16, getSlipperyStairItemStack(MeteorBlocks.blockSlipperyStairs));
		//items.add(17, getSlipperyStairItemStack(MeteorBlocks.blockSlipperyStairsTwo));
		//items.add(18, getSlipperyStairItemStack(MeteorBlocks.blockSlipperyStairsThree));
		//items.add(19, getSlipperyStairItemStack(MeteorBlocks.blockSlipperyStairsFour));
		items.add(ItemEnchantedBook.getEnchantedItemStack(new EnchantmentData(MeteorsMod.ColdTouch, MeteorsMod.ColdTouch.getMaxLevel())));
		items.add(ItemEnchantedBook.getEnchantedItemStack(new EnchantmentData(MeteorsMod.Magnetization, MeteorsMod.Magnetization.getMaxLevel())));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack createIcon() {
		return new ItemStack(MeteorItems.itemMeteorChips);
	}

}
