package com.singtel.test.wx.domain;

public class Fish extends Animal {
	
	public Fish() {
		this.sound = null;
	}
	
	//Fish can swim
	@Override
	public boolean canSwim() {
		return true;
	}

	//Fish cannot fly
	@Override
	public boolean canFly() {
		return false;
	}

	//Fish cannot walk
	@Override
	public boolean canWalk() {
		return false;
	}
}
