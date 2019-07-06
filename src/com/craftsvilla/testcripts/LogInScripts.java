package com.craftsvilla.testcripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.generic.ReadExcel;
import com.craftsvilla.pompages.HomePage;
import com.craftsvilla.pompages.SignInPage;

public class LogInScripts extends BaseTest
{
	HomePage homepage = null;
	SignInPage signpage = null;
	
	@Test
	public void tc_01_loginToApp()
	{
		homepage = new HomePage(driver);
		signpage = new SignInPage(driver);
	
		try
		{
			String[][] credentials = ReadExcel.getData(FILE_PATH, "Sheet1");
			for(int i=1; i<credentials.length;i++)
			{
				String email = credentials[i][0];
				String password = credentials[i][1];
				
				homepage.clickOnSignInLink();
				signpage.setEmail(email);
				signpage.clickOnContinue();
				signpage.enterPassword(password);
				signpage.clickOnLoginButton();
				homepage.gotoAccount();
				homepage.clickOnLogout();
				homepage.verifyTitle("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
				
			}
			
			
		}
		catch(Exception e)
		{
			
		}
	}

}
