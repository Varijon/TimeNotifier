package com.varijon.tinies.TimeNotifier;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TimeNotifierConfigManager 
{
	static TimeNotifierConfig timeNotifierConfig;
	
	
	public static boolean loadConfiguration()
	{
		String basefolder = new File("").getAbsolutePath();
        String source = basefolder + "/config/TimeNotifierConfig/";
		try
		{
			Gson gson = new Gson();
			
			File dir = new File(source);
			if(!dir.exists())
			{
				dir.mkdirs();
			}
			
			writeConfigFile();
			
			for(File file : dir.listFiles())
			{
				if(!file.getName().equals("config.json"))
				{
					continue;
				}
				FileReader reader = new FileReader(file);
				
				TimeNotifierConfig timeNotifierConfig = gson.fromJson(reader, TimeNotifierConfig.class);
								
				TimeNotifierConfigManager.timeNotifierConfig = timeNotifierConfig;
				reader.close();
			}
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
	
	public static void writeConfigFile()
	{
		String basefolder = new File("").getAbsolutePath();
        String source = basefolder + "/config/TimeNotifierConfig/";
		
		try
		{
			File dir = new File(source);
			if(!dir.exists())
			{
				dir.mkdirs();
			}
			if(dir.listFiles().length == 0)
			{
								
				TimeNotifierConfig timeNotifierConfig = new TimeNotifierConfig(false, false, false, false, false, false, false, false, true, "chime");
		
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
					
				FileWriter writer = new FileWriter(source + "/config.json");
				gson.toJson(timeNotifierConfig, writer);
				writer.close();
			}
		}
			
		catch (Exception ex) 
		{
		    ex.printStackTrace();
		}
	}
	
	
	public static void writeToConfig()
	{
		String basefolder = new File("").getAbsolutePath();
        String source = basefolder + "/config/TimeNotifierConfig/";
		
		try
		{
			File dir = new File(source);
			if(!dir.exists())
			{
				dir.mkdirs();
			}
			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			FileWriter writer = new FileWriter(source + "/config.json");
			gson.toJson(timeNotifierConfig, writer);
			writer.close();
		}
			
		catch (Exception ex) 
		{
		    ex.printStackTrace();
		}
	}

	public static TimeNotifierConfig getConfig()
	{
		return timeNotifierConfig;
	}
	
}
