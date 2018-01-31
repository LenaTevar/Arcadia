package main.java.pi.arcadia.core.handler;

import java.util.ArrayList;
import java.util.List;

import main.java.pi.arcadia.core.init.BlockInit;

/*
 * Future confused Lena, here you have. https://youtu.be/42z8_UDLmk4
 * */


import main.java.pi.arcadia.core.init.ItemInit;
import main.java.pi.arcadia.core.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@EventBusSubscriber
public class RegistryHandler {

	//REFACT
	public static final List <Item> ITEMS = new ArrayList<Item>();
	public static final List <Block> BLOCKS = new ArrayList<Block>();
	public static ItemInit modItems = new ItemInit();
	public static BlockInit modBlocks = new BlockInit();

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		//event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));

		ITEMS.stream().forEach(a-> event.getRegistry().register(a));
		

	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		BLOCKS.stream().forEach(b->event.getRegistry().register(b));
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		ITEMS.stream().filter(target-> target instanceof IHasModel)
		.forEach(target->((IHasModel)target).registerModels());


		BLOCKS.stream().filter(target-> target instanceof IHasModel)
		.forEach(target->((IHasModel)target).registerModels());


	}

}
