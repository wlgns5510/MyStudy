package com.javaex.ex04;

public class LedExam {

	public static void main(String[] args) {
		TV tv = new LedTV();
		tv.turnOn();
		tv.changChannel(8);
		tv.changVolume(39);
		tv.turnOff();

	}

}
