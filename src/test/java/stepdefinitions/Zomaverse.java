package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Zomaverse {

	WebDriver driver;
	
	@Given("User is on Zomato home page for navigate zomaverse")
	public void homepage () throws InterruptedException {
		
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com/india");
        Thread.sleep(2000);
        
	}
	
    @When("User click Zomato navigate and back")
	public void Zomato () throws InterruptedException {
    	
    	WebElement Zomato = driver.findElement(By.xpath("//p[normalize-space()='Zomato']"));
    	System.out.println(Zomato.getText()+" Clicked");
    	Zomato.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
	}
	
    @When("User click Blinkit navigate and back")
	public void Blinkit () throws InterruptedException {
    	
    	WebElement Blinkit = driver.findElement(By.xpath("//p[normalize-space()='Blinkit']"));
    	System.out.println(Blinkit.getText()+" Clicked");
    	Blinkit.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
	}
	
    @When("User click District navigate and back")
	public void District () throws InterruptedException {
    	
    	WebElement District = driver.findElement(By.xpath("//p[normalize-space()='District']"));
    	System.out.println(District.getText()+" Clicked");
    	District.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
	}
	
    @When("User click Feeding India navigate and back")
	public void Feeding () throws InterruptedException {
    	
    	WebElement Feeding_India = driver.findElement(By.xpath("//p[normalize-space()='Feeding India']"));
    	System.out.println(Feeding_India.getText()+" Clicked");
    	Feeding_India.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
	}
	
    @When("User click Hyperpure navigate and back")
	public void Hyperpure () throws InterruptedException {
    	
    	WebElement Hyperpure = driver.findElement(By.xpath("//p[normalize-space()='Hyperpure']"));
    	System.out.println(Hyperpure.getText()+" Clicked");
    	Hyperpure.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
	}
	
    @When("User click Zomato Live navigate and back")
	public void Live () throws InterruptedException {
    	
    	WebElement Zomato_Live = driver.findElement(By.xpath("//p[normalize-space()='Zomato Live']"));
    	System.out.println(Zomato_Live.getText()+" Clicked");
    	Zomato_Live.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
	}
	
    @When("User click Zomaland navigate and back")
	public void Zomaland () throws InterruptedException {
    	
    	WebElement Zomaland = driver.findElement(By.xpath("//p[normalize-space()='Zomaland']"));
    	System.out.println(Zomaland.getText()+" Clicked");
    	Zomaland.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
	}
	
    @When("User click Weather Union navigate and back")
	public void Weather () throws InterruptedException {
    	
    	WebElement Weather_Union = driver.findElement(By.xpath("//p[normalize-space()='Weather Union']"));
    	System.out.println(Weather_Union.getText()+" Clicked");
    	Weather_Union.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
	}
	
  	@Then("User close the browser and navigate zomaverse")
	public void close () throws InterruptedException {
		driver.quit();
	}
	
}
