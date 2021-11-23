import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SenderAndReceiverInfoPage extends BasePage {

    private WebDriver driver;

    //Build the constructor for Driver
    public SenderAndReceiverInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    //click on button   למישהו אחר
    public void someoneElseButtonAndClick() throws Exception {clickElement(By.cssSelector("div[gtm='למישהו אחר']"));}

    //insert First name to for registration, find String in Constants
    public void inputFirstName() throws Exception {sendKeysToElement(By.cssSelector("input[maxlength='25']"), inputFirstName);}

    //select Event from DropDown menu
    public void selectEvent() throws Exception {
        clickElement(By.cssSelector("div[class='selected-name']"));
        clickElement(By.cssSelector("li[value='10']"));
    }

    //clear and enter blessing in blessing text area
    public void inputBlessing() throws Exception {
        clearTextInElement(By.cssSelector("textarea[data-parsley-group='voucher-greeting']"));
        sendKeysToElement(By.cssSelector("textarea[data-parsley-group='voucher-greeting']"),"your Welcome");
    }

    //upload picture
    public void uploadFile() throws Exception {sendKeysToElement(By.cssSelector("input[type='file']"), "C:\\Picture\\myPicture.jpg");}

    //click on button המשך
    public void submitButtonAndClick() throws Exception {clickElement(By.cssSelector("button[type='submit']"));}

    //choose to send by mail
    public void checkSendByEmail() throws Exception {
        List<WebElement> elementList = driver.findElements(By.cssSelector("div [class='toggle-icon ']"));
        elementList.get(1).click();
    }

    //insert mail from Constants
    public void enterReceiverMail() throws Exception {sendKeysToElement(By.cssSelector("input[type='email']"),inputEmailAddress);}

    ///insert First name to for registration, find String in Constants
    public void enterSenderName() throws Exception {sendKeysToElement(By.cssSelector("input[maxlength='25']"),inputFirstName);}

    //click on button המשך לתשלום
    public void paymentButtonAndClick() throws Exception {clickElement(By.cssSelector("button[class='ember-view bm-btn no-reverse main xl stretch']"));}


}





