import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*****************************************************************************
 * Description: This is the first Selenium TestNG test.
 *              It opens swtestacademy homepage and prints and checks its title.
 *******************************************************************************/

public class FirstTest {

    //-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;

    //Declare a test URL variable
    public String testURL = "http://swtestacademy.com/";

    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest (){
        //Create a new ChromeDriver
      //  ChromeOptions chromeOptions = new ChromeOptions();
      //  chromeOptions.setBinary("C:\\Users\\anily\\IdeaProjects\\seleniumAutomation\\src\\main\\resources\\drivers\\chromedriver.exe");
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\anily\\IdeaProjects\\seleniumAutomation\\src\\main\\resources\\drivers\\chromedriver.exe");
       // driver = new ChromeDriver();
        System.out.println("Hello World");

        //Go to www.swtestacademy.com
      //  driver.navigate().to(testURL);
    }

    //-----------------------------------Tests-----------------------------------
    @Test
    public void firstTest () {
        //Get page title
        //String title = driver.getTitle();

        //Print page's title
      //  System.out.println("Page Title: " + title);

        //Assertion
        //Assert.assertEquals(title, "Software Test Academy", "Title assertion is failed!");
    }

    //-----------------------------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest (){
        //Close browser and end the session
        //driver.quit();
    }
}