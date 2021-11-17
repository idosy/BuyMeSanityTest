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
    public void pickBusiness(){
        driver.findElement(By.id("ember1366")).click();
    }
    public void enterPrice(){
        driver.findElement(By.id("ember1479")).sendKeys(enterPrice);
    }
    public void clickEnterPriceButton(){
        driver.findElement(By.id("ember1487")).click();
    }


}
