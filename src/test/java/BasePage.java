import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;

public class BasePage extends constants {

    private static ChromeDriver driver;
    private static ExtentReports extent= new ExtentReports();
    private static ExtentTest test = extent.createTest("BuyMeSanityTests", "Description");


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
        WebDriver driver = DriverSingleton.getDriverInstance();
        try {
            WebElement webElement = driver.findElement(locator);
            return webElement;
        } catch (NoSuchElementException e) {
            test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath(TakeScreenShot.takeScreenShot(driver, "C:\\Users\\97252\\IdeaProjects\\BuyMeSanityTest\\picName")).build());
            e.printStackTrace();
            throw new Exception(e.getMessage());

        }
    }


}



