package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Learn_more {

	WebDriver driver;
	
	@Given("User go to Zomato home page")
	public void homepage () throws InterruptedException {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com/india");
        Thread.sleep(2000);
		
	}
	
    @When("User click Privacy navigate and back")
    public void privacy () throws InterruptedException {
		
    	WebElement Privacy = driver.findElement(By.xpath("//p[normalize-space()='Privacy']"));
    	System.out.println(Privacy.getText()+" Clicked");
    	Privacy.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
	}
    
    @When("User click Security navigate and back")
    public void security () throws InterruptedException {
		
    	WebElement Security = driver.findElement(By.xpath("//p[normalize-space()='Security']"));
    	System.out.println(Security.getText()+" Clicked");
    	Security.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
	}
    
    @When("User click Tearms navigate and back")
    public void tearms () throws InterruptedException {
		
    	WebElement Tearms = driver.findElement(By.xpath("//p[normalize-space()='Terms']"));
    	System.out.println(Tearms.getText()+" Clicked");
    	Tearms.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
	}
    
  	@Then("User close the browser for learn more")
    public void close () throws InterruptedException {
		
		driver.quit();
		
	}
}
