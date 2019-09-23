package testMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenTest {

	
		WebDriver driver;
		
		@Test
		public void run() throws Exception
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Sanjay\\Selenium_Training\\MavenProject\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.edureka.co/");
		driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
		//driver.findElement(By.xpath("//input[@class='control_place popusreml']")).clear();
		driver.findElement(By.id("si_popup_email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("si_popup_email")).sendKeys("c44636@urhen.com");
		
		driver.findElement(By.id("si_popup_passwd")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("si_popup_passwd")).sendKeys("Testing@2009");
		
		//driver.findElement(By.xpath("//input[@class='control_place popusreml']")).sendKeys("c44636@urhen.com");
		//driver.findElement(By.xpath("//input[@type='password']")).clear();
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing@2009");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.quit();
		}

	}


