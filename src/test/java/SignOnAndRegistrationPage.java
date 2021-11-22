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

    public SignOnAndRegistrationPage(WebDriver driver){this.driver = driver;}

    public void SignOnLoginButtonAndClick() throws Exception{clickElement(By.className(signOnLoginButton));}

    public void registrationButtonAndClick() throws Exception{clickElement(By.cssSelector("div.register-or-login > span"));}

    public void inputFirstName() throws Exception{sendKeysToElement(By.cssSelector(firstNameLocator),inputFirstName);}

    public void inputEmailAddress() throws Exception{sendKeysToElement(By.cssSelector(emailLocator),inputEmailAddress);}

    public void inputPassword() throws Exception{sendKeysToElement(By.cssSelector(passwordLocator),inputPassword);}

    public void inputValidationPassword() throws Exception {sendKeysToElement(By.cssSelector(passwordValLocator),inputPassword);}

    public void assertAllFields() throws Exception {
        assertElement(By.cssSelector(firstNameLocator),"value",inputFirstName);
        assertElement(By.cssSelector(emailLocator),"value",inputEmailAddress);

        //tests will fail remark password Actual value is NULL
        assertElement(By.cssSelector(passwordLocator),"value",inputPassword);
        assertElement(By.cssSelector(passwordValLocator)  ,"value",inputPassword);

    }

    public void clickSubmitButton () throws Exception{clickElement(By.cssSelector("button[gtm='הרשמה ל-BUYME']"));}

}
