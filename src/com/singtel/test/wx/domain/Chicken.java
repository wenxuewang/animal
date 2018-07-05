package com.singtel.test.wx.domain;

public class Chicken extends Bird{

	public Chicken() {
		this.setSound("Cluck, cluck");
	}
	
	//Override Bird, Chicken cannot fly
	@Override
	public boolean canFly() {
		return false;
	}
	
}
