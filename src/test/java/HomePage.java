import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePage extends BasePage{

    private WebDriver driver;

    //Build the constructor for Driver
    public HomePage(WebDriver driver){this.driver = driver;}

    //use this method for 'once login' tests
    public void doLogin() throws Exception {

        clickElement(By.className(signOnLoginButton));
        sendKeysToElement(By.cssSelector(emailLocator),inputEmailAddress);
        sendKeysToElement(By.cssSelector(passwordLocator),inputPassword);
        clickElement(By.cssSelector("button[gtm='כניסה ל-BUYME']"));
    }
    //choose a Price for a gift
    public void selectPrice() throws Exception {
        clickElement(By.linkText("סכום"));
        List<WebElement> elementList = driver.findElements(By.className("active-result"));
        elementList.get(1).click();
    }
    //chose Region for a gift
    public void selectRegion() throws Exception{
        clickElement(By.linkText("אזור"));
        List<WebElement> elementList = driver.findElements(By.className("active-result"));
        elementList.get(1).click();clickElement(By.cssSelector("option[value='1']"));
    }
    //choose Category for a gift
    public void selectCategory()throws Exception{
        clickElement(By.linkText("קטגוריה"));
        List<WebElement> elementList = driver.findElements(By.className("active-result"));
        elementList.get(1).click();clickElement(By.cssSelector("option[value='1']"));
    }
    //click on button   תמצאו לי מתנה
    public void pressFindMy() throws Exception {
        clickElement(By.linkText("תמצאו לי מתנה"));
    }


}
