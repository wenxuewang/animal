package com.singtel.test.wx.domain;

public abstract class Animal {
	
	protected String sound;
	
	public void walk() {
        System.out.println("I am walking");
    }
	
    public void sing() {
   	if (sound != null)
   		System.out.println(this.sound);
   	else 
   		System.out.println("I can not sing");
   }

    public String getSound() {
		return sound;
	}

	protected void setSound(String sound) {
		this.sound = sound;
	}

	public boolean canSing() {
		if(this.sound == null) return false;
		else return true;
	}
	
	public abstract boolean canWalk();
	public abstract boolean canSwim();
	public abstract boolean canFly();
}
