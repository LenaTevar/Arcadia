package main.java.pi.arcadia.client.tabs;

import main.java.pi.arcadia.core.lib.libItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ArcadiaTab extends CreativeTabs {

	public ArcadiaTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(libItems.NUCLEAR_CORE);
	}

}
