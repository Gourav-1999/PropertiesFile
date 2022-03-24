package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_test {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		File file=new File("src\\test\\java\\com\\configuration\\write.properties");
		FileInputStream fileInput=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fileInput);
		prop.setProperty("FirstName","Gourav");
		prop.setProperty("LastName","Vig");
		FileOutputStream FileOutput=new FileOutputStream(file);
		prop.store(FileOutput, null);

	}
	}


