package com.selenium.pages;        //Do not change the package name

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class SetShopifyDetails {       //Do not change the class name

    //Use the below declared variable
	public WebDriver driver;
	public WebElement element;
	
    //Constructors are already given. If required, you can add more code into it but do NOT remove the existing code.
    public SetShopifyDetails(){}
    
	public SetShopifyDetails(WebDriver driver) { 
		this.driver= driver;
	}	 	  	  		 	     	     	      	 	


    public void setFirstName(String fname) throws Exception { 
        
        // Locate the Web Element corresponding to the ‘FirstName’ (TextField) using specific locators.		
        // Use the sendKeys() method and fill the input box of the ‘FirstName' with 'fname'
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(fname);
        
	}
	
	public void setLastName(String lname) throws Exception { 
	    
		// Locate the Web Element corresponding to the ‘LastName’ (TextField) using specific locators.		
        // Use the sendKeys() method and fill the input box of the ‘LastName' with 'lname'
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lname);
        
	}
	
	public void setUserName(String uname) throws Exception { 
	    
		// Locate the Web Element corresponding to the ‘UserName’ (TextField) using specific locators.		
        // Use the sendKeys() method and fill the input box of the ‘UserName' with 'uname'
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
       
	}
	
	public void setSelectCity(String city) throws Exception { 
	    
		// Locate the Web Element corresponding to the ‘City’ (Dropdown Field) using specific locators.            
		// Declare the drop-down element as an instance of the Select class.                            
		// Use ‘selectByVisibleText’ to select an option based on the ‘city.
		Select select = new Select(driver.findElement(By.xpath("//select[@id='selectcity']")));
		select.selectByVisibleText(city);
	
	}
	
	public void setGender(String gender) throws Exception { 
	    
		// Locate the Web Element corresponding to the ‘Gender’ (Radio button Field) using specific locators.            
		// Based on the gender value, use the click() method and choose the radio option
		driver.findElement(By.xpath("//input[@value='"+gender+"']")).click();
		
	}
	
	public void setPassword(String pwd) throws Exception { 
	    
		// Locate the Web Element corresponding to the ‘Password’ (TextField) using specific locators.		
        // Use the sendKeys() method and fill the input box of the ‘Password' with 'pwd'
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
       
	}
	
	public void setClickRegisterButton() throws Exception { 
	    
		// Locate the Web Element corresponding to the ‘Register’ (Button) using specific locators.
		// Click the ‘Register’ button and submit the form.
		driver.findElement(By.xpath("//button[@id='reg']")).click();
	
	}
    
}