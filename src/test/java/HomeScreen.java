import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeScreen extends BasePage{

    private WebDriver driver;
    private static WebDriverWait wait;

    public void selectPrice() {
        Select priceDropDown = new Select(driver.findElement(By.id("ember1012")));
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

}
