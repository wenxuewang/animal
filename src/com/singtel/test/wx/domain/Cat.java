package com.singtel.test.wx.domain;

public class Cat extends Animal {
	
	public Cat() {
		this.sound = "Meow";
	}
	
	//Cat cannot swim
  	@Override
	public boolean canSwim() {
		return false;
	}

	//Cat cannot fly
	@Override
	public boolean canFly() {
		return false;
	}

	//Cat can walk
	@Override
	public boolean canWalk() {
		return true;
	}
}
