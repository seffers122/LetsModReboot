package com.seffers122.letsmodreboot.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class configHandler 
{
	public static Configuration configuration;
	
	public static void init(File configFile){
		Configuration configuration = new Configuration(configFile);
		boolean configValue=false;
		try
		{
			configuration.load();
			configValue=configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example of a config value").getBoolean(true);
			
					
		}
		catch (Exception e)
		{
		}
		finally
		{
			if(configuration.hasChanged())
			configuration.save();
		}
		System.out.println("Configuration test: " + configValue);
	}
}
