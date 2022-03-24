package com.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class Read_test extends BaseClass{

	LoginPage page = new LoginPage();

	
	@BeforeTest
	public void setup() {
		BaseClass.initialization();
	}
	
	@Test
	public void login_test() {
		page.login();
	}
}
