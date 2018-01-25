package main.java.pi.arcadia.core.lib;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterial {
	public ModMaterial() {
		
	}
	/* -addToolMaterial(String name, int harvestLevel, int maxUses, 
	 * float efficiency, float damage, int enchantability)
	 * 
	 * .addArmorMaterial(String name, String textureName, int durability, int[] reductionAmounts, 
	 * int enchantability, SoundEvent soundOnEquip, float toughness)
	 * */
	public static final ToolMaterial TOOL_PLASTO = EnumHelper
			.addToolMaterial("tool_plastotextile", 1, 0, 4.5F, 1.0F, 30); 
	
	public static final ArmorMaterial ARMOR_PLASTO = EnumHelper
			.addArmorMaterial("armor_plastotextile", "arcadia:plastotextile", 
					0, new int[]{1, 2, 3, 1}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static final ArmorMaterial ARMOR_PLASTO_TIER2 = EnumHelper
			.addArmorMaterial("armor_plastotextile", "arcadia:plastotextile_tier2", 
					0, new int[]{2, 3, 4, 2}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1.0F);
	public static final ArmorMaterial ARMOR_PLASTO_TIER3 = EnumHelper
			.addArmorMaterial("armor_plastotextile", "arcadia:plastotextile", 
					0, new int[]{3, 4, 5, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2.0F);
}
