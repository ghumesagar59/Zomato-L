package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class City {

	WebDriver driver;
	
	@Given("user is on Zomato India homepage")
	public void homepage () throws InterruptedException {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com/india");
        Thread.sleep(2000);
	}
	
    @When("user click to all cities")
	public void click_to_all_cities () throws InterruptedException {
    	
    	WebElement agra = driver.findElement(By.xpath("//h5[normalize-space()='Agra Restaurants']"));
    	System.out.println(agra.getText() + " Clicked");
    	agra.click();
    	driver.navigate().back();
    	Thread.sleep(200);
    	
    	WebElement ahmedabad = driver.findElement(By.xpath("//h5[normalize-space()='Ahmedabad Restaurants']"));
    	System.out.println(ahmedabad.getText() + " Clicked");
    	ahmedabad.click();
    	driver.navigate().back();
    	Thread.sleep(200);
    	
    	WebElement ajmer = driver.findElement(By.xpath("//h5[normalize-space()='Ajmer Restaurants']"));
    	System.out.println(ajmer.getText() + " Clicked");
    	ajmer.click();
    	driver.navigate().back();
    	Thread.sleep(200);

    	WebElement alappuzha = driver.findElement(By.xpath("//h5[normalize-space()='Alappuzha Restaurants']"));
    	System.out.println(alappuzha.getText() + " Clicked");
    	alappuzha.click();
    	driver.navigate().back();
    	Thread.sleep(200);

    	WebElement allahabad = driver.findElement(By.xpath("//h5[normalize-space()='Allahabad Restaurants']"));
    	System.out.println(allahabad.getText() + " Clicked");
    	allahabad.click();
    	driver.navigate().back();
    	Thread.sleep(200);

    	WebElement amravati = driver.findElement(By.xpath("//h5[normalize-space()='Amravati Restaurants']"));
    	System.out.println(amravati.getText() + " Clicked");
    	amravati.click();
    	driver.navigate().back();
    	Thread.sleep(200);

    	WebElement amritsar = driver.findElement(By.xpath("//h5[normalize-space()='Amritsar Restaurants']"));
        System.out.println(amritsar.getText() + " Clicked");
        amritsar.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement aurangabad = driver.findElement(By.xpath("//h5[normalize-space()='Aurangabad Restaurants']"));
        System.out.println(aurangabad.getText() + " Clicked");
        aurangabad.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement bengaluru = driver.findElement(By.xpath("//h5[normalize-space()='Bengaluru Restaurants']"));
        System.out.println(bengaluru.getText() + " Clicked");
        bengaluru.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement bhopal = driver.findElement(By.xpath("//h5[normalize-space()='Bhopal Restaurants']"));
        System.out.println(bhopal.getText() + " Clicked");
        bhopal.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement bhubaneswar = driver.findElement(By.xpath("//h5[normalize-space()='Bhubaneswar Restaurants']"));
        System.out.println(bhubaneswar.getText() + " Clicked");
        bhubaneswar.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement chandigarh = driver.findElement(By.xpath("//h5[normalize-space()='Chandigarh Restaurants']"));
        System.out.println(chandigarh.getText() + " Clicked");
        chandigarh.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement chennai = driver.findElement(By.xpath("//h5[normalize-space()='Chennai Restaurants']"));
        System.out.println(chennai.getText() + " Clicked");
        chennai.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement coimbatore = driver.findElement(By.xpath("//h5[normalize-space()='Coimbatore Restaurants']"));
        System.out.println(coimbatore.getText() + " Clicked");
        coimbatore.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement cuttack = driver.findElement(By.xpath("//h5[normalize-space()='Cuttack Restaurants']"));
        System.out.println(cuttack.getText() + " Clicked");
        cuttack.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement darjeeling = driver.findElement(By.xpath("//h5[normalize-space()='Darjeeling Restaurants']"));
        System.out.println(darjeeling.getText() + " Clicked");
        darjeeling.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement dehradun = driver.findElement(By.xpath("//h5[normalize-space()='Dehradun Restaurants']"));
        System.out.println(dehradun.getText() + " Clicked");
        dehradun.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement delhincr = driver.findElement(By.xpath("//h5[normalize-space()='Delhi NCR Restaurants']"));
        System.out.println(delhincr.getText() + " Clicked");
        delhincr.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement dharamshala = driver.findElement(By.xpath("//h5[normalize-space()='Dharamshala Restaurants']"));
        System.out.println(dharamshala.getText() + " Clicked");
        dharamshala.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement gangtok = driver.findElement(By.xpath("//h5[normalize-space()='Gangtok Restaurants']"));
        System.out.println(gangtok.getText() + " Clicked");
        gangtok.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement goa = driver.findElement(By.xpath("//h5[normalize-space()='Goa Restaurants']"));
        System.out.println(goa.getText() + " Clicked");
        goa.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement gorakhpur = driver.findElement(By.xpath("//h5[normalize-space()='Gorakhpur Restaurants']"));
        System.out.println(gorakhpur.getText() + " Clicked");
        gorakhpur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement guntur = driver.findElement(By.xpath("//h5[normalize-space()='Guntur Restaurants']"));
        System.out.println(guntur.getText() + " Clicked");
        guntur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement guwahati = driver.findElement(By.xpath("//h5[normalize-space()='Guwahati Restaurants']"));
        System.out.println(guwahati.getText() + " Clicked");
        guwahati.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement gwalior = driver.findElement(By.xpath("//h5[normalize-space()='Gwalior Restaurants']"));
        System.out.println(gwalior.getText() + " Clicked");
        gwalior.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement haridwar = driver.findElement(By.xpath("//h5[normalize-space()='Haridwar Restaurants']"));
        System.out.println(haridwar.getText() + " Clicked");
        haridwar.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement hyderabad = driver.findElement(By.xpath("//h5[normalize-space()='Hyderabad Restaurants']"));
        System.out.println(hyderabad.getText() + " Clicked");
        hyderabad.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement indore = driver.findElement(By.xpath("//h5[normalize-space()='Indore Restaurants']"));
        System.out.println(indore.getText() + " Clicked");
        indore.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement jabalpur = driver.findElement(By.xpath("//h5[normalize-space()='Jabalpur Restaurants']"));
        System.out.println(jabalpur.getText() + " Clicked");
        jabalpur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement jaipur = driver.findElement(By.xpath("//h5[normalize-space()='Jaipur Restaurants']"));
        System.out.println(jaipur.getText() + " Clicked");
        jaipur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement jalandhar = driver.findElement(By.xpath("//h5[normalize-space()='Jalandhar Restaurants']"));
        System.out.println(jalandhar.getText() + " Clicked");
        jalandhar.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement jammu = driver.findElement(By.xpath("//h5[normalize-space()='Jammu Restaurants']"));
        System.out.println(jammu.getText() + " Clicked");
        jammu.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement jamnagar = driver.findElement(By.xpath("//h5[normalize-space()='Jamnagar Restaurants']"));
        System.out.println(jamnagar.getText() + " Clicked");
        jamnagar.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement jamshedpur = driver.findElement(By.xpath("//h5[normalize-space()='Jamshedpur Restaurants']"));
        System.out.println(jamshedpur.getText() + " Clicked");
        jamshedpur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement jhansi = driver.findElement(By.xpath("//h5[normalize-space()='Jhansi Restaurants']"));
        System.out.println(jhansi.getText() + " Clicked");
        jhansi.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement jodhpur = driver.findElement(By.xpath("//h5[normalize-space()='Jodhpur Restaurants']"));
        System.out.println(jodhpur.getText() + " Clicked");
        jodhpur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement junagadh = driver.findElement(By.xpath("//h5[normalize-space()='Junagadh Restaurants']"));
        System.out.println(junagadh.getText() + " Clicked");
        junagadh.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement kanpur = driver.findElement(By.xpath("//h5[normalize-space()='Kanpur Restaurants']"));
        System.out.println(kanpur.getText() + " Clicked");
        kanpur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement khajuraho = driver.findElement(By.xpath("//h5[normalize-space()='Khajuraho Restaurants']"));
        System.out.println(khajuraho.getText() + " Clicked");
        khajuraho.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement khamgaon = driver.findElement(By.xpath("//h5[normalize-space()='Khamgaon Restaurants']"));
        System.out.println(khamgaon.getText() + " Clicked");
        khamgaon.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement kharagpur = driver.findElement(By.xpath("//h5[normalize-space()='Kharagpur Restaurants']"));
        System.out.println(kharagpur.getText() + " Clicked");
        kharagpur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement kochi = driver.findElement(By.xpath("//h5[normalize-space()='Kochi Restaurants']"));
        System.out.println(kochi.getText() + " Clicked");
        kochi.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement kolhapur = driver.findElement(By.xpath("//h5[normalize-space()='Kolhapur Restaurants']"));
        System.out.println(kolhapur.getText() + " Clicked");
        kolhapur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement kolkata = driver.findElement(By.xpath("//h5[normalize-space()='Kolkata Restaurants']"));
        System.out.println(kolkata.getText() + " Clicked");
        kolkata.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement kota = driver.findElement(By.xpath("//h5[normalize-space()='Kota Restaurants']"));
        System.out.println(kota.getText() + " Clicked");
        kota.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement lucknow = driver.findElement(By.xpath("//h5[normalize-space()='Lucknow Restaurants']"));
        System.out.println(lucknow.getText() + " Clicked");
        lucknow.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement ludhiana = driver.findElement(By.xpath("//h5[normalize-space()='Ludhiana Restaurants']"));
        System.out.println(ludhiana.getText() + " Clicked");
        ludhiana.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement madurai = driver.findElement(By.xpath("//h5[normalize-space()='Madurai Restaurants']"));
        System.out.println(madurai.getText() + " Clicked");
        madurai.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement manali = driver.findElement(By.xpath("//h5[normalize-space()='Manali Restaurants']"));
        System.out.println(manali.getText() + " Clicked");
        manali.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement mangalore = driver.findElement(By.xpath("//h5[normalize-space()='Mangalore Restaurants']"));
        System.out.println(mangalore.getText() + " Clicked");
        mangalore.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement manipal = driver.findElement(By.xpath("//h5[normalize-space()='Manipal Restaurants']"));
        System.out.println(manipal.getText() + " Clicked");
        manipal.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement meerut = driver.findElement(By.xpath("//h5[normalize-space()='Meerut Restaurants']"));
        System.out.println(meerut.getText() + " Clicked");
        meerut.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement mumbai = driver.findElement(By.xpath("//h5[normalize-space()='Mumbai Restaurants']"));
        System.out.println(mumbai.getText() + " Clicked");
        mumbai.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement mussoorie = driver.findElement(By.xpath("//h5[normalize-space()='Mussoorie Restaurants']"));
        System.out.println(mussoorie.getText() + " Clicked");
        mussoorie.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement mysore = driver.findElement(By.xpath("//h5[normalize-space()='Mysore Restaurants']"));
        System.out.println(mysore.getText() + " Clicked");
        mysore.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement nagpur = driver.findElement(By.xpath("//h5[normalize-space()='Nagpur Restaurants']"));
        System.out.println(nagpur.getText() + " Clicked");
        nagpur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement nainital = driver.findElement(By.xpath("//h5[normalize-space()='Nainital Restaurants']"));
        System.out.println(nainital.getText() + " Clicked");
        nainital.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement nashik = driver.findElement(By.xpath("//h5[normalize-space()='Nashik Restaurants']"));
        System.out.println(nashik.getText() + " Clicked");
        nashik.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement neemrana = driver.findElement(By.xpath("//h5[normalize-space()='Neemrana Restaurants']"));
        System.out.println(neemrana.getText() + " Clicked");
        neemrana.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement ooty = driver.findElement(By.xpath("//h5[normalize-space()='Ooty Restaurants']"));
        System.out.println(ooty.getText() + " Clicked");
        ooty.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement palakkad = driver.findElement(By.xpath("//h5[normalize-space()='Palakkad Restaurants']"));
        System.out.println(palakkad.getText() + " Clicked");
        palakkad.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement patiala = driver.findElement(By.xpath("//h5[normalize-space()='Patiala Restaurants']"));
        System.out.println(patiala.getText() + " Clicked");
        patiala.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement patna = driver.findElement(By.xpath("//h5[normalize-space()='Patna Restaurants']"));
        System.out.println(patna.getText() + " Clicked");
        patna.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement puducherry = driver.findElement(By.xpath("//h5[normalize-space()='Puducherry Restaurants']"));
        System.out.println(puducherry.getText() + " Clicked");
        puducherry.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement pune = driver.findElement(By.xpath("//h5[normalize-space()='Pune Restaurants']"));
        System.out.println(pune.getText() + " Clicked");
        pune.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement pushkar = driver.findElement(By.xpath("//h5[normalize-space()='Pushkar Restaurants']"));
        System.out.println(pushkar.getText() + " Clicked");
        pushkar.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement raipur = driver.findElement(By.xpath("//h5[normalize-space()='Raipur Restaurants']"));
        System.out.println(raipur.getText() + " Clicked");
        raipur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement rajkot = driver.findElement(By.xpath("//h5[normalize-space()='Rajkot Restaurants']"));
        System.out.println(rajkot.getText() + " Clicked");
        rajkot.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement ranchi = driver.findElement(By.xpath("//h5[normalize-space()='Ranchi Restaurants']"));
        System.out.println(ranchi.getText() + " Clicked");
        ranchi.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement rishikesh = driver.findElement(By.xpath("//h5[normalize-space()='Rishikesh Restaurants']"));
        System.out.println(rishikesh.getText() + " Clicked");
        rishikesh.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement salem = driver.findElement(By.xpath("//h5[normalize-space()='Salem Restaurants']"));
        System.out.println(salem.getText() + " Clicked");
        salem.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement shimla = driver.findElement(By.xpath("//h5[normalize-space()='Shimla Restaurants']"));
        System.out.println(shimla.getText() + " Clicked");
        shimla.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement siliguri = driver.findElement(By.xpath("//h5[normalize-space()='Siliguri Restaurants']"));
        System.out.println(siliguri.getText() + " Clicked");
        siliguri.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement srinagar = driver.findElement(By.xpath("//h5[normalize-space()='Srinagar Restaurants']"));
        System.out.println(srinagar.getText() + " Clicked");
        srinagar.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement surat = driver.findElement(By.xpath("//h5[normalize-space()='Surat Restaurants']"));
        System.out.println(surat.getText() + " Clicked");
        surat.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement thrissur = driver.findElement(By.xpath("//h5[normalize-space()='Thrissur Restaurants']"));
        System.out.println(thrissur.getText() + " Clicked");
        thrissur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement tirupati = driver.findElement(By.xpath("//h5[normalize-space()='Tirupati Restaurants']"));
        System.out.println(tirupati.getText() + " Clicked");
        tirupati.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement trichy = driver.findElement(By.xpath("//h5[normalize-space()='Trichy Restaurants']"));
        System.out.println(trichy.getText() + " Clicked");
        trichy.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement trivandrum = driver.findElement(By.xpath("//h5[normalize-space()='Trivandrum Restaurants']"));
        System.out.println(trivandrum.getText() + " Clicked");
        trivandrum.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement udaipur = driver.findElement(By.xpath("//h5[normalize-space()='Udaipur Restaurants']"));
        System.out.println(udaipur.getText() + " Clicked");
        udaipur.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement vadodara = driver.findElement(By.xpath("//h5[normalize-space()='Vadodara Restaurants']"));
        System.out.println(vadodara.getText() + " Clicked");
        vadodara.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement varanasi = driver.findElement(By.xpath("//h5[normalize-space()='Varanasi Restaurants']"));
        System.out.println(varanasi.getText() + " Clicked");
        varanasi.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement vellore = driver.findElement(By.xpath("//h5[normalize-space()='Vellore Restaurants']"));
        System.out.println(vellore.getText() + " Clicked");
        vellore.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement vijayawada = driver.findElement(By.xpath("//h5[normalize-space()='Vijayawada Restaurants']"));
        System.out.println(vijayawada.getText() + " Clicked");
        vijayawada.click();
        driver.navigate().back();
        Thread.sleep(200);

        WebElement visakhapatnam = driver.findElement(By.xpath("//h5[normalize-space()='Visakhapatnam Restaurants']"));
        System.out.println(visakhapatnam.getText() + " Clicked");
        visakhapatnam.click();
        driver.navigate().back();
        Thread.sleep(200);


	}
    
    @Then("user navigate all cities and close the browser")
	public void close () throws InterruptedException {
    	driver.quit();
	}
}
