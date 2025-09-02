package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Location {

	WebDriver driver;
	
	@Given("User is on Zomato home page to navigate the location")
	public void homepage () throws InterruptedException {
		
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com/india");
        Thread.sleep(2000);
	}
	
    @When("User go to pune restaurants")
    public void pune () throws InterruptedException {
    	
    	WebElement pune_resto = driver.findElement(By.xpath("//h5[normalize-space()='Pune Restaurants']"));
    	pune_resto.click();
    	Thread.sleep(2000);
	}
	
    @When("User detect live location")
    public void location () throws InterruptedException {
    	
    	driver.findElement(By.xpath("//input[@placeholder='Pune']")).click();
    	Thread.sleep(3000);
    	 WebElement liveLocation = driver.findElement(By.xpath("(//p[@class='sc-1hez2tp-0 sc-bQduHL tovje'])[1]"));
         String detectedLocation = liveLocation.getText();
         System.out.println("Detected Live Location: " + detectedLocation);
         liveLocation.click();
         Thread.sleep(1000);
	}
	
    @Then("User go back and close browser")
    public void close () {
    	
    	driver.close();
    	
	}
	
}
