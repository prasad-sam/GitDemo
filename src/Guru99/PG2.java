package Guru99;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PG2 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\eclipse\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
       
        /*driver.get("http://www.facebook.com");
		 System.out.println("Page title is : " + driver.getTitle());
		 System.out.println(driver.getPageSource());
		 System.out.println(driver.getCurrentUrl());
		 System.out.println("((WebElement) driver).getText()");
    
        System.out.println(driver.findElement(By.id("email")).getTagName());
        System.out.println(driver.findElement(By.name("pass")).getTagName());
        System.out.println(driver.findElement(By.name("pass")).getText());*/
        driver.navigate().to("http://www.facebook.com");
        System.out.println("Page title is : " + driver.getTitle());
        driver.navigate().back();
        System.out.println("Hello");
        driver.navigate().forward();
        System.out.println("Hello2");
        driver.navigate().refresh();
        System.out.println("Hello3");

        
        driver.close();
        System.exit(0);
        
        
}
}