package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.sql.SQLOutput;
import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage; // protected so the classes after have access to it

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        goHome();

        // driver.manage().window().fullscreen();
        // other options would be: maximize or setSize passing dimensions

        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
