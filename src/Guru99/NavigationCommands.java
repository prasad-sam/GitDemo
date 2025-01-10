package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
		 WebElement search = driver.findElement(By.id("APjFqb"));
				 search.sendKeys("fresco play");
		search.sendKeys(Keys.ENTER);	
		
		  WebElement sr = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/h3"));
		  sr.click();
		 System.out.println(driver.getTitle());
		driver.navigate().to(("https://www.example.com"));
         driver.navigate().back();
         driver.navigate().forward();
         driver.navigate().refresh();
         System.out.println(driver.getTitle());
         driver.close();


	}

}
