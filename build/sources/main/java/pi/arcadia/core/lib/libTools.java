package main.java.pi.arcadia.core.lib;

import main.java.pi.arcadia.common.tools.NuclearPoweredShears;
import main.java.pi.arcadia.common.tools.ToolAxe;
import main.java.pi.arcadia.common.tools.ToolHoe;
import main.java.pi.arcadia.common.tools.ToolPickaxe;
import main.java.pi.arcadia.common.tools.ToolShovel;
import main.java.pi.arcadia.common.tools.ToolSword;
import net.minecraft.item.Item;

public class libTools {
	//tools				
		public static final Item AXE_PLASTO = new ToolAxe("plasto_axe",ModMaterial.TOOL_PLASTO);
		public static final Item HOE_PLASTO = new ToolHoe("plasto_hoe", ModMaterial.TOOL_PLASTO);
		public static final Item PICKAXE_PLASTO = new ToolPickaxe("plasto_pickaxe", ModMaterial.TOOL_PLASTO);
		public static final Item SHOVEL_PLASTO = new ToolShovel("plasto_shovel", ModMaterial.TOOL_PLASTO);
		public static final Item SWORD_PLASTO = new ToolSword("plasto_sword", ModMaterial.TOOL_PLASTO);
		public static final Item NUCLEAR_SHEARS = new NuclearPoweredShears("nuclear_shears");
}
