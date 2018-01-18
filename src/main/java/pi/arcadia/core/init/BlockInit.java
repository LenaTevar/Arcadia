package main.java.pi.arcadia.core.init;

import java.util.ArrayList;
import java.util.List;

import main.java.pi.arcadia.common.block.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_PLASTOTEXTILE = new BlockBase("block_plastotextile", Material.IRON);
}
