package com.capitalOne.qa.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.capitalOne.qa.setUp.DriverPage;

public class CommonMethod {
	public void click(WebElement element) {
		element.click();
	}
	public void enterText(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void dropDown(WebElement element,String value) {
		Select select=new Select(element);
		select.deselectByValue(value);
	}
   public void hoverOver(WebElement element) {
	   Actions actions=new Actions(DriverPage.driver);
	   actions.moveToElement(element).build().perform();
   }
   public void win(){
	   Set<String> window=DriverPage.driver.getWindowHandles();
		List<String> windowList=new ArrayList<String>(window);
		DriverPage.driver.switchTo().window(windowList.get(1)); 
   }
}
