import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SenderAndReceiverInfoPage extends BasePage {

    private WebDriver driver;
    private static WebDriverWait wait;

    public SenderAndReceiverInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void someoneElseButtonAndClick() {

        driver.findElement(By.id("ember1236")).click();
    }

    public void inputFirstName() {
        driver.findElement(By.id("ember1246")).sendKeys(inputFirstName);
    }

    public void selectEvent() {

        driver.findElement(By.id("ember1524")).click();
//        Select eventDropDown = new Select(driver.findElement(By.id("ember1524")));
        Select eventDropDown = new Select(driver.findElement(By.cssSelector("div[class='input-label-wrapper']")));
        eventDropDown.selectByIndex(2);
    }

    public void inputBlessing() {
        driver.findElement(By.cssSelector("textarea[data-parsley-group='voucher-greeting']")).clear();
        driver.findElement(By.cssSelector("textarea[data-parsley-group='voucher-greeting']")).sendKeys("your Welcome");
    }

    public void uploadFile() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ember1261"))).sendKeys("C:\\Pictures\\myPicture.jpg");
    }

    public void submitButtonAndClick() {
        //need to find the right locator
        driver.findElement(By.id("ember1269")).click();
    }

    public void checkSendByEmail() {
        //need to find the right locator
        driver.findElement(By.cssSelector("path[d='M35,69.5c9.5,0,18.2-3.9,24.4-10.1S69.5,44.5,69.5,35s-3.9-18.2-10.1-24.4S44.5,0.5,35,0.5\n" +
                "            S16.8,4.4,10.6,10.6S0.5,25.5,0.5,35s3.9,18.2,10.1,24.4S25.5,69.5,35,69.5z']")).click();
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





