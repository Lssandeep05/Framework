package com.leafBot.testcases;

import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TestCase extends ProjectSpecificMethods{
	@Test(dataProvider="fetchData")
	public void runLogin(String username,String password) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();

	}

}
