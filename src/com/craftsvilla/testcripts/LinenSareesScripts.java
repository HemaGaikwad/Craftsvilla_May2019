package com.craftsvilla.testcripts;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pompages.CartPage;
import com.craftsvilla.pompages.CheckOutPage;
import com.craftsvilla.pompages.HomePage;
import com.craftsvilla.pompages.LinenSareesPage;
import com.craftsvilla.pompages.ProductDescriptionPage;
import com.craftsvilla.pompages.SareesPage;

public class LinenSareesScripts extends BaseTest
{
	
	HomePage homepage = null;
	SareesPage sareespage = null;
	LinenSareesPage linensarees = null;
	ProductDescriptionPage proddescpage = null;
	CheckOutPage checkoutpage = null;
	CartPage cartPage = null;
	
	
	@Test
	public void tc_01_buyProductFromLinenSarees()
	{
		homepage = new HomePage(driver);
		sareespage = new SareesPage(driver);
		linensarees = new LinenSareesPage(driver);
		proddescpage = new ProductDescriptionPage(driver);
		checkoutpage = new CheckOutPage(driver);
		cartPage = new CartPage(driver);
		
		try
		{
			homepage.goToSareesLink();
			sareespage.clickOnLinenSarees();
			linensarees.goToProduct1538759448();
			proddescpage.clickOnBuyNow();
			Assert.fail();
			checkoutpage.setMobile("9986509551");
			checkoutpage.captureOTPMessage();
			checkoutpage.setOTP("5115");
			checkoutpage.clickOnLogin();
			/*cartPage.setFirstName("Hema");
			cartPage.setMobile("9986509551");*/
			
			
		}
		catch(Exception e)
		{
			
		}
	}

}
