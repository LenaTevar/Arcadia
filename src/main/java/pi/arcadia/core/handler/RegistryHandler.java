package main.java.pi.arcadia.core.handler;

/*
 * Future confused Lena, here you have. https://youtu.be/42z8_UDLmk4
 * */

import main.java.pi.arcadia.common.item.ItemInit;
import main.java.pi.arcadia.core.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		//register all the items inside items
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	//
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		//register all the items inside items
		
		for (Item item : ItemInit.ITEMS) {
			if (item instanceof IHasModel) {
				((IHasModel)item).registerModels();	
			}
		}
	}
	
	
}
