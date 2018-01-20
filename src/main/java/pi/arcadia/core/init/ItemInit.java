package main.java.pi.arcadia.core.init;

import java.util.ArrayList;
import java.util.List;

import main.java.pi.arcadia.common.armor.ArmorBase;
import main.java.pi.arcadia.common.item.ItemBase;
import main.java.pi.arcadia.common.tools.ToolAxe;
import main.java.pi.arcadia.common.tools.ToolHoe;
import main.java.pi.arcadia.common.tools.ToolPickaxe;
import main.java.pi.arcadia.common.tools.ToolShovel;
import main.java.pi.arcadia.common.tools.ToolSword;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {

	
	public static final List <Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final Item PLASTOTEXTILE = new ItemBase("plastotextile");
	public static final Item NUCLEAR_MATTER = new ItemBase("nuclear_matter");
	public static final Item NUCLEAR_CORE = new ItemBase("nuclear_core");
	
	public static final ToolMaterial TOOL_PLASTO = EnumHelper
			.addToolMaterial("tool_plastotextile", 1, 0, 100.0F, 1.0F, 30); 
	public static final ArmorMaterial ARMOR_PLASTO = EnumHelper
			.addArmorMaterial("armor_plastotextile", "arcadia:plastotextile", 
					1000, new int[]{1, 2, 3, 1}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	//tools				
	public static final Item AXE_PLASTO = new ToolAxe("plasto_axe",TOOL_PLASTO);
	public static final Item HOE_PLASTO = new ToolHoe("plasto_hoe", TOOL_PLASTO);
	public static final Item PICKAXE_PLASTO = new ToolPickaxe("plasto_pickaxe", TOOL_PLASTO);
	public static final Item SHOVEL_PLASTO = new ToolShovel("plasto_shovel", TOOL_PLASTO);
	public static final Item SWORD_PLASTO = new ToolSword("plasto_sword", TOOL_PLASTO);
	
	//armor
	public static final Item HELMET_PLASTO = new ArmorBase("plasto_helmet", ARMOR_PLASTO, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_PLASTO = new ArmorBase("plasto_chestplate", ARMOR_PLASTO, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINS_PLASTO = new ArmorBase("plasto_leggins", ARMOR_PLASTO, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_PLASTO = new ArmorBase("plasto_boots", ARMOR_PLASTO, 1, EntityEquipmentSlot.FEET);
	
}
