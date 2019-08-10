package com.leafBot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(){
		//Page Factory unknown
	}

	public LoginPage enterUsername(String username) {
		WebElement ele = locateElement("id", "usename");
		clearAndType(ele, username);
		return this;

	}
	public LoginPage enterPassword(String password) {
		WebElement ele = locateElement("id", "password");
		clearAndType(ele, password);	
		return this;

	}
	public HomePage clickLogin() {
		WebElement ele = locateElement("Class", "decorativeSubmit");
		click(ele);	
		return new HomePage();

	}
}
