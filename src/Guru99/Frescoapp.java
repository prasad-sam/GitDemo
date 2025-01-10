package Guru99;


import org.openqa.selenium.chrome.ChromeDriver;

public class Frescoapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\eclipse\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8000/index.html");
		// WebElement searchBox = driver.findElement(By.id("APjFqb"));
				// searchBox.sendKeys("frescoapps");
			      //  searchBox.submit();
		//WebElement firstlink = driver.findElement(By.cssSelector("h3"));
		//.click();

        

	}

}
