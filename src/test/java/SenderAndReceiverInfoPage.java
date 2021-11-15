import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SenderAndReceiverInfoPage extends BasePage {

    private WebDriver driver;
    private static WebDriverWait wait;

    public SenderAndReceiverInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void someoneElseButtonAndClick() {
        driver.findElement(By.id("ember1864")).click();
    }

    public void inputFirstName() {
        driver.findElement(By.id("ember1868")).sendKeys(inputFirstName);
    }

    public void selectEvent() {
        Select eventDropDown = new Select(driver.findElement(By.className("eventType")));
        eventDropDown.selectByIndex(1);
    }

    public void inputBlessing() {
        driver.findElement(By.cssSelector("textarea[data-parsley-group='voucher-greeting']")).clear();
        driver.findElement(By.cssSelector("textarea[data-parsley-group='voucher-greeting']")).sendKeys("your Welcome");
    }

    public void uploadFile() {
        driver.findElement(By.id("ember1884")).sendKeys("C:\\Pictures\\myPicture.jpg");
    }

    public void submitButtonAndClick() {
        //need to find the right locator
        driver.findElement(By.id("")).click();
    }

    public void checkSendByEmail() {
        //need to find the right locator
        driver.findElement(By.id("")).click();
    }

    public void enterReceiverMail() {
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys(inputEmailAddress);
    }
    public void enterSenderName() {
        driver.findElement(By.id("ember2043")).sendKeys(inputFirstName);
    }
    public void paymentButtonAndClick() {
        driver.findElement(By.id("ember2142")).click();
    }


}





