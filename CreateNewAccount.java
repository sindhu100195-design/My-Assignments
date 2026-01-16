package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //Load the url
	  	driver.get("https://en-gb.facebook.com/");
		
		//Maximise the window
		driver.manage().window().maximize();
		
		//Create new account
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter the firstname
		driver.findElement(By.name("firstname")).sendKeys("Krithin");
		
		//Enter the surname
		driver.findElement(By.name("lastname")).sendKeys("Prasad");
		
		//Enter the mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("amuthasundar@gmail.com");
		
		//Enter the new password
		driver.findElement(By.id("password_step_input")).sendKeys("Krithin@0809");
		
		//select the date
		WebElement element = driver.findElement(By.id("day"));
		
		//create object for date
		Select day = new Select(element);
		
		//select 8 as date
		day.selectByIndex(8);
		
		//Select the month
		WebElement element2 = driver.findElement(By.id("month"));
		
		//Create object for month
		Select month = new Select(element2);
		
		//Select September as month
		month.selectByVisibleText("Sep");
		
		//select the year
		WebElement element3 = driver.findElement(By.id("year"));
		
		//Select object for year
		Select year = new Select(element3);
		
		//Select 2022 as year
		year.selectByValue("2000");
		
		//select the gender
		driver.findElement(By.xpath("//label[text() = 'Male']")).click();
		
		//Close the browser
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
