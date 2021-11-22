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

    public void someoneElseButtonAndClick() throws Exception {

       clickElement(By.id("ember1236"));
    }

    public void inputFirstName() throws Exception {
        sendKeysToElement(By.id("ember1246"), inputFirstName);
    }

    public void selectEvent() throws Exception {

        clickElement(By.cssSelector("div[data-ember-action='1558']"));
        clickElement(By.id("ember1560"));
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
        //clickElement(By.cssSelector("path [class='icon']"));
        clickElement(By.cssSelector("path[d='M35,69.5c9.5,0,18.2-3.9,24.4-10.1S69.5,44.5,69.5,35s-3.9-18.2-10.1-24.4S44.5,0.5,35,0.5\n" +
                "            S16.8,4.4,10.6,10.6S0.5,25.5,0.5,35s3.9,18.2,10.1,24.4S25.5,69.5,35,69.5z']"));
    }

    public void enterReceiverMail() throws Exception {
        sendKeysToElement(By.cssSelector("input[type='email']"),inputEmailAddress);
    }
    public void enterSenderName() throws Exception {
        sendKeysToElement(By.cssSelector("input[maxlength='25']"),inputFirstName);
    }
    public void paymentButtonAndClick() throws Exception {
        clickElement(By.cssSelector("button [gtm='המשך לתשלום']"));
    }


}





