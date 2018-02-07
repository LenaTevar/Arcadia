package main.java.pi.arcadia.common.item;

import main.java.pi.arcadia.common.Arcadia;
import main.java.pi.arcadia.core.interfaces.IHasModel;
import main.java.pi.arcadia.core.lib.Reference;
import net.minecraft.item.Item;

public class Tablet  extends Item implements IHasModel{
	
	
	public Tablet (String name) {
		setUnlocalizedName(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(Arcadia.ArcadiaTab);
		
		//ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Arcadia.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
