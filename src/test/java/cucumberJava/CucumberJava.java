package cucumberJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class CucumberJava {
	WebDriver webDriver = null; 
	
	   @Given("^I have open the browser$") 
	   public void openBrowser() { 
		   webDriver = new FirefoxDriver(); 
	   } 
		
	   @When("^I open Facebook website$") 
	   public void goToFacebook() { 
		   webDriver.navigate().to("https://www.facebook.com/"); 
	   } 
		
	   @Then("^Login button should exist$") 
	   public void loginButton() { 
	      if(webDriver.findElement(By.id("u_0_cc")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail"); 
	      } 
	      webDriver.close(); 
	   } 
}
