package com.seffers122.letsmodreboot;
import com.seffers122.letsmodreboot.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid="LetsModReboot", name="Lets Mod Reboot", version="1.0")
public class LetsModReboot 
{
	@Mod.Instance("LetsModReboot")
	public static LetsModReboot instance;
	@SidedProxy()
	public static IProxy proxy;
	@Mod.EventHandler
	public void preInit(FMLPostInitializationEvent event)
	{
		
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
