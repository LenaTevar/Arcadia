package main.java.pi.arcadia.common.item;

import main.java.pi.arcadia.common.Arcadia;
import main.java.pi.arcadia.core.interfaces.IHasModel;
import main.java.pi.arcadia.core.lib.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ArcadiaGuide  extends Item implements IHasModel {

	
	public ArcadiaGuide(String name) {

		setUnlocalizedName(Reference.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(Arcadia.ArcadiaTab);
		setMaxStackSize(1);
	}
	/**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
    	Arcadia.proxy.drawArcadiaGuide();
    	return super.onItemRightClick(worldIn, playerIn, handIn);
    }
    
    
	@Override
	public void registerModels() {
		Arcadia.proxy.registerItemRenderer(this, 0, "inventory");		
	}

}
