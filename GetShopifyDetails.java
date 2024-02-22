package com.selenium.pages;     //Do not change the package name         

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetShopifyDetails {  //Do not change the class name
	
	//Use the below declared variable
	public WebDriver driver;
	
	//Constructors are already given. If required, you can add more code into it but do NOT remove the existing code.
    public GetShopifyDetails(){}
    
	public GetShopifyDetails(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement getFirstName() {
	    
		//Find and return the 'firstname' web element of the row displayed after first form submit
		return driver.findElement(By.xpath("//table[@id='ttab']//tr[3]/td[1]"));
		
	}
	
	public WebElement getLastName() {
	    
		//Find and return the 'lastname' web element of the row displayed after first form submit
			return driver.findElement(By.xpath("//table[@id='ttab']//tr[3]/td[2]"));
		
	}

	public WebElement getUsername() {
	    
		//Find and return the 'username' web element of the row displayed after first form submit
			return driver.findElement(By.xpath("//table[@id='ttab']//tr[3]/td[3]"));
		
	}	 	  	  		 	     	     	      	 	
	
	public WebElement getCity() {
	    
		//Find and return the 'city' web element of the row displayed after first form submit
			return driver.findElement(By.xpath("//table[@id='ttab']//tr[3]/td[4]"));
		
	}
	
}