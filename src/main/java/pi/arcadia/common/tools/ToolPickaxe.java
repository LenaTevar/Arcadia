package main.java.pi.arcadia.common.tools;

import main.java.pi.arcadia.common.Arcadia;
import main.java.pi.arcadia.core.init.ItemInit;
import main.java.pi.arcadia.core.interfaces.IHasModel;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Arcadia.ArcadiaTab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Arcadia.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
