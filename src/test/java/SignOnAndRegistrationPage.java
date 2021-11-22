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

    public void SignOnLoginButtonAndClick() throws Exception{clickElement(By.className("seperator-link"));}

    public void registrationButtonAndClick() throws Exception{clickElement(By.cssSelector("div.register-or-login > span"));}

    public void inputFirstName() throws Exception{sendKeysToElement(By.id("ember1482"),inputFirstName);}

    public void inputEmailAddress() throws Exception{sendKeysToElement(By.id("ember1485"),inputEmailAddress);}

    public void inputPassword() throws Exception{sendKeysToElement(By.id("valPass"),inputPassword);}

    public void inputValidationPassword() throws Exception {sendKeysToElement(By.id("ember1490"),inputPassword);}

    public void assertAllFields() throws Exception {
        assertElement(By.id("ember1482"),"value",inputFirstName);
        assertElement(By.id("ember1485"),"value",inputEmailAddress);

        //tests will fail remark password Actual value is NULL
        assertElement(By.id("valPass"),"value",inputPassword);
        assertElement(By.id("ember1490"),"value",inputPassword);

    }

    public void clickSubmitButton () throws Exception{clickElement(By.className("label"));}

}
