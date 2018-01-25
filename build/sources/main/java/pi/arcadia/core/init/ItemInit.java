package main.java.pi.arcadia.core.init;

import java.util.ArrayList;
import java.util.List;

import main.java.pi.arcadia.common.item.ItemBase;
import main.java.pi.arcadia.common.tools.NuclearPoweredShears;
import main.java.pi.arcadia.common.tools.ToolAxe;
import main.java.pi.arcadia.common.tools.ToolHoe;
import main.java.pi.arcadia.common.tools.ToolPickaxe;
import main.java.pi.arcadia.common.tools.ToolShovel;
import main.java.pi.arcadia.common.tools.ToolSword;
import main.java.pi.arcadia.core.lib.ModMaterial;
import main.java.pi.arcadia.core.lib.libArmor;
import net.minecraft.item.Item;

public class ItemInit {

	
	public static final List <Item> ITEMS = new ArrayList<Item>();
	
	public static final libArmor MOD_ARMORS = new libArmor();
	
	//materials
	public static final Item PLASTOTEXTILE = new ItemBase("plastotextile");
	public static final Item NUCLEAR_MATTER = new ItemBase("nuclear_matter");
	public static final Item NUCLEAR_CORE = new ItemBase("nuclear_core");
	
//	public static final ToolMaterial TOOL_PLASTO = EnumHelper
//			.addToolMaterial("tool_plastotextile", 1, 0, 4.5F, 1.0F, 30); 
//	public static final ArmorMaterial ARMOR_PLASTO = EnumHelper
//			.addArmorMaterial("armor_plastotextile", "arcadia:plastotextile", 
//					1000, new int[]{1, 2, 3, 1}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	//tools				
	public static final Item AXE_PLASTO = new ToolAxe("plasto_axe",ModMaterial.TOOL_PLASTO);
	public static final Item HOE_PLASTO = new ToolHoe("plasto_hoe", ModMaterial.TOOL_PLASTO);
	public static final Item PICKAXE_PLASTO = new ToolPickaxe("plasto_pickaxe", ModMaterial.TOOL_PLASTO);
	public static final Item SHOVEL_PLASTO = new ToolShovel("plasto_shovel", ModMaterial.TOOL_PLASTO);
	public static final Item SWORD_PLASTO = new ToolSword("plasto_sword", ModMaterial.TOOL_PLASTO);
	public static final Item NUCLEAR_SHEARS = new NuclearPoweredShears("nuclear_shears");
	
	
}
