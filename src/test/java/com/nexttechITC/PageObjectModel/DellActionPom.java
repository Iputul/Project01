package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPom {
	
WebDriver driver;	
public DellActionPom(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//div//input[@id='mh-search-input']")
public WebElement searchbox;
	
//@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]")
@FindBy(xpath="//span[text()='Solutions']")
WebElement act_Solutions;
public WebElement Solutions() { 
 return act_Solutions;
 }

@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[3]/a")
WebElement click_all_Solutions;	
public WebElement AllSolutions() {
	return click_all_Solutions; 

}
}
	    