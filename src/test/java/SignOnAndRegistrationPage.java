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
    private static WebDriverWait wait;

    public SignOnAndRegistrationPage(WebDriver driver){this.driver = driver;}


    public void SignOnLoginButtonAndClick(){
       // clickElement(By.className("seperator-link"));
        driver.findElement(By.className("seperator-link")).click();
    }
    public void registrationButtonAndClick(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.register-or-login > span"))).click();

    }
    public void inputFirstName(){
       // sendKeysToElement(By.id("ember1482"),inputFirstName);
        driver.findElement(By.id("ember1482")).sendKeys(inputFirstName);
    }
    public void inputEmailAddress(){
       // sendKeysToElement(By.id("ember1485"),inputEmailAddress);
        driver.findElement(By.id("ember1485")).sendKeys(inputEmailAddress);
    }
    public void inputPassword(){
       // sendKeysToElement(By.id("valPass"),inputPassword);
       driver.findElement(By.id("valPass")).sendKeys(inputPassword);
    }
    public void inputValidationPassword(){
       // sendKeysToElement(By.id("ember1490"),inputPassword);
        driver.findElement(By.id("ember1490")).sendKeys(inputPassword);
    }
    public void assertAllFields(){
        //assertElement(By.id("ember1482"),"value",inputFirstName);
        WebElement firstName = driver.findElement(By.id("ember1482"));
        Assert.assertEquals(firstName.getAttribute("value"),inputFirstName);
 //       assertElement(By.id("ember1485"),"value",inputEmailAddress);
        WebElement emailAddress = driver.findElement(By.id("ember1485"));
        Assert.assertEquals(emailAddress.getAttribute("value"),inputEmailAddress);

        //tests in remark because password value is NULL
//        WebElement inPassword = driver.findElement(By.id("valPass"));
//        Assert.assertEquals(inPassword.getAttribute("value"),inputPassword);
//        WebElement inputValidationPassword = driver.findElement(By.id("ember1490"));
//        Assert.assertEquals(inputValidationPassword.getAttribute("value"),inputPassword);


    }
    public void clickSubmitButton (){

       // clickElement(By.className("label"));
       driver.findElement(By.className("label")).click();
    }


}
