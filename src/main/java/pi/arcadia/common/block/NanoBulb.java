package main.java.pi.arcadia.common.block;

import main.java.pi.arcadia.common.Arcadia;
import main.java.pi.arcadia.core.interfaces.IHasModel;
import main.java.pi.arcadia.core.lib.Reference;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class NanoBulb extends BlockTorch implements IHasModel{

	
	
	public NanoBulb(String name) {
		super();
		setUnlocalizedName(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(Arcadia.ArcadiaTab);
		
	}

	@Override
	public void registerModels() {
		Arcadia.proxy.registerItemRenderer(
				Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
