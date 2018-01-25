package main.java.pi.arcadia.core.lib;

import main.java.pi.arcadia.common.armor.ArmorBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class libArmor {

	public static final Item HELMET_PLASTO = new ArmorBase("plasto_helmet", ModMaterial.ARMOR_PLASTO, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_PLASTO = new ArmorBase("plasto_chestplate", ModMaterial.ARMOR_PLASTO, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINS_PLASTO = new ArmorBase("plasto_leggins", ModMaterial.ARMOR_PLASTO, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_PLASTO = new ArmorBase("plasto_boots", ModMaterial.ARMOR_PLASTO, 1, EntityEquipmentSlot.FEET);

	public static final Item HELMET_PLASTO_TIER2 = new ArmorBase("plasto_helmet_tier2", ModMaterial.ARMOR_PLASTO_TIER2, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_PLASTO_TIER2 = new ArmorBase("plasto_chestplate_tier2", ModMaterial.ARMOR_PLASTO_TIER2, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINS_PLASTO_TIER2 = new ArmorBase("plasto_leggins_tier2", ModMaterial.ARMOR_PLASTO_TIER2, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_PLASTO_TIER2 = new ArmorBase("plasto_boots_tier2", ModMaterial.ARMOR_PLASTO_TIER2, 1, EntityEquipmentSlot.FEET);

}
