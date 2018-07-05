package com.singtel.test.wx.domain;

import java.util.Locale;
import java.util.ResourceBundle;

public class Rooster extends Bird{
	
	Locale defaultLocale = Locale.getDefault();

	public Rooster() {
	}
	
	public void init(Locale defaultLocale) {
		this.defaultLocale = defaultLocale;
		ResourceBundle bundle = ResourceBundle.getBundle("MessagesBundle", defaultLocale);
		this.setSound(bundle.getString("sound.rooster"));
	}
	
}
