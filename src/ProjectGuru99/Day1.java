package ProjectGuru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\eclipse\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr552097");
		driver.findElement(By.name("password")).sendKeys("qUtUjet");
		driver.findElement(By.name("btnLogin")).click();
		WebElement out= driver.findElement(By.cssSelector("marquee.heading3"));
		System.out.println(out.getText());
		

	}

}
