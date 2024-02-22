package com.selenium.tests;           //Do not change the package name

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.pages.GetShopifyDetails; 
import com.selenium.pages.SetShopifyDetails; 
import com.selenium.setup.DriverSetup;
import com.selenium.setup.ExcelUtils;


import static org.testng.Assert.assertEquals;
import java.lang.reflect.Method;
import java.util.List;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.collections.Lists;
import org.testng.annotations.Listeners;

public class TestValidShopifyDetails {        //Do not change the class name

    //Use the below declared variables
	public static WebDriver driver;
	public static WebElement firstName,lastName,userName,userCity;
	public static String fNametext,lNametext,uNametext,cityText;

	GetShopifyDetails getShopifyDetails;
	SetShopifyDetails setShopifyDetails;
	
	
    //Apply the required annotation
    @BeforeClass
	public void setUp() {	    //Do not change the method signature
	    
		//create the driver using method 'getDriver' in class DriverSetup.
		driver = DriverSetup.getDriver();
		//Assign it to the variable 'driver'
		
		
		//Navigate to the URL mentioned in the problem description
		//"https://webapps.tekstac.com/Shopify/"
		driver.get("https://webapps.tekstac.com/Shopify/");
		
        //Please do not delete or modify these lines.
    	getShopifyDetails=new GetShopifyDetails(driver);
    	setShopifyDetails=new SetShopifyDetails(driver);
	}	 	  	  		 	     	     	      	 	
	
	
	public static String[] getValidShopifyData() throws Exception {  //Do not change the method signature
		      
	    //Call the method 'readExcelData' in class 'ExcelUtils' using file name 'shopify.xlsx' and sheet name 'shopify_valid'
	    //Return the value
		return ExcelUtils.readExcelData("shopify.xlsx" , "shopify_valid");
	}
	
	
	//Apply the required annotation
	@Test
	public void testValidShopifyDetails() throws Exception {	    //Do not change the method signature
		
		//Call the method 'getValidShopifyData' to read the excel data and store it in a array. Use the array values as parameter.
 	   String[] res = TestValidShopifyDetails.getValidShopifyData();
		//Use 'setShopifyDetails' object and call the method setFirstName() and pass the string array value '0' as parameter.
		setShopifyDetails.setFirstName(res[0]);
		
		//Use 'setShopifyDetails' object and call the method setLastName() and pass the string array value '1' as parameter.
		setShopifyDetails.setLastName(res[1]);
		
		//Use 'setShopifyDetails' object and call the method setUserName() and pass the string array value '2' as parameter. 
		setShopifyDetails.setUserName(res[2]);
		
		//Use 'setShopifyDetails' object and call the method setSelectCity() and pass the string array value '3' as parameter.
		setShopifyDetails.setSelectCity(res[3]);
		
		//Use 'setShopifyDetails' object and call the method setGender() and pass the string array value '4' as parameter.
		setShopifyDetails.setGender(res[4]);
		
		//Use 'setShopifyDetails' object and call the method setPassword() and pass the string array value '5' as parameter.
		setShopifyDetails.setPassword(res[5]);
		
		//Use 'setShopifyDetails' object and call the method setClickRegisterButton() to click the 'Register' button. 
		setShopifyDetails.setClickRegisterButton();
		
		
		//Use 'getShopifyDetails' object and call the method getFirstName() and store the displayed message in a static variable 'fNametext'.
		fNametext = getShopifyDetails.getFirstName().getText();
		//Use 'getShopifyDetails' object and call the method getLastName() and store the displayed message in a static variable 'lNametext'. 
		lNametext = getShopifyDetails.getLastName().getText();
	    //Use 'getShopifyDetails' object and call the method getUsername() and store the displayed message in a static variable 'uNametext'.
	    uNametext = getShopifyDetails.getUsername().getText();
	    //Use 'getShopifyDetails' object and call the method getCity() and store the displayed message in a static variable 'cityText'.
	    cityText = getShopifyDetails.getCity().getText();

        //Use assert method and compare the array values with the static variables fNametext, lNametext, uNametext and cityText.                            
		//Assert whether the parameter 'array 0' is equal to 'fNametext'   
		Assert.assertEquals(fNametext , res[0]);
		//Assert whether the parameter 'array 1' is equal to 'lNametext' 
		Assert.assertEquals(lNametext , res[1]);
		//Assert whether the parameter 'array 2' is equal to 'uNametext'  
		Assert.assertEquals(uNametext , res[2]);
		//Assert whether the parameter 'array 3' is equal to 'cityText'      
		Assert.assertEquals(cityText , res[3]);
	
	}	 	  	  		 	     	     	      	 	
	

	//Apply the required annotation
	@AfterClass
	public void closeBrowser() {    //Do not change the method signature
		
		//close the driver
		driver.close();

	}
	
}
