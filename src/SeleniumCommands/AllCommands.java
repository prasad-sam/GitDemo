package SeleniumCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrier.chrome.driver","C:\\Users\\prasa\\eclipse\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		//WebDriver driver = new Firefoxdriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new WebDriver();
		//WebDriver Driver = new RemoteWebDriver();
		
		driver.get("");
		driver.navigate().to("");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
