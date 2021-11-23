import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Collections;

public class SignOnAndRegistrationPage extends BasePage {
    private WebDriver driver;

    //Build the constructor for Driver
    public SignOnAndRegistrationPage(WebDriver driver){this.driver = driver;}

    //click on button  כניסה |הרשמה
    public void SignOnLoginButtonAndClick() throws Exception{clickElement(By.className(signOnLoginButton));}

    //click on button   הרשמה
    public void registrationButtonAndClick() throws Exception{clickElement(By.cssSelector("div.register-or-login > span"));}

    //insert First name to for registration, find String in Constants
    public void inputFirstName() throws Exception{sendKeysToElement(By.cssSelector(firstNameLocator),inputFirstName);}

    //insert Email to for registration, find String in Constants
    public void inputEmailAddress() throws Exception{sendKeysToElement(By.cssSelector(emailLocator),inputEmailAddress);}

    //insert Password to for registration, find String in Constants
    public void inputPassword() throws Exception{sendKeysToElement(By.cssSelector(passwordLocator),inputPassword);}

    //insert validation Password to for registration, find String in Constants
    public void inputValidationPassword() throws Exception {sendKeysToElement(By.cssSelector(passwordValLocator),inputPassword);}

    //do Assert for all String in registration fields
    public void assertAllFields() throws Exception {
        assertElement(By.cssSelector(firstNameLocator),"value",inputFirstName);
        assertElement(By.cssSelector(emailLocator),"value",inputEmailAddress);
        assertElement(By.cssSelector(passwordLocator),"value",inputPassword);
        assertElement(By.cssSelector(passwordValLocator)  ,"value",inputPassword);

    }
    //click on button  הרשמה ל-BUYME
    public void clickSubmitButton () throws Exception{clickElement(By.cssSelector("button[gtm='הרשמה ל-BUYME']"));}

}
