package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import java.io.IOException;

import static org.testng.Assert.*;
import static utils.ConfigReader.getPassword;
import static utils.ConfigReader.getUsername;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() throws IOException {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername(getUsername());
        loginPage.setPassword(getPassword());
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
