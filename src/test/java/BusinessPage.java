import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BusinessPage extends BasePage{

    private WebDriver driver;
    //Build the constructor for Driver
    public BusinessPage(WebDriver driver){this.driver = driver;}

    //do Assert for Url got from selected parameters
    public void assertUrl()
    {
        Assert.assertEquals(driver.getCurrentUrl(),pickBusinessUrl);
    }
    //click on selected gift
    public void pickBusiness() throws Exception {
        clickElement(By.cssSelector("div[class='bottom']"));
    }
    //enter price for selected gift
    public void enterPrice() throws Exception {
        sendKeysToElement(By.cssSelector("input[placeholder='הכנס סכום']"),enterPrice);
    }
    //click on Button בחירה
    public void clickEnterPriceButton() throws Exception {
       clickElement(By.cssSelector("button[gtm='בחירה']"));
    }


}
