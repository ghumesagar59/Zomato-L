package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import utils.DriverFactory;

public class Social_Medial {

	WebDriver driver = DriverFactory.getDriver();
	
	 @Given("User is on Zomato home page for social media link navigate")
	 public void homepage () throws InterruptedException {
		 driver.get("https://www.zomato.com/india");
	        Thread.sleep(2000);
		 
	 }
	 
	 @When("User click LinkedIn Logo")
	 public void linkedin ()  throws InterruptedException {
		 WebElement LinkedIn = driver.findElement(By.xpath("(//*[name()='svg'][@role='img'])[89]"));
		 LinkedIn.click();
		 Thread.sleep(3000);
	 }
	 
	 @When("User click Instagram Logo")
	 public void Instagram ()  throws InterruptedException {
		 WebElement Instagram = driver.findElement(By.xpath("(//*[name()='svg'][@role='img'])[90]"));
		 Instagram.click();
		 Thread.sleep(3000);
		 
	 }
	 
	 @When("User click Twitter Logo")
	 public void Twitter () throws InterruptedException  {
		 WebElement Twitter = driver.findElement(By.xpath("(//*[name()='svg'][@role='img'])[91]"));
		 Twitter.click();
		 Thread.sleep(3000);
		 
	 }
	 
	 @When("User click Youtube Logo")
	 public void Youtube () throws InterruptedException  {
		 WebElement Youtube = driver.findElement(By.xpath("(//*[name()='svg'][@role='img'])[92]"));
		 Youtube.click();
		 Thread.sleep(3000);
		 
	 }
	 
	 @When("User click Facebook Logo")
	 public void Facebook () throws InterruptedException  {
		 WebElement Facebook = driver.findElement(By.xpath("(//*[name()='svg'][@role='img'])[93]"));
		 Facebook.click();
		 Thread.sleep(3000);
		 
	 }
	 
	 @When("User click Appstore Logo")
	 public void Appstore () throws InterruptedException  {
		 WebElement Appstore = driver.findElement(By.xpath("(//img[@alt='image'])[1]"));
		 Appstore.click();
		 Thread.sleep(3000);
		 
	 }
	 
	 @When("User click Playstore Logo")
	 public void Playstore () throws InterruptedException  {
		 WebElement Playstore = driver.findElement(By.xpath("(//img[@alt='image'])[2]"));
		 Playstore.click();
		 Thread.sleep(3000);
		 
		 
	 }
	 
	 @Then("User closed the browser")
	 public void close ()  throws InterruptedException {
		 driver.quit();
		 
	 }
	    
	
   
}
