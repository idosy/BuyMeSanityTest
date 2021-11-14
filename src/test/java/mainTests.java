import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class
mainTests {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static SignOnAndRegistrationScreen loginPage;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97252\\Desktop\\USA\\QA\\auto\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://buyme.co.il");
    }

    @Test
    public void test01_SignOnLoginButtonAndClick() {

        loginPage = new SignOnAndRegistrationScreen(driver);
        loginPage.SignOnLoginButtonAndClick();
    }

    @Test
    public void test02_RegistrationButtonAndClick() {
        loginPage.registrationButtonAndClick();
    }

   @Test
    public void test03_FillRegistrationDetails() {
       loginPage.inputFirstName();
       loginPage.inputEmailAddress();
       loginPage.inputPassword();
       loginPage.inputValidationPassword();
    }

    @Test
    public void test04_assertAllFields() {

        loginPage.assertAllFileds();

    }

    @Test
    public void test05_wclickSubmitButton() {
        loginPage.clickSubmitButton();
    }


//    @AfterClass
//    public static void tearDown() {
//        driver.quit();
//    }
}
