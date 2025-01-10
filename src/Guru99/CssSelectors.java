package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

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
		WebElement sf = driver.findElement(By.cssSelector("h3[class=\"LC20lb MBeuO DKV0Md\"]"));
		sf.click();
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
