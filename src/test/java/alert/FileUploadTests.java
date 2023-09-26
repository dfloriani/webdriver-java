package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static utils.ConfigReader.getFileName;
import static utils.ConfigReader.getFilePath;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() throws IOException {
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile(getFilePath());
        assertEquals(fileUploadPage.getUploadedFiles(), getFileName(), "Uploaded file incorrect");
    }
}
