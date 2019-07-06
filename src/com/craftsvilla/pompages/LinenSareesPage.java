package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;



public class LinenSareesPage extends BasePage
{
	@FindBy(xpath="//img[contains(@src,'1546488184-Craftsvilla_1.jpg')]")
	private WebElement product_1546488184;
	
	@FindBy(xpath="//img[contains(@src,'1546486624-Craftsvilla_1.jpg')]")
	private WebElement product_1546486624;
	
	@FindBy(id="discountedPriceOrder_DESC")
	private WebElement priceOrder;
	
	
	public LinenSareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void goToProduct1538759448()
	{
		verifyElementPresent(product_1546488184);
		product_1546488184.click();
	}
	
	public void goToProduct1538760092()
	{
		verifyElementPresent(product_1546486624);
		product_1546486624.click();
	}
	
	public void changePriceOrder()
	{
		verifyElementPresent(priceOrder);
		priceOrder.click();
	}
}

