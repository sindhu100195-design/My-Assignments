package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		//Launch the Browser
		ChromeDriver driver =  new ChromeDriver(opt);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click the button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on crm/sfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter  Account Name
		driver.findElement(By.id("accountName")).sendKeys("Sinduja");
		
		//Enter the description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		//Step1-find the industry tab
		WebElement element = driver.findElement(By.name("industryEnumId"));
		
		//Step2.Create object
		Select options = new Select(element);
		
		//Step3:Use method to select computer software 
		options.selectByIndex(3);
		
		//Step1-find the Ownership tab
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
				
		//Step2.Create object
		Select options1 = new Select(element2);
				
		//Step3:Use method to select S-corporation 
		options1.selectByVisibleText("S-Corporation");
		
		
		//Step1-find the source tab
		WebElement element3 = driver.findElement(By.id("dataSourceId"));
						
		//Step2.Create object
		Select options2 = new Select(element3);
						
		//Step3:Use method to select Employee
		options2.selectByValue("LEAD_EMPLOYEE");
		
		//Step1-find the marketing campaign tab
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
								
		//Step2.Create object
		Select options3 = new Select(element4);
								
		//Step3:Use method to select eCommerce Site Internal Campaign
		options3.selectByIndex(6);
		
		//Step1-find the state tab
		WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
										
		//Step2.Create object
		Select options4 = new Select(element5);
										
		//Step3:Use method to select texas
		options4.selectByValue("TX");
		
		//Click the create account button
		driver.findElement(By.className("smallSubmit")).click();
		
		//close the browser
		driver.close();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
