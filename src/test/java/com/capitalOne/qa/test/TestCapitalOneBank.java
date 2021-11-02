package com.capitalOne.qa.test;

import org.testng.annotations.Test;

import com.capitalOne.qa.common.CommonMethod;
import com.capitalOne.qa.setUp.DriverPage;
import com.capitolOne.qa.pages.CreditBuilding;

public class TestCapitalOneBank extends DriverPage{
  
	CommonMethod commonMethod;
	
	
	@Test
	public void capitalOneTest() {
		 commonMethod=new CommonMethod();
		CreditBuilding creditBuilding=new CreditBuilding(driver);
		creditBuilding.creditBuildingSteps(commonMethod);
	}	
}
