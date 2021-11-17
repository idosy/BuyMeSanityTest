import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BasePage extends constants {
    public void clickElement(By locator) {

        getWebElement(locator).click();
    }

    public void sendKeysToElement(By locator, String text) {

        getWebElement(locator).sendKeys(text);
    }
    public void assertElement(By locator,String value ,String text)
    {
        Assert.assertEquals(getWebElement(locator).getAttribute(value),text);
    }

    private WebElement getWebElement(By locator) {
        return DriverSingleton.getChromeDriverInstance().findElement(locator);
    }
}
