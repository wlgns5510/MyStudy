package com.javaex.ex04;

public interface TV {
	public int MIN_VOLUME=0;
	public int MAX_VOLUME=100;
	
	
	public void turnOn();
	public void turnOff();
	public void changVolume(int volume);
	public void changChannel(int channel);
}
