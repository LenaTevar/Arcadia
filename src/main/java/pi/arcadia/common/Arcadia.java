package main.java.pi.arcadia.common;

import main.java.pi.arcadia.common.lib.Reference;
import main.java.pi.arcadia.common.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;




/*
 *Botania main doc (Yeap, I'm constaly reading the code from vazkii... it's beautiful, what can I say.
 *https://github.com/Vazkii/Botania/blob/master/src/main/java/vazkii/botania/common/Botania.java
 *
 *https://youtu.be/bS0TmBNKguc
 * */


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Arcadia {
	
	@Instance
	public static Arcadia instance1;

	
	@SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
	
	
}
