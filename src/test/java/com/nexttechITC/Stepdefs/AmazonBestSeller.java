package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.AmazonBestSellerPOM;
import com.nexttechITC.PageObjectModel.AmazonsearchPOM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonBestSeller {
	
WebDriver driver;
	
	@Given("^user visits amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
		
		//how to open the browser	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\hromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		//how to open the URL
		driver.get("https://www.Amazon.com/");
		//driver.manage().window().maximize();
		driver.manage().window().maximize();
		//how to max the window to get all our web elements visible
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		
		
		
	}

	@When("^user click on Best seller$")
	public void user_clicks_on_Best_seller() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	    AmazonBestSellerPOM AS=new AmazonBestSellerPOM (driver);
		AS.BestSeller().click();
		//WebDriverWait wait=new WebDriverWait(driver,20);
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}
	
}



//@Then("^user should be able to redirect to the Best Seller Page$")
//public void user_should_be_able_to_redirect_to_the_Best_Seller_Page() throws Throwable {
	//AmazonBestSellerPOM AS=new AmazonBestSellerPOM (driver);
	//AS.BestSeller().click();
	//WebDriverWait wait=new WebDriverWait(driver,20);
	//Thread.sleep(5000);
	//driver.quit();

		
	    
	    
	    
	    
	    
	  
	    
	
	