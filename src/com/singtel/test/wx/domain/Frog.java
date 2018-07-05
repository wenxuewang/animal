package com.singtel.test.wx.domain;

public class Frog extends Animal {
	
	public Frog() {
		this.sound = "Meow";
	}
	
  	@Override
	public boolean canSwim() {
		return false;
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
