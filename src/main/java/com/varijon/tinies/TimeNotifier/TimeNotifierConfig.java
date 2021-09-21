package com.varijon.tinies.TimeNotifier;

import java.util.ArrayList;

public class TimeNotifierConfig 
{
	boolean dawnNotification;
	boolean morningNotification;
	boolean dayNotification;
	boolean middayNotification;
	boolean afternoonNotification;
	boolean duskNotification;
	boolean nightNotification;
	boolean midnightNotification;
	boolean doSound;
	String soundOption;
	
	public TimeNotifierConfig(boolean dawnNotification, boolean morningNotification, boolean dayNotification,
			boolean middayNotification, boolean afternoonNotification, boolean duskNotification, boolean nightNotification,
			boolean midnightNotification, boolean doSound, String soundOption) {
		super();
		this.dawnNotification = dawnNotification;
		this.morningNotification = morningNotification;
		this.dayNotification = dayNotification;
		this.middayNotification = middayNotification;
		this.afternoonNotification = afternoonNotification;
		this.duskNotification = duskNotification;
		this.nightNotification = nightNotification;
		this.midnightNotification = midnightNotification;
		this.doSound = doSound;
		this.soundOption = soundOption;
	}

	public boolean isDawnNotification() {
		return dawnNotification;
	}

	public void setDawnNotification(boolean dawnNotification) {
		this.dawnNotification = dawnNotification;
	}

	public boolean isMorningNotification() {
		return morningNotification;
	}

	public void setMorningNotification(boolean morningNotification) {
		this.morningNotification = morningNotification;
	}

	public boolean isDayNotification() {
		return dayNotification;
	}

	public void setDayNotification(boolean dayNotification) {
		this.dayNotification = dayNotification;
	}

	public boolean isMiddayNotification() {
		return middayNotification;
	}

	public void setMiddayNotification(boolean middayNotification) {
		this.middayNotification = middayNotification;
	}

	public boolean isAfternoonNotification() {
		return afternoonNotification;
	}

	public void setAfternoonNotification(boolean afternoonNotification) {
		this.afternoonNotification = afternoonNotification;
	}

	public boolean isDuskNotification() {
		return duskNotification;
	}

	public void setDuskNotification(boolean duskNotification) {
		this.duskNotification = duskNotification;
	}
	
	public boolean isNightNotification() {
		return nightNotification;
	}

	public void setNightNotification(boolean nightNotification) {
		this.nightNotification = nightNotification;
	}

	public boolean isMidnightNotification() {
		return midnightNotification;
	}

	public void setMidnightNotification(boolean midnightNotification) {
		this.midnightNotification = midnightNotification;
	}

	public boolean isDoSound() {
		return doSound;
	}

	public void setDoSound(boolean doSound) {
		this.doSound = doSound;
	}

	public String getSoundOption() {
		return soundOption;
	}

	public void setSoundOption(String soundOption) {
		this.soundOption = soundOption;
	}

	
	
}
