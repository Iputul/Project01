package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechITC.PageObjectModel.DellActionPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {
   WebDriver driver;
   @Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Irfat\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
	//how to max the window to get all our web elements visible
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
  //Open URL
    driver.get("https://www.dell.com/");
	}

	@When("^user go to Solutions dropdown menu and able to see View All Solutions$")
	public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
		
		DellActionPom obj=new DellActionPom(driver);
		
		obj.searchbox.sendKeys("dell laptops");
		
		Actions act=new Actions(driver);
		
		System.out.println("******************************************Inside When Block");
		act.moveToElement(obj.Solutions()).build().perform();
		obj.AllSolutions().click();
		//obj.Solutions().click();
	}

	@Then("^user will be redirects to solution portfolio$")
	public void user_will_be_redirects_to_solution_portfolio() throws Throwable {
	    
	}


}
