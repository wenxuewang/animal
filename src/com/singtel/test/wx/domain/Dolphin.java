package com.singtel.test.wx.domain;

public class Dolphin extends Animal {
	
	public Dolphin() {
		this.sound = null;
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
		return false;
	}
}
