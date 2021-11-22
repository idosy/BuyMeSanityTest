import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BasePage extends constants {

    public WebElement findReqElement(By locator) throws Exception {
       return getWebElement(locator);

    }
    public void clickElement(By locator) throws Exception {

        getWebElement(locator).click();
    }
    public void sendKeysToElement (By locator, String text) throws Exception {

        getWebElement(locator).sendKeys(text);
    }
    public void assertElement(By locator,String value ,String text) throws Exception {
        Assert.assertEquals(getWebElement(locator).getAttribute(value),text);
    }
    public void clearTextInElement(By locator) throws Exception {
        getWebElement(locator).clear();
    }

    private WebElement getWebElement(By locator) throws Exception {

        return DriverSingleton.getDriverInstance().findElement(locator);
    }


}
