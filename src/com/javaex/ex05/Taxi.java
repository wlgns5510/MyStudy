package com.javaex.ex05;

public class Taxi implements Meter {

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public int stop(int distance) {
		// TODO Auto-generated method stub
		return distance = distance * 2;
	}

}
