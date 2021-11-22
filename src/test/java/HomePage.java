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

        clickElement(By.className("seperator-link"));
        sendKeysToElement(By.id("ember1450"),inputEmailAddress);
        sendKeysToElement(By.id("ember1454"),inputPassword);
        clickElement(By.id("ember1471"));
    }
    public void selectPrice() throws Exception {

     clickElement(By.xpath("/html/body/div[2]/div/header/div[3]/div/form/div[1]/a/span"));

    }
    public void selectRegion() throws Exception{
        Select regionDropDown = new Select(driver.findElement(By.id("ember1027")));
        regionDropDown.selectByIndex(1);
    }
    public void selectCategory()throws Exception{
        Select regionDropDown = new Select(driver.findElement(By.id("ember1037")));
        regionDropDown.selectByIndex(1);
    }
    public void pressFindMy() throws Exception {
        clickElement(By.className("ember1072"));
    }


}
