import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class
mainTests {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static SignOnAndRegistrationPage loginPage;
    private static HomePage homePage;
    private static BusinessPage businessPage;
    private static SenderAndReceiverInfoPage infoPage;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97252\\Desktop\\USA\\QA\\auto\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://buyme.co.il");
       // driver.get("https://buyme.co.il/search?budget=1&category=337&region=13");
        //driver.get("https://buyme.co.il/money/17573200?price=200");
    }
//SignOn And Registration Screen tests
    @Test
    public void test01_SignOnLoginButtonAndClick() {

        loginPage = new SignOnAndRegistrationPage(driver);
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

        loginPage.assertAllFields();

    }

    @Test
    public void test05_clickSubmitButton() {
        loginPage.clickSubmitButton();
    }


//Home Screen tests
  @Test
  public void test06_pickPrice() {
//    //this is for testes while logged in
      homePage = new HomePage(driver);
      homePage.doLogin();
      homePage.selectPrice();
}
//    @Test
//    public void test07_pickRegion() {
//        homePage.selectRegion();
//    }
//    @Test
//    public void test08_pickCategory() {
//        homePage.selectCategory();
//        }
//    @Test
//    public void test09_pressFindMy() {
//        homePage.pressFindMy();
//    }

////Pick business Screen tests
//    @Test
//    public void test10_assertUrlBusinessScreen(){
//        businessPage = new BusinessPage(driver);
//        businessPage.assertUrl();
//    }
//    @Test
//    public void test11_pickBusiness(){
//        businessPage.pickBusiness();
//    }
//    @Test
//    public void test12_enterPriceAndClick(){
//        businessPage.enterPrice();
//        businessPage.clickEnterPriceButton();
//    }
//Sender and Receiver Screen tests
//
//    @Test
//    public void test13_someoneElseButtonAndClick(){
//        infoPage = new SenderAndReceiverInfoPage(driver);
//        infoPage.someoneElseButtonAndClick();
//    }
//    @Test
//    public void test14_inputSenderFirstName(){
//        infoPage.inputFirstName();
//    }
//    @Test
//    public void test15_selectEvent(){
//        infoPage.selectEvent();
//    }
//    @Test
//    public void test16_inputBlessing(){
//        infoPage.inputBlessing();
//    }
//    @Test
//    public void test17_uploadFile(){
//        infoPage.uploadFile();
//    }
//    @Test
//    public void test18_submitButtonAndClick(){
//        infoPage.submitButtonAndClick();
//    }
//    @Test
//    public void test19_checkSendByEmail(){
//        infoPage.checkSendByEmail();
//    }
//    @Test
//    public void test20_enterReceiverMail(){
//        infoPage.enterReceiverMail();
//    }
//
//    @Test
//    public void test21_enterSenderName(){
//        infoPage.enterSenderName();
//    }
//
//    @Test
//    public void test22_paymentButtonAndClickl(){
//        infoPage.paymentButtonAndClick();
//    }
//
//



    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(20000);
        driver.quit();
    }
}
