import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeScreen extends BasePage{

    private WebDriver driver;
    private static WebDriverWait wait;

    public void selectPrice() {
        Select priceDropDown = new Select(driver.findElement(By.id("ember1012_chosen")));
    }
    public void selectRegion() {
        Select regionDropDown = new Select(driver.findElement(By.id("ember1027_chosen")));
        regionDropDown.selectByIndex(1);
    }

}
