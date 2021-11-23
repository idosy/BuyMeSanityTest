import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;


public class Extras extends BasePage{

    private WebDriver driver;

    //Build the constructor for Driver
    public Extras(WebDriver driver) {
        this.driver = driver;
    }

    //click on button  כניסה |הרשמה
    public void SignOnLoginButtonAndClick() throws Exception{clickElement(By.className(signOnLoginButton));}

    public void clickSubmitButton () throws Exception{clickElement(By.cssSelector("button[gtm='כניסה ל-BUYME']"));}

    public void assertErrorFields(){
        List<WebElement> elementList1 = driver.findElements(By.cssSelector("ul[class='parsley-errors-list filled']"));
        Assert.assertEquals(elementList1.get(0).getText(),errorMessageRedPop);
        Assert.assertEquals(elementList1.get(1).getText(),"errorMessageRedPop");


    }
}
