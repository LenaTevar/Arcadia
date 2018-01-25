package main.java.pi.arcadia.common.tools;
//https://github.com/Vazkii/Botania/blob/938aab69e5c46d782af3fdb9d647ccd754651853/src/main/java/vazkii/botania/common/item/equipment/tool/elementium/ItemElementiumShears.java#L55
import java.util.List;
import java.util.Random;

import main.java.pi.arcadia.common.Arcadia;
import main.java.pi.arcadia.core.init.ItemInit;
import main.java.pi.arcadia.core.interfaces.IHasModel;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.IShearable;

public class NuclearPoweredShears extends ItemShears implements IHasModel {

	public NuclearPoweredShears(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Arcadia.ArcadiaTab);
		this.setMaxDamage(600);

		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Arcadia.proxy.registerItemRenderer(this, 0, "inventory");

	}

	@Override
	public boolean isDamageable() {
		return false;
	}

	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase entity, EnumHand hand)
	{
		if (entity.world.isRemote)
		{
			return false;
		}
		
		int range = 3;
		AxisAlignedBB  entityBB = new AxisAlignedBB(entity.posX - range, entity.posY - range, entity.posZ - range,entity.posX + range, entity.posY + range, entity.posZ + range);
		List<Entity> shearList = entity.world.getEntitiesWithinAABBExcludingEntity(player, entityBB);
		boolean itworks = false;
		for(Entity target : shearList) {

			if(target instanceof IShearable) {
				IShearable sheepish = (IShearable) target;
				
				if (sheepish.isShearable(itemstack, entity.world, new BlockPos(target))) {
					List<ItemStack> drops = ((IShearable) target).onSheared(itemstack, entity.world, new BlockPos(target),
							EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, itemstack));

					Random rand = new Random();
					for(ItemStack stack : drops)
					{
						EntityItem ent = entity.entityDropItem(stack, 1.0F);
						ent.motionY += rand.nextFloat() * 0.05F;
						ent.motionX += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
						ent.motionZ += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
					}
					itemstack.damageItem(0, entity);
				}
			}
			
			
			itworks = true;
		}
		return itworks;
		
	}


}
