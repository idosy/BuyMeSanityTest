import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Collections;

public class SignOnAndRegistrationScreen extends BasePage {
    private WebDriver driver;
    private static WebDriverWait wait;

    public SignOnAndRegistrationScreen(WebDriver driver){

        this.driver = driver;
    }
    public void SignOnLoginButtonAndClick(){
        //clickElement(By.className("seperator-link"));
        driver.findElement(By.className("seperator-link")).click();
    }
    public void registrationButtonAndClick(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.register-or-login > span"))).click();

    }
    public void inputFirstName(){
      //  sendKeysToElement(By.id("ember1482"),inputFirstName);
        driver.findElement(By.id("ember1482")).sendKeys(inputFirstName);

    }
    public void inputEmailAddress(){
        driver.findElement(By.id("ember1485")).sendKeys(inputEmailAddress);
    }
    public void inputPassword(){
        driver.findElement(By.id("valPass")).sendKeys(inputPassword);
    }
    public void inputValidationPassword(){
       driver.findElement(By.id("ember1490")).sendKeys(inputPassword);
    }
    public void assertAllFileds(){
        WebElement firstName = driver.findElement(By.id("ember1482"));
        Assert.assertEquals(firstName.getAttribute("value"),inputFirstName);
        WebElement emailAddress = driver.findElement(By.id("ember1485"));
        Assert.assertEquals(emailAddress.getAttribute("value"),inputEmailAddress);
        //tests in remark because password value is NULL
//        WebElement inPassword = driver.findElement(By.id("valPass"));
//        Assert.assertEquals(inPassword.getAttribute("value"),inputPassword);
//        WebElement inputValidationPassword = driver.findElement(By.id("ember1490"));
//        Assert.assertEquals(inputValidationPassword.getAttribute("value"),inputPassword);


    }
    public void clickSubmitButton (){
        driver.findElement(By.className("label")).click();
    }

}
