package com.varijon.tinies.TimeNotifier;


import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandTime;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class TimeNotifierHandler 
{
	boolean doDawnStartNotify = true;
	boolean doMorningStartNotify = true;
	boolean doDayStartNotify = true;
	boolean doMiddayStartNotify = true;
	boolean doAfternoonStartNotify = true;
	boolean doDuskStartNotify = true;
	boolean doNightStartNotify = true;
	boolean doMidnightStartNotify = true;
	
	boolean doDawnEndNotify = false;
	boolean doMorningEndNotify = false;
	boolean doDayEndNotify = false;
	boolean doMiddayEndNotify = false;
	boolean doAfternoonEndNotify = false;
	boolean doDuskEndNotify = false;
	boolean doNightEndNotify = false;
	boolean doMidnightEndNotify = false;
	public TimeNotifierHandler()
	{
	}

	@SubscribeEvent
	public void onWorldTick (ClientTickEvent event)
	{
		try
		{
			if(Minecraft.getMinecraft().player == null)
			{
				return;
			}
			if(Minecraft.getMinecraft().player.getEntityWorld() == null)
			{
				return;
			}
			EntityPlayer player = Minecraft.getMinecraft().player;
			long timeTick = Minecraft.getMinecraft().player.getEntityWorld().getWorldInfo().getWorldTime()%24000; 
			if((timeTick > 22500 && timeTick <= 24000) || (timeTick >= 0 && timeTick < 300))
			{
				if(TimeNotifierConfigManager.getConfig().dawnNotification)
				{
					if(doDawnStartNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Dawn has started! ---"));
						doDawnStartNotify = false;
						doDawnEndNotify = true;
					}
				}
			}
			else
			{
				if(TimeNotifierConfigManager.getConfig().dawnNotification)
				{
					if(doDawnEndNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Dawn has ended! ---"));
						doDawnStartNotify = true;
						doDawnEndNotify = false;
					}
				}
			}
			if((timeTick > 22500 && timeTick <= 24000) || (timeTick >= 0 && timeTick < 6000))
			{
				if(TimeNotifierConfigManager.getConfig().morningNotification)
				{
					if(doMorningStartNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "---Morning has started! ---"));
						doMorningStartNotify = false;
						doMorningEndNotify = true;
					}
				}
			}
			else
			{
				if(TimeNotifierConfigManager.getConfig().morningNotification)
				{
					if(doMorningEndNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Morning has ended! ---"));
						doMorningStartNotify = true;
						doMorningEndNotify = false;
					}
				}
			}
			if((timeTick > 0 && timeTick < 12000))
			{
				if(TimeNotifierConfigManager.getConfig().dayNotification)
				{
					if(doDayStartNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Day has started! ---"));
						doDayStartNotify = false;
						doDayEndNotify = true;
					}
				}
			}
			else
			{
				if(TimeNotifierConfigManager.getConfig().dayNotification)
				{
					if(doDayEndNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Day has ended! ---"));
						doDayStartNotify = true;
						doDayEndNotify = false;
					}
				}
			}
			if((timeTick > 5500 && timeTick < 6500))
			{
				if(TimeNotifierConfigManager.getConfig().middayNotification)
				{
					if(doMiddayStartNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Midday has started! ---"));
						doMiddayStartNotify = false;
						doMiddayEndNotify = true;
					}
				}
			}
			else
			{
				if(TimeNotifierConfigManager.getConfig().middayNotification)
				{
					if(doMiddayEndNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Midday has ended! ---"));
						doMiddayStartNotify = true;
						doMiddayEndNotify = false;
					}
				}
			}
			if((timeTick > 6000 && timeTick < 12000))
			{
				if(TimeNotifierConfigManager.getConfig().afternoonNotification)
				{
					if(doAfternoonStartNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Afternoon has started! ---"));
						doAfternoonStartNotify = false;
						doAfternoonEndNotify = true;
					}
				}
			}
			else
			{
				if(TimeNotifierConfigManager.getConfig().afternoonNotification)
				{
					if(doAfternoonEndNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Afternoon has ended! ---"));
						doAfternoonStartNotify = true;
						doAfternoonEndNotify = false;
					}
				}
			}
			if((timeTick > 12000 && timeTick < 13800))
			{
				if(TimeNotifierConfigManager.getConfig().duskNotification)
				{
					if(doDuskStartNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Dusk has started! ---"));
						doDuskStartNotify = false;
						doDuskEndNotify = true;
					}
				}
			}
			else
			{
				if(TimeNotifierConfigManager.getConfig().duskNotification)
				{
					if(doDuskEndNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Dusk has ended! ---"));
						doDuskStartNotify = true;
						doDuskEndNotify = false;
					}
				}
			}
			if((timeTick > 13450 && timeTick < 22550))
			{
				if(TimeNotifierConfigManager.getConfig().nightNotification)
				{
					if(doNightStartNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Night has started! ---"));
						doNightStartNotify = false;
						doNightEndNotify = true;
					}
				}
			}
			else
			{
				if(TimeNotifierConfigManager.getConfig().nightNotification)
				{
					if(doNightEndNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Night has ended! ---"));
						doNightStartNotify = true;
						doNightEndNotify = false;
					}
				}
			}
			if((timeTick > 17500 && timeTick < 18500))
			{
				if(TimeNotifierConfigManager.getConfig().midnightNotification)
				{
					if(doMidnightStartNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Midnight has started! ---"));
						doMidnightStartNotify = false;
						doMidnightEndNotify = true;
					}
				}
			}
			else
			{
				if(TimeNotifierConfigManager.getConfig().midnightNotification)
				{
					if(doMidnightEndNotify)
					{
						if(TimeNotifierConfigManager.getConfig().doSound)
						{
							doSound(player);						
						}
						player.sendMessage(new TextComponentString(TextFormatting.GOLD + "--- Midnight has ended! ---"));
						doMidnightStartNotify = true;
						doMidnightEndNotify = false;
					}
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	private void doSound(EntityPlayer player)
	{
		if(TimeNotifierConfigManager.getConfig().getSoundOption().equals("chime"))
		{
			player.playSound(SoundEvents.BLOCK_NOTE_CHIME, 0.5f, 0.2f);	
		}
		if(TimeNotifierConfigManager.getConfig().getSoundOption().equals("harp"))
		{
			player.playSound(SoundEvents.BLOCK_NOTE_HARP, 0.5f, 0.5f);	
		}
		if(TimeNotifierConfigManager.getConfig().getSoundOption().equals("meow"))
		{
			player.playSound(SoundEvents.ENTITY_CAT_AMBIENT, 0.5f, 1f);	
		}
		if(TimeNotifierConfigManager.getConfig().getSoundOption().equals("fireworks"))
		{
			player.playSound(SoundEvents.ENTITY_FIREWORK_BLAST, 0.5f, 1f);	
		}
		if(TimeNotifierConfigManager.getConfig().getSoundOption().equals("creeper"))
		{
			player.playSound(SoundEvents.ENTITY_CREEPER_PRIMED, 1f, 1f);	
		}
	}
}
