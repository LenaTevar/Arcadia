package main.java.pi.arcadia.common.tools;

import main.java.pi.arcadia.common.Arcadia;
import main.java.pi.arcadia.core.interfaces.IHasModel;
import main.java.pi.arcadia.core.lib.Reference;
import net.minecraft.item.ItemShield;

public class TowelShield extends ItemShield implements IHasModel {

	public TowelShield(String name) {
		setUnlocalizedName(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(Arcadia.ArcadiaTab);
		setMaxDamage(500);
	}
	
	@Override
	public void registerModels() {
		Arcadia.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
}
