package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden() {
        var example1Page = homePage.clickDynamicLoading().clickExample1();
        example1Page.clickStart();
        assertEquals(example1Page.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    @Test
    public void testWaitUntilRendered() {
        var example2Page = homePage.clickDynamicLoading().clickExample2();
        example2Page.clickStart();
        assertEquals(example2Page.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
