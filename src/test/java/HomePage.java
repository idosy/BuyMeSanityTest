import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import java.time.Duration;
import java.util.List;

public class HomePage extends BasePage{

    private WebDriver driver;
   private static WebDriverWait wait;

    public HomePage(WebDriver driver){this.driver = driver;}

    //use this method for 'once login' tests
    public void doLogin() throws Exception {

        clickElement(By.className(signOnLoginButton));
        sendKeysToElement(By.cssSelector(emailLocator),inputEmailAddress);
        sendKeysToElement(By.cssSelector(passwordLocator),inputPassword);
        clickElement(By.cssSelector("button[gtm='כניסה ל-BUYME']"));
    }
    public void selectPrice() throws Exception {
        clickElement(By.linkText("סכום"));
        List<WebElement> elementList = driver.findElements(By.className("active-result"));
        elementList.get(2).click();
    }
    public void selectRegion() throws Exception{
        clickElement(By.linkText("אזור"));
        clickElement(By.cssSelector("option[value='1']"));
    }
    public void selectCategory()throws Exception{
        clickElement(By.linkText("קטגוריה"));
        clickElement(By.cssSelector("option[value='1']"));
    }
    public void pressFindMy() throws Exception {
        clickElement(By.className("ui-btn search ember-view"));
    }


}
