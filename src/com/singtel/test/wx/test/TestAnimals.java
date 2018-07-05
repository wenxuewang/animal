package com.singtel.test.wx.test;

import org.junit.Test;

import com.singtel.test.wx.domain.Animal;
import com.singtel.test.wx.domain.Bird;
import com.singtel.test.wx.domain.Butterfly;
import com.singtel.test.wx.domain.Cat;
import com.singtel.test.wx.domain.Chicken;
import com.singtel.test.wx.domain.Clownfish;
import com.singtel.test.wx.domain.Dog;
import com.singtel.test.wx.domain.Dolphin;
import com.singtel.test.wx.domain.Duck;
import com.singtel.test.wx.domain.Fish;
import com.singtel.test.wx.domain.Frog;
import com.singtel.test.wx.domain.Parrot;
import com.singtel.test.wx.domain.Rooster;
import com.singtel.test.wx.domain.Shark;

public class TestAnimals {

	@Test
	public void testAllAnimals() 
	{
		Animal[] animals = new Animal[]{
		        new Bird(),
		        new Duck(),
		        new Chicken(),
		        new Rooster(),
		        new Parrot(),
		        new Fish(),
		        new Shark(),
		        new Clownfish(),
		        new Dolphin(),
		        new Frog(), 
		        new Dog(),
		        new Butterfly(),
		        new Cat()
		}; 		
		
		int flyAnimals = 0;
		int walkAnimals = 0;
		int singAnimals = 0;
		int swimAnimals = 0;
		
		for(int i = 0; i < animals.length; i ++) {
			Animal animal = animals[i];
			if(animal.canFly()) flyAnimals++;
			if(animal.canWalk()) walkAnimals ++;
			if(animal.canSing()) singAnimals++;
			if(animal.canSwim())  swimAnimals++;
		}
		
		System.out.println(flyAnimals + " can fly.");
		System.out.println(walkAnimals + " can walk.");
		System.out.println(singAnimals + " can sing.");
		System.out.println(swimAnimals + " can swim.");
	}
}
