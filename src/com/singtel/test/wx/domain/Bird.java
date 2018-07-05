package com.singtel.test.wx.domain;

public class Bird extends Animal {
	
    public void fly() {
    	if(canFly())
    		System.out.println("I am flying");
    	else 
    		System.out.println("I canot fly");
    }
    
    //assume Bird cannot swim
	@Override
	public boolean canSwim() {
		return false;
	}

    //assume Bird can fly
	@Override
	public boolean canFly() {
		return true;
	}

    //assume Bird can walk
	@Override
	public boolean canWalk() {
		return true;
	}
}
