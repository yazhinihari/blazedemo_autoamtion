package Page_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class purchase_pageelemements {

	@FindBy(id="inputName")
	public static WebElement  Name;
	
	
	@FindBy(id="address")
	public static WebElement  address;
	
	
	@FindBy(id="city")
	public static WebElement  city;
	

	@FindBy(id="state")
	public static WebElement  state;
	
	@FindBy(id="zipCode")
	public static WebElement  zipCode;
	
	@FindBy(id="cardType")
	public static WebElement  cardType;
	
	@FindBy(id="creditCardNumber")
	public static WebElement  creditCardNumber;
	
	@FindBy(xpath="/html/body/div[2]/form/div[11]/div/input")
	public static WebElement  Submit;
	
	
}
