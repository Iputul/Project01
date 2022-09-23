package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonSearch {
	
	WebDriver driver;
	
	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
		
//how to open the browser	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		//how to open the URL
		driver.get("https://www.Amazon.com/");
		//driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		//how to max the window to get all our web elements visible
		
		
		}

	@Given("^user will search by \"([^\"]*)\"$")
	public void user_will_search_by(String arg1) throws Throwable {
		AmazonsearchPOM AS= new AmazonsearchPOM(driver);
		AS.Search().sendKeys (arg1);
		//WebDriverWait wait=new WebDriverWait(driver,20)
		
		Thread.sleep(5000);
		
		
  }

	@Then("^user clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
		AmazonsearchPOM AS=new AmazonsearchPOM (driver);
		AS.searchbutton().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		Thread.sleep(5000);
		driver.quit();
	}



}
