package main.java.pi.arcadia.common.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import main.java.pi.arcadia.common.Arcadia;
import main.java.pi.arcadia.core.init.ItemInit;
import main.java.pi.arcadia.core.interfaces.IHasModel;
import main.java.pi.arcadia.core.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

/*
 * OMG WTF is wrong with minecraft and axes!!
 * The logical thing would be to use ItemAxe but no, NO! RUN!
 * */
public class ToolAxe extends ItemTool implements IHasModel {

	private static final Set<Block> EFFECTIVE_ON = Sets
			.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, 
					Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, 
					Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

    public ToolAxe(String name, ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        setUnlocalizedName(Reference.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(Arcadia.ArcadiaTab);
        
        ItemInit.ITEMS.add(this);
    }
    

    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state): this.efficiency;
    }

    @Override
	public void registerModels() 
	{
		Arcadia.proxy.registerItemRenderer(this, 0, "inventory");
	}
} 
