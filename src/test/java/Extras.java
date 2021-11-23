import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;


public class Extras extends BasePage{

    private WebDriver driver;

    //Build the constructor for Driver
    public Extras(WebDriver driver) {
        this.driver = driver;
    }


    public void doLogOut () throws Exception{

        clickElement(By.linkText("החשבון שלי"));
        clickElement(By.linkText("יציאה"));
    }
    //click on button  כניסה |הרשמה
    public void SignOnLoginButtonAndClick() throws Exception{clickElement(By.className(signOnLoginButton));}

    public void clickSubmitButton () throws Exception{clickElement(By.cssSelector("button[gtm='כניסה ל-BUYME']"));}

    //Assert error Fields
    public void assertErrorFields() throws Exception {


        List<WebElement> elementList1 = driver.findElements(By.cssSelector("ul[class='parsley-errors-list filled']"));
        Assert.assertEquals(elementList1.get(0).getText(),errorMessageRedPop);
        Assert.assertEquals(elementList1.get(1).getText(),errorMessageRedPop);


    }
    //Get Element color
    public void getElementColor(){
        WebElement element = driver.findElement(By.cssSelector("div[class='label bottom-xs']"));
        System.out.println(element.getCssValue("color"));


    }
}
