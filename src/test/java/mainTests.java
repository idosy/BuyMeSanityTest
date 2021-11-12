import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class
mainTests {
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97252\\Desktop\\USA\\QA\\auto\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://buyme.co.il");
    }

    @Test
    public void test01_SignOnLoginButtonAndClick() {
        wait.until(ExpectedConditions.elementToBeClickable(By.className("seperator-link"))).click();
    }

    @Test
    public void test02_RegistrationButtonAndClick() {
        driver.get("https://buyme.co.il/?modal=login");
        wait.until(ExpectedConditions.elementToBeClickable(By.className("text-link theme"))).click();
    }

    @Test
    public void test03_FillRegistrationDetails() {
        driver.get("https://buyme.co.il/?modal=login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ember1482"))).sendKeys("Ido");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ember1487"))).sendKeys("automationest@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("valPass"))).sendKeys("Password1234!");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ember1490"))).sendKeys("Password1234!");

    }

//    @Test
//    public void test02_waitUntilElementIsVisibleAndSendKeys() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("source"))).sendKeys("hello");
//    }

    }

//    @AfterClass
//    public static void tearDown() {
//        driver.quit();
//    }
