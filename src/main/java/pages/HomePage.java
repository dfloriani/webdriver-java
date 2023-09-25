package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    private WebDriver driver;
    private By links = By.tagName("a"); // List<WebElement> links = driver.findElements(links);
    private By inputsLink = By.linkText("Inputs");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    // private to make sure our tests don't call this
    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
