package main.java.pi.arcadia.core.init;

import java.util.ArrayList;
import java.util.List;

import main.java.pi.arcadia.common.armor.ArmorBase;
import main.java.pi.arcadia.common.baubles.BeltBaubles;
import main.java.pi.arcadia.common.baubles.HeadBaubles;
import main.java.pi.arcadia.common.item.ArcadiaGuide;
import main.java.pi.arcadia.common.item.ItemBase;
import main.java.pi.arcadia.common.item.Tablet;
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

	//Items
	public static final Item PLASTOTEXTILE = new ItemBase("plastotextile");
	public static final Item NUCLEAR_MATTER = new ItemBase("nuclear_matter");
	public static final Item NUCLEAR_CORE = new ItemBase("nuclear_core");
	public static final Item CALCULATOR_POD = new Tablet("calculator_pod");
	public static final Item TICKET = new ItemBase("directional_ticket");
	public static final Item GUIDE = new ArcadiaGuide("arcadia_guide");
	
	//tools				
	public static final Item AXE_PLASTO = new ToolAxe("plasto_axe",ModMaterial.TOOL_PLASTO);
	public static final Item HOE_PLASTO = new ToolHoe("plasto_hoe", ModMaterial.TOOL_PLASTO);
	public static final Item PICKAXE_PLASTO = new ToolPickaxe("plasto_pickaxe", ModMaterial.TOOL_PLASTO);
	public static final Item SHOVEL_PLASTO = new ToolShovel("plasto_shovel", ModMaterial.TOOL_PLASTO);
	public static final Item SWORD_PLASTO = new ToolSword("plasto_sword", ModMaterial.TOOL_PLASTO);
	public static final Item NUCLEAR_SHEARS = new NuclearPoweredShears("nuclear_shears");

	//Armour
	public static final Item HELMET_PLASTO = new ArmorBase("plasto_helmet", ModMaterial.ARMOR_PLASTO, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_PLASTO = new ArmorBase("plasto_chestplate", ModMaterial.ARMOR_PLASTO, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINS_PLASTO = new ArmorBase("plasto_leggins", ModMaterial.ARMOR_PLASTO, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_PLASTO = new ArmorBase("plasto_boots", ModMaterial.ARMOR_PLASTO, 1, EntityEquipmentSlot.FEET);

	public static final Item HELMET_REINFORCED = new ArmorBase("reinforced_helmet", ModMaterial.ARMOR_REINFORCED, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_REINFORCED = new ArmorBase("reinforced_chestplate", ModMaterial.ARMOR_REINFORCED, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINS_REINFORCED = new ArmorBase("reinforced_legs", ModMaterial.ARMOR_REINFORCED, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_REINFORCED = new ArmorBase("reinforced_boots", ModMaterial.ARMOR_REINFORCED, 1, EntityEquipmentSlot.FEET);
	
	public static final Item HELMET_NUCLEAR = new ArmorBase("nuclear_helmet", ModMaterial.ARMOR_NUCLEAR, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_NUCLEAR = new ArmorBase("nuclear_chestplate", ModMaterial.ARMOR_NUCLEAR, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINS_NUCLEAR = new ArmorBase("nuclear_legs", ModMaterial.ARMOR_NUCLEAR, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_NUCLEAR = new ArmorBase("nuclear_boots", ModMaterial.ARMOR_NUCLEAR, 1, EntityEquipmentSlot.FEET);
	
	//baubles
	public static final Item PFF_BELT = new BeltBaubles("force_field_belt");
	public static final Item BABEL_FISH = new HeadBaubles("babel_fish");
	
	public void register(Item item) {
		RegistryHandler.ITEMS.add(item);
	}

	public void init() {
		register(PLASTOTEXTILE);
		register(NUCLEAR_MATTER);
		register(NUCLEAR_CORE);
		register(CALCULATOR_POD);
		register(TICKET);
		register(GUIDE);
		
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
		
		register(HELMET_REINFORCED);
		register(BOOTS_REINFORCED);
		register(CHESTPLATE_REINFORCED);
		register(LEGGINS_REINFORCED);
		
		register(BOOTS_NUCLEAR);
		register(CHESTPLATE_NUCLEAR);
		register(HELMET_NUCLEAR);
		register(LEGGINS_NUCLEAR);
		
		register(PFF_BELT);
		register(BABEL_FISH);
	}

}
