import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BusinessScreen extends BasePage{

    private WebDriver driver;
    private static WebDriverWait wait;

    public void assertUrl()
    {
        Assert.assertEquals(driver.getCurrentUrl(),pickBusinessUrl);

    }
    public void pickBusiness(){
        driver.findElement(By.id("ember2551")).click();
    }
    public void enterPrice(){
        driver.findElement(By.id("ember2582")).sendKeys(enterPrice);
    }
    public void clickEnterPriceButton(){
        driver.findElement(By.id("ember2584")).click();
    }


}
