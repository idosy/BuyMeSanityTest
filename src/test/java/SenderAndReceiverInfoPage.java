import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SenderAndReceiverInfoPage extends BasePage {

    private WebDriver driver;
    private static WebDriverWait wait;

    public SenderAndReceiverInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void someoneElseButtonAndClick() throws Exception {

       clickElement(By.cssSelector("div[gtm='למישהו אחר']"));
    }

    public void inputFirstName() throws Exception {
        sendKeysToElement(By.cssSelector("input[maxlength='25']"), inputFirstName);
    }

    public void selectEvent() throws Exception {

        clickElement(By.cssSelector("div[class='selected-name']"));
        clickElement(By.cssSelector("li[value='10']"));
    }

    public void inputBlessing() throws Exception {
        clearTextInElement(By.cssSelector("textarea[data-parsley-group='voucher-greeting']"));
        sendKeysToElement(By.cssSelector("textarea[data-parsley-group='voucher-greeting']"),"your Welcome");
    }

    public void uploadFile() throws Exception {
        sendKeysToElement(By.cssSelector("input[type='file']"), "C:\\Picture\\myPicture.jpg");
    }

    public void submitButtonAndClick() throws Exception {
        clickElement(By.cssSelector("button[type='submit']"));
    }

    public void checkSendByEmail() throws Exception {
        List<WebElement> elementList = driver.findElements(By.cssSelector("div [class='toggle-icon ']"));
        elementList.get(1).click();
    }

    public void enterReceiverMail() throws Exception {
        sendKeysToElement(By.cssSelector("input[type='email']"),inputEmailAddress);
    }
    public void enterSenderName() throws Exception {
        sendKeysToElement(By.cssSelector("input[maxlength='25']"),inputFirstName);
    }
    public void paymentButtonAndClick() throws Exception {
        clickElement(By.cssSelector("button[class='ember-view bm-btn no-reverse main xl stretch']"));
    }


}





