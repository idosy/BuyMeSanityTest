import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BusinessPage extends BasePage{

    private WebDriver driver;
    private static WebDriverWait wait;

    public BusinessPage(WebDriver driver){this.driver = driver;}

    public void assertUrl()
    {
        Assert.assertEquals(driver.getCurrentUrl(),pickBusinessUrl);

    }
    public void pickBusiness() throws Exception {
        clickElement(By.cssSelector("div[class='bottom']"));
    }
    public void enterPrice() throws Exception {
        sendKeysToElement(By.cssSelector("input[placeholder='הכנס סכום']"),enterPrice);
    }
    public void clickEnterPriceButton() throws Exception {
       clickElement(By.cssSelector("button[gtm='בחירה']"));
    }


}
