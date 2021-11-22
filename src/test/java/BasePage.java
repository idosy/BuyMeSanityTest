import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class BasePage extends constants {

    // create the report object, path and name
    private static ExtentReports extent= new ExtentReports();
    private static ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

    private static ChromeDriver driver;



    public WebElement findReqElement(By locator) throws Exception {
       return getWebElement(locator);

    }
    //Click on Element by request Locator
    public void clickElement(By locator) throws Exception {

        getWebElement(locator).click();
    }
    //Send Keys Element by request Locator
    public void sendKeysToElement (By locator, String text) throws Exception {

        getWebElement(locator).sendKeys(text);
    }
    //Assert Between Element request Locator and request String
    public void assertElement(By locator,String value ,String text) throws Exception {
        Assert.assertEquals(getWebElement(locator).getAttribute(value),text);
    }
    ///Clear Text in Element by request Locator
    public void clearTextInElement(By locator) throws Exception {
        getWebElement(locator).clear();
    }
    // Get Web Element
    private WebElement getWebElement(By locator) throws Exception {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(XmlReader.getData("reportPath"));
        extent.attachReporter(htmlReporter);
        try {
            return DriverSingleton.getDriverInstance().findElement(locator);

        } catch (NoSuchElementException e) {
            e.printStackTrace();
            String timeNow = String.valueOf(System.currentTimeMillis());
            test.log(Status.FAIL, "Cant Find Element",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
            return DriverSingleton.getDriverInstance().findElement(locator);
        }

    }

    private static String takeScreenShot(String ImagesPath) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(ImagesPath + ".png");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ImagesPath + ".png";
    }
}
