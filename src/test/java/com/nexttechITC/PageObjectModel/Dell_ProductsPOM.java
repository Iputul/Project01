package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dell_ProductsPOM {
	WebDriver driver;
	public  Dell_ProductsPOM(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//*[@id=\"//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[3]/a")
	WebElement act_Laptops;
	public WebElement Laptops () { 
	 return act_Laptops;
	 }
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[3]/ul/li[3]/a")
	WebElement click_Laptops_ForHome;	
	public WebElement AllSolutions() {
		return click_Laptops_ForHome ; 

	}
	
	}



