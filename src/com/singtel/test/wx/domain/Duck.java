package com.singtel.test.wx.domain;

public class Duck extends Bird{

	public Duck() {
		this.setSound("Quack, quack");
	}
	
	@Override
	public boolean canSwim() {
		return true;
	}

	@Override
	public boolean canFly() {
		return false;
	}
}
