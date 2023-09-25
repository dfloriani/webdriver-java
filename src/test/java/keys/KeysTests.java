package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace() {
        var keyPressPage = homePage.clickKeyPresses();
        keyPressPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi() {
        var keyPressPage = homePage.clickKeyPresses();
        keyPressPage.enterPi();
    }
}
