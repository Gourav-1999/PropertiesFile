package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propReaderFile {

	public static Properties prop;

	public static String getData(String s) {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("src\\test\\java\\com\\configuration\\config.properties");
			prop.load(file);
			} catch(IOException e) {
				e.toString();
			}
		return prop.getProperty(s);
	}
	
}
