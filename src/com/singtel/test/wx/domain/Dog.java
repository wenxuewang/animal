package com.singtel.test.wx.domain;

public class Dog extends Animal {
	
	public Dog() {
		this.sound = "Woof, woof";
	}
	
	@Override
	public boolean canSwim() {
		return true;
	}

	@Override
	public boolean canFly() {
		return false;
	}

	@Override
	public boolean canWalk() {
		return true;
	}
}
