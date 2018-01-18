package main.java.pi.arcadia.common.block;

import main.java.pi.arcadia.common.Arcadia;
import main.java.pi.arcadia.core.init.ItemInit;
import main.java.pi.arcadia.core.init.BlockInit;
import main.java.pi.arcadia.core.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(
				new ItemBlock(this)
				.setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		Arcadia.proxy.registerItemRenderer(
				Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
