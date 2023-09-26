package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Incorrect text result");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.getAlertText();
        alertsPage.dismissAlert();
        assertEquals(text, "I am a JS Confirm", "Incorrect alert text");
        assertEquals(alertsPage.getResult(), "You clicked: Cancel", "Incorrect text result");
    }

    @Test
    public void testSetInputInAlert() {
        var alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerPrompt();
        String text = "some cool input";
        alertsPage.setAlertInput(text);
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Incorrect text result");
    }

}
