package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.nexttechITC.PageObjectModel.Dell_Laptops_ForHomePom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dell_Laptops_ForHome {
	WebDriver driver;

 @Given("^user Visits Dell HomePage$")
	public void user_Visits_Dell_HomePage() throws Throwable {
	    
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Irfat\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
   driver.manage().window().maximize();
   driver.get("https://www.dell.com/en-us");
		   }		
 @When("^user go to Products dropdown menu and able to see Laptops$")
	public void user_go_to_Products_dropdown_menu_and_able_to_see_Laptops() throws Throwable {
	  Actions act = new Actions(driver);
    Dell_Laptops_ForHomePom obj = new Dell_Laptops_ForHomePom(driver);
 act.moveToElement(obj.Products()).build().perform();
	        Thread.sleep(2000);    
	}
 @When("^user go to Laptops and able to see For Home$")
	public void user_go_to_Laptops_and_able_to_see_For_Home() throws Throwable {
		 
    Actions act = new Actions(driver);
   Dell_Laptops_ForHomePom obj = new Dell_Laptops_ForHomePom(driver);
  
 act.moveToElement(obj.Laptops()).build().perform();
 obj.ForHome().click();
    WebDriverWait Wait = new WebDriverWait(driver,50);
    Thread.sleep(2000); 
		}
 @Then("^user will click to For Home option$")
	public void user_will_click_to_For_Home_option() throws Throwable {
		
		 
	
	
	
	
	
// Write code here that turns the phrase above into concrete actions
	   
	}



}
