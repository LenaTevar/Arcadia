package main.java.pi.arcadia.core.init;

import java.util.ArrayList;
import java.util.List;

import main.java.pi.arcadia.common.armor.ArmorBase;
import main.java.pi.arcadia.common.item.ItemBase;
import main.java.pi.arcadia.common.tools.NuclearPoweredShears;
import main.java.pi.arcadia.common.tools.ToolAxe;
import main.java.pi.arcadia.common.tools.ToolHoe;
import main.java.pi.arcadia.common.tools.ToolPickaxe;
import main.java.pi.arcadia.common.tools.ToolShovel;
import main.java.pi.arcadia.common.tools.ToolSword;
import main.java.pi.arcadia.core.handler.RegistryHandler;
import main.java.pi.arcadia.core.lib.ModMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class ItemInit {
	public ItemInit() {
		this.init();
	}

	public static final List <Item> ITEMS = new ArrayList<Item>();

	//	//Old libraries
	//	public static final libArmor MOD_ARMORS = new libArmor();
	//	public static final libItems MOD_ITEMS = new libItems();
	//	public static final libTools MOD_TOOLS = new libTools();
	//	

	//Items
	public static final Item PLASTOTEXTILE = new ItemBase("plastotextile");
	public static final Item NUCLEAR_MATTER = new ItemBase("nuclear_matter");
	public static final Item NUCLEAR_CORE = new ItemBase("nuclear_core");
	//tools				
	public static final Item AXE_PLASTO = new ToolAxe("plasto_axe",ModMaterial.TOOL_PLASTO);
	public static final Item HOE_PLASTO = new ToolHoe("plasto_hoe", ModMaterial.TOOL_PLASTO);
	public static final Item PICKAXE_PLASTO = new ToolPickaxe("plasto_pickaxe", ModMaterial.TOOL_PLASTO);
	public static final Item SHOVEL_PLASTO = new ToolShovel("plasto_shovel", ModMaterial.TOOL_PLASTO);
	public static final Item SWORD_PLASTO = new ToolSword("plasto_sword", ModMaterial.TOOL_PLASTO);
	public static final Item NUCLEAR_SHEARS = new NuclearPoweredShears("nuclear_shears");

	public static final Item HELMET_PLASTO = new ArmorBase("plasto_helmet", ModMaterial.ARMOR_PLASTO, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_PLASTO = new ArmorBase("plasto_chestplate", ModMaterial.ARMOR_PLASTO, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINS_PLASTO = new ArmorBase("plasto_leggins", ModMaterial.ARMOR_PLASTO, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_PLASTO = new ArmorBase("plasto_boots", ModMaterial.ARMOR_PLASTO, 1, EntityEquipmentSlot.FEET);

	public static final Item HELMET_PLASTO_TIER2 = new ArmorBase("plasto_helmet_tier2", ModMaterial.ARMOR_PLASTO_TIER2, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_PLASTO_TIER2 = new ArmorBase("plasto_chestplate_tier2", ModMaterial.ARMOR_PLASTO_TIER2, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINS_PLASTO_TIER2 = new ArmorBase("plasto_leggins_tier2", ModMaterial.ARMOR_PLASTO_TIER2, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_PLASTO_TIER2 = new ArmorBase("plasto_boots_tier2", ModMaterial.ARMOR_PLASTO_TIER2, 1, EntityEquipmentSlot.FEET);
	
	//public static final Item FORCE_FIELD_BELT = new ItemBase("force_field_belt");


	public void register(Item item) {
		RegistryHandler.ITEMS.add(item);
	}

	public void init() {
		register(PLASTOTEXTILE);
		register(NUCLEAR_MATTER);
		register(NUCLEAR_CORE);
		
		register(AXE_PLASTO);
		register(HOE_PLASTO);
		register(PICKAXE_PLASTO);
		register(SHOVEL_PLASTO);
		register(SWORD_PLASTO);
		register(NUCLEAR_SHEARS);
		
		register(HELMET_PLASTO);
		register(CHESTPLATE_PLASTO);
		register(LEGGINS_PLASTO);
		register(BOOTS_PLASTO);
		
		register(HELMET_PLASTO_TIER2);
		register(CHESTPLATE_PLASTO_TIER2);
		register(LEGGINS_PLASTO_TIER2);
		register(BOOTS_PLASTO_TIER2);
	}

}
