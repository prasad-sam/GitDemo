package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\eclipse\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		// driver.get("https://www.facebook.com/");
		 //System.out.println(driver.findElement(By.cssSelector("input#email")).getTagName());
		 //System.out.println(driver.findElement(By.cssSelector("input[name=\"email\"]")).getSize());
		 //System.out.println(driver.findElement(By.cssSelector("input.class[class=\"inputtext _55r1 _6luy _9npi\"]")).getTagName());
		 driver.get("http://demo.guru99.com/test/newtours/");
		 System.out.println(driver.findElement(By.cssSelector("font:contains('Password:')")).getTagName());
		 driver.quit();

	}

}
