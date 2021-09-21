package com.varijon.tinies.TimeNotifier;


import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid="timenotifier", version="1.0.0", acceptableRemoteVersions="*")
public class TimeNotifier
{
	public static String MODID = "modid";
	public static String VERSION = "version";

		
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{

	}
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		ClientCommandHandler.instance.registerCommand(new TimeNotifierCommand());
		MinecraftForge.EVENT_BUS.register(new TimeNotifierHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		TimeNotifierConfigManager.loadConfiguration();
	}

}