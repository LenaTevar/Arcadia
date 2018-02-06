package main.java.pi.arcadia.core.init;

import main.java.pi.arcadia.common.block.BlockBase;
import main.java.pi.arcadia.common.block.NanoBulb;
import main.java.pi.arcadia.core.handler.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockInit {
	public BlockInit() {
		this.init();
	}
	
	public static final Block BLOCK_PLASTOTEXTILE = new BlockBase("block_plastotextile", Material.IRON);
	public static final Block BLOCK_NANOBULB = new NanoBulb("block_nanobulb");
	
	public void register(Block modBlock) {
		RegistryHandler.BLOCKS.add(modBlock);
		RegistryHandler.ITEMS.add(new ItemBlock(modBlock).setRegistryName(modBlock.getRegistryName()));
	}
	
	
	public void init() {
		register(BLOCK_PLASTOTEXTILE);	
		register(BLOCK_NANOBULB);
	}
	
}
