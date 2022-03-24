package com.pages;

import org.openqa.selenium.By;

import com.test.BaseClass;
import com.utils.propReaderFile;

public class LoginPage extends BaseClass{

	public void login() {
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys(propReaderFile.getData("username"));
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
	}
	
}
