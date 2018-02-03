package main.java.pi.arcadia.common.tools;

import main.java.pi.arcadia.common.Arcadia;
import main.java.pi.arcadia.core.init.ItemInit;
import main.java.pi.arcadia.core.interfaces.IHasModel;
import main.java.pi.arcadia.core.lib.Reference;
import net.minecraft.item.ItemShears;

public class ToolShears extends ItemShears implements IHasModel{
	
	public ToolShears(String name) {
		setUnlocalizedName(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(Arcadia.ArcadiaTab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Arcadia.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
