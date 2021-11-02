package com.capitolOne.qa.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.capitalOne.qa.common.CommonMethod;

public class CreditBuilding {
	WebDriver driver;
	
	public CreditBuilding(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Credit Cards']") public WebElement CreditCard;
	@FindBy(xpath = "(//*[@class='site-L2__feat-card-heading '])[1]") public WebElement CreditBuilding;
	@FindBy(xpath = "//a[text()='Platinum Mastercard�']") public WebElement Platinum;
	@FindBy(xpath = "(//a[text()=' Apply Now '])[1]") public WebElement Apply;
	@FindBy(xpath = "//input[@id='firstName']") public WebElement FirstName;
	@FindBy(xpath = "//input[@id='middleName']") public WebElement MiddleName;
	@FindBy(xpath = "//input[@id='lastName']") public WebElement LastName;
	@FindBy(xpath = "//input[@id='dateOfBirth']") public WebElement Dob;
	@FindBy(xpath = "//input[@id='socialSecurity']") public WebElement Ssn;
	@FindBy(xpath = "(//label[@class='grv-radiobutton__label'])[1]") public WebElement Citizen;
	@FindBy(xpath = "//input[@id='address.residential.addressLine1']") public WebElement Address;
	@FindBy(xpath = "//input[@id='address.residential.addressLine2']") public WebElement Apt;
	@FindBy(xpath = "//input[@id='address.residential.zipcode']") public WebElement ZipCode;
	@FindBy(xpath = "//input[@id='address.residential.city']") public WebElement City;
	@FindBy(xpath = "//select[@id='address.residential.state']") public WebElement State;
	@FindBy(xpath = "//input[@id='email']") public WebElement Email;
	@FindBy(xpath = "//input[@id='phone']") public WebElement PhoneNumber;
	@FindBy(xpath = "//select[@id='employmentStatus']") public WebElement EmployeeStatus;
	@FindBy(xpath = "//input[@id='totalAnnualIncome']") public WebElement Income;
	@FindBy(xpath = "//input[@id='monthlyRentMortgage']") public WebElement Rent;
	@FindBy(xpath = "//select[@id='bankAccounts']") public WebElement BankAccount;
	@FindBy(xpath = "(//label[@class='grv-radiobutton__label'])[7]") public WebElement CashAdvanc;
	@FindBy(className = "grv-checkbox__label") public WebElement AcceptPolicy;
	@FindBy(xpath = "//button[@name='continue']") public WebElement Continues;
	
	public void creditBuildingSteps(CommonMethod commonMethod) {
	   commonMethod.hoverOver(CreditCard);
	   commonMethod.click(CreditBuilding);
		commonMethod.click(Platinum);
		commonMethod.click(Apply);
		commonMethod.win();
		commonMethod.enterText(FirstName, "Steve");
		commonMethod.enterText(MiddleName,"Harver");
		commonMethod.enterText(LastName, "White");
		commonMethod.enterText(Dob, "10251985");
		commonMethod.enterText(Ssn, "021527878");
		commonMethod.click(Citizen);
		commonMethod.enterText(Address, "1245 VIRGINIA AVENUE");
		commonMethod.enterText(Apt, "Fl-03");
		commonMethod.enterText(ZipCode, "10475");
		commonMethod.enterText(City, "Bronx");
		commonMethod.dropDown(State,"NY");
		commonMethod.enterText(Email, "steveharvey@gmail.com");
		commonMethod.enterText(PhoneNumber, "6465864522");
		commonMethod.dropDown(EmployeeStatus, "EMP");
		commonMethod.enterText(Income, "80000");
		commonMethod.enterText(Rent, "2000");
		commonMethod.dropDown(BankAccount, "CHK");
		commonMethod.click(CashAdvanc);
		commonMethod.click(AcceptPolicy);
		commonMethod.click(Continues);
	
	}

}
