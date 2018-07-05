package com.singtel.test.wx.domain;

public class Butterfly extends Animal {
	
	public Butterfly() {
		this.sound = null;
	}
	
	//butterfly cannot swim
	@Override 
	public boolean canSwim() {
		return false;
	}

	//butterfly can fly
	@Override
	public boolean canFly() {
		return true;
	}

	//butterfly can walk
	@Override
	public boolean canWalk() {
		return true;
	}
}
