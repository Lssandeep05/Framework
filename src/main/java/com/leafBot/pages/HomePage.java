package com.leafBot.pages;



import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;


	public class HomePage extends ProjectSpecificMethods{

	/*
	 * public MyHome clickCRM_SFA() {
	 * driver.findElement(By.linkText("CRM/SFA")).click();
	 * 
	 * return new MyHome(); }
	 */
		
		public LoginPage clickLogout() {
			
			WebElement ele = locateElement("Class", "decorativeSubmit");
			click(ele);
			return new LoginPage();
			
			
		}
		
	}

