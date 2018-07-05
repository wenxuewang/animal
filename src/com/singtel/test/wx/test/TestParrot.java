package com.singtel.test.wx.test;

import java.util.Locale;

import org.junit.Test;

import com.singtel.test.wx.domain.Cat;
import com.singtel.test.wx.domain.Dog;
import com.singtel.test.wx.domain.Duck;
import com.singtel.test.wx.domain.Parrot;
import com.singtel.test.wx.domain.Rooster;

public class TestParrot {

	private Locale aLocale;

	@Test
	public void testParrot() 
	{
		aLocale = new Locale("fr","FR");
		Dog dog = new Dog();
		Cat cat = new Cat();
		Rooster rooster = new Rooster();
		rooster.init(aLocale);
		Duck duck = new Duck();
		
		Parrot parrot1 = new Parrot();
		parrot1.setSound(dog.getSound());
		parrot1.sing();
		
		Parrot parrot2 = new Parrot();
		parrot2.setSound(cat.getSound());
		parrot2.sing();
		
		Parrot parrot3 = new Parrot();
		parrot3.setSound(rooster.getSound());
		parrot3.sing();
		
		Parrot parrot4 = new Parrot();
		parrot4.setSound(duck.getSound());
		parrot4.sing();
		
		
	}
}
