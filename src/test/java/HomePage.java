import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{

    private WebDriver driver;
    private static WebDriverWait wait;

    public HomePage(WebDriver driver){this.driver = driver;}

    public void selectPrice() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        Select priceDropDown = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("chosen-results"))));
        priceDropDown.selectByIndex(1);
    }
    public void selectRegion() {
        Select regionDropDown = new Select(driver.findElement(By.id("ember1027")));
        regionDropDown.selectByIndex(1);
    }
    public void selectCategory() {
        Select regionDropDown = new Select(driver.findElement(By.id("ember1037")));
        regionDropDown.selectByIndex(1);
    }
    public void pressFindMy() {
        driver.findElement(By.className("ember1072")).click();
    }

    //use this method for 'once login' tests
    public void doLogin() {

        driver.findElement(By.className("seperator-link")).click();
        driver.findElement(By.id("ember1450")).sendKeys(inputEmailAddress);
        driver.findElement(By.id("ember1454")).sendKeys(inputPassword);
        driver.findElement(By.id("ember1471")).click();
    }
}
