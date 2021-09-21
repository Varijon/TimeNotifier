package com.varijon.tinies.TimeNotifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.IClientCommand;

public class TimeNotifierCommand extends CommandBase implements IClientCommand  {

	private List aliases;
	
	public TimeNotifierCommand()
	{
	   this.aliases = new ArrayList();
	   this.aliases.add("timenotify");
	}
	
	@Override
	public int compareTo(ICommand arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "timenotify";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "timenotify";
	}

	@Override
	public List<String> getAliases() {
		// TODO Auto-generated method stub
		return this.aliases;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		EntityPlayer player = (EntityPlayer) sender;
		if(args.length == 0)
		{
			player.sendMessage(new TextComponentString(TextFormatting.RED + "Usage: /timenotify <daysection>"));
			player.sendMessage(new TextComponentString(TextFormatting.RED + "Options: dawn|morning|day|midday|afternoon|dusk|night|midnight"));
			return;
		}
		if(args.length > 0)
		{
			if(args[0].equals("dawn"))
			{
				if(TimeNotifierConfigManager.getConfig().dawnNotification)
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Dawn notification disabled"));
					TimeNotifierConfigManager.getConfig().dawnNotification = false;	
				}
				else
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Dawn notification enabled"));
					TimeNotifierConfigManager.getConfig().dawnNotification = true;					
				}
				TimeNotifierConfigManager.writeToConfig();
				return;
			}
			if(args[0].equals("morning"))
			{
				if(TimeNotifierConfigManager.getConfig().morningNotification)
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Morning notification disabled"));
					TimeNotifierConfigManager.getConfig().morningNotification = false;	
				}
				else
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Morning notification enabled"));
					TimeNotifierConfigManager.getConfig().morningNotification = true;					
				}
				TimeNotifierConfigManager.writeToConfig();
				return;
			}
			if(args[0].equals("day"))
			{
				if(TimeNotifierConfigManager.getConfig().dayNotification)
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Day notification disabled"));
					TimeNotifierConfigManager.getConfig().dayNotification = false;	
				}
				else
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Day notification enabled"));
					TimeNotifierConfigManager.getConfig().dayNotification = true;					
				}
				TimeNotifierConfigManager.writeToConfig();
				return;
			}
			if(args[0].equals("midday"))
			{
				if(TimeNotifierConfigManager.getConfig().middayNotification)
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Midday notification disabled"));
					TimeNotifierConfigManager.getConfig().middayNotification = false;	
				}
				else
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Midday notification enabled"));
					TimeNotifierConfigManager.getConfig().middayNotification = true;					
				}
				TimeNotifierConfigManager.writeToConfig();
				return;
			}
			if(args[0].equals("afternoon"))
			{
				if(TimeNotifierConfigManager.getConfig().afternoonNotification)
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Afternoon notification disabled"));
					TimeNotifierConfigManager.getConfig().afternoonNotification = false;	
				}
				else
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Afternoon notification enabled"));
					TimeNotifierConfigManager.getConfig().afternoonNotification = true;					
				}
				TimeNotifierConfigManager.writeToConfig();
				return;
			}
			if(args[0].equals("dusk"))
			{
				if(TimeNotifierConfigManager.getConfig().duskNotification)
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Dusk notification disabled"));
					TimeNotifierConfigManager.getConfig().duskNotification = false;	
				}
				else
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Dusk notification enabled"));
					TimeNotifierConfigManager.getConfig().duskNotification = true;					
				}
				TimeNotifierConfigManager.writeToConfig();
				return;
			}
			if(args[0].equals("night"))
			{
				if(TimeNotifierConfigManager.getConfig().nightNotification)
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Night notification disabled"));
					TimeNotifierConfigManager.getConfig().nightNotification = false;	
				}
				else
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Night notification enabled"));
					TimeNotifierConfigManager.getConfig().nightNotification = true;					
				}
				TimeNotifierConfigManager.writeToConfig();
				return;
			}
			if(args[0].equals("midnight"))
			{
				if(TimeNotifierConfigManager.getConfig().midnightNotification)
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Midnight notification disabled"));
					TimeNotifierConfigManager.getConfig().midnightNotification = false;	
				}
				else
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Midnight notification enabled"));
					TimeNotifierConfigManager.getConfig().midnightNotification = true;					
				}
				TimeNotifierConfigManager.writeToConfig();
				return;
			}
			if(args[0].equals("sound"))
			{
				if(TimeNotifierConfigManager.getConfig().doSound)
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Sound notification disabled"));
					TimeNotifierConfigManager.getConfig().doSound = false;	
				}
				else
				{
					player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Sound notification enabled"));
					TimeNotifierConfigManager.getConfig().doSound = true;					
				}
				TimeNotifierConfigManager.writeToConfig();
				return;
			}
			if(args[0].equals("setsound"))
			{
				if(args.length != 2)
				{
					player.sendMessage(new TextComponentString(TextFormatting.RED + "Usage: /timenotify setsound soundname"));
					player.sendMessage(new TextComponentString(TextFormatting.RED + "Options: chime|harp|meow|fireworks|creeper"));	
					return;
				}
				if(!checkValidSound(args[1]))
				{
					player.sendMessage(new TextComponentString(TextFormatting.RED + "Usage: /timenotify setsound soundname"));
					player.sendMessage(new TextComponentString(TextFormatting.RED + "Options: chime|harp|meow|fireworks|creeper"));
					return;
				}
				TimeNotifierConfigManager.getConfig().soundOption = args[1];
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Sound set to " + TextFormatting.GOLD + args[1]));
				TimeNotifierConfigManager.writeToConfig();
				return;
			}
			if(args[0].equals("info"))
			{
				player.sendMessage(new TextComponentString(TextFormatting.YELLOW + "Time Notification Settings:"));
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Dawn notification: " + TextFormatting.GOLD + TimeNotifierConfigManager.getConfig().dawnNotification));
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Morning notification: " + TextFormatting.GOLD + TimeNotifierConfigManager.getConfig().morningNotification));
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Day notification: " + TextFormatting.GOLD + TimeNotifierConfigManager.getConfig().dayNotification));
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Midday notification: " + TextFormatting.GOLD + TimeNotifierConfigManager.getConfig().middayNotification));
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Afternoon notification: " + TextFormatting.GOLD + TimeNotifierConfigManager.getConfig().afternoonNotification));
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Dusk notification: " + TextFormatting.GOLD + TimeNotifierConfigManager.getConfig().duskNotification));
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Night notification: " + TextFormatting.GOLD + TimeNotifierConfigManager.getConfig().nightNotification));
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Midnight notification: " + TextFormatting.GOLD + TimeNotifierConfigManager.getConfig().midnightNotification));
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Sound notification: " + TextFormatting.GOLD + TimeNotifierConfigManager.getConfig().doSound));
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Sound: " + TextFormatting.GOLD + TimeNotifierConfigManager.getConfig().getSoundOption()));
				return;
			}
			player.sendMessage(new TextComponentString(TextFormatting.RED + "Usage: /timenotify <daysection>"));
			player.sendMessage(new TextComponentString(TextFormatting.RED + "Options: dawn|morning|day|midday|afternoon|dusk|night|midnight"));
			player.sendMessage(new TextComponentString(TextFormatting.RED + "Other options: time|sound|setsound"));
			return;
			
		}
		
	    return;
	}
	
	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) 
	{
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean allowUsageWithoutPrefix(ICommandSender sender, String message) {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos pos) 
	{
		if(args.length == 1)
		{
			ArrayList<String> lstTabComplete = new ArrayList<>();
			lstTabComplete.add("dawn");
			lstTabComplete.add("morning");
			lstTabComplete.add("day");
			lstTabComplete.add("midday");
			lstTabComplete.add("afternoon");
			lstTabComplete.add("dusk");
			lstTabComplete.add("night");
			lstTabComplete.add("midnight");
			lstTabComplete.add("info");
			lstTabComplete.add("sound");
			lstTabComplete.add("setsound");

			return CommandBase.getListOfStringsMatchingLastWord(args, lstTabComplete);
		}
		if(args.length == 2)
		{
			ArrayList<String> lstTabComplete = new ArrayList<>();
			lstTabComplete.add("chime");
			lstTabComplete.add("harp");
			lstTabComplete.add("meow");
			lstTabComplete.add("fireworks");
			lstTabComplete.add("creeper");

			return CommandBase.getListOfStringsMatchingLastWord(args, lstTabComplete);
		}
		
		return Collections.emptyList();
	}
	
	private boolean checkValidSound(String soundOption)
	{
		boolean isValid = false;
		switch(soundOption)
		{
			case("chime"):
				isValid = true;
				break;
			case("harp"):
				isValid = true;
				break;
			case("meow"):
				isValid = true;
				break;
			case("fireworks"):
				isValid = true;
				break;
			case("creeper"):
				isValid = true;
				break;
		}
		return isValid;
	}
}
