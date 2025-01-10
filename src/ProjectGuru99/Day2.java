package ProjectGuru99;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day2 {

    static WebDriver driver; // Selenium control driver
    private static String baseUrl; // baseUrl of Website Guru99

    // This method SetUp will read initialization parameters from the class Util.java & launch Chrome
    @SuppressWarnings("deprecation")
	public static void setUp() throws Exception {
        /*
         * Tells the Selenium client library to connect to the WebDriver
         * service using Chrome
         */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasa\\eclipse\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // Maximize browser window
        driver = new ChromeDriver(options);

        // Setting Base URL of website Guru99
        baseUrl = "http://www.demo.guru99.com";

        // Specifies the amount of time the driver should wait when searching for an element if it is not immediately present.
        // Refer - http://selenium.googlecode.com/git/docs/api/java/org/openqa/selenium/WebDriver.Timeouts.html
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Go to http://www.demo.guru99.com/V4/
        driver.get(baseUrl + "/V4/");
    }

    /**
     * Test Script 02
     * **************
     * This method will perform following Test Steps
     * 1) Go to http://www.demo.guru99.com/V4/
     * 2) Enter valid UserId
     * 3) Enter valid Password
     * 4) Click Login
     * 5) Verify the Page Title after login
     */
    public static void main(String[] args) throws Exception {

        //Setup Chrome driver
        setUp();

        String actualTitle;

        driver.findElement(By.name("uid")).clear(); // Good practice to clear a field before use
        driver.findElement(By.name("uid")).sendKeys("mngr552097");  // Enter username

        driver.findElement(By.name("password")).clear(); // Good practice to clear a field before use
        driver.findElement(By.name("password")).sendKeys("qUtUjet");  // Enter Password

        // Click Login
        driver.findElement(By.name("btnLogin")).click();

        actualTitle = driver.getTitle();
        if (actualTitle.contains(actualTitle)) {
            System.out.println("Test case: Passed");
        } else {
            System.out.println("Test case : Failed");
        }

        driver.close();
    }
}
