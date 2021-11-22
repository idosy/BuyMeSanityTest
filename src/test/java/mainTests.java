import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class
mainTests {
    private static WebDriver driver;
    private static SignOnAndRegistrationPage loginPage;
    private static HomePage homePage;
    private static BusinessPage businessPage;
    private static SenderAndReceiverInfoPage infoPage;

    @BeforeClass
    public static void runOnceBeforeClass() throws Exception {
        driver = DriverSingleton.getDriverInstance();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://buyme.co.il");
      // driver.get("https://buyme.co.il/search?budget=1&category=337&region=13");
      //   driver.get("https://buyme.co.il/money/17573200?price=200");

    }
//SignOn And Registration Screen tests

    @Test
    public void test01_SignOnLoginButtonAndClick() throws Exception {

        loginPage = new SignOnAndRegistrationPage(driver);
        loginPage.SignOnLoginButtonAndClick();
    }

    @Test
    public void test02_RegistrationButtonAndClick() throws Exception {
        loginPage.registrationButtonAndClick();
    }

   @Test
    public void test03_FillRegistrationDetails() throws Exception {
       loginPage.inputFirstName();
       loginPage.inputEmailAddress();
       loginPage.inputPassword();
       loginPage.inputValidationPassword();
    }

    @Test
    public void test04_assertAllFields() throws Exception {loginPage.assertAllFields();}

    @Test
    public void test05_clickSubmitButton() throws Exception {
        loginPage.clickSubmitButton();
    }

//
//Home Screen tests
  @Test
  public void test06_pickPrice() throws Exception {
//
      homePage = new HomePage(driver);
      //this is for method is for existing user
      homePage.doLogin();
      homePage.selectPrice();
}
    @Test
    public void test07_pickRegion() throws Exception {
        homePage.selectRegion();
    }
    @Test
    public void test08_pickCategory() throws Exception {
        homePage.selectCategory();
        }
    @Test
    public void test09_pressFindMy() throws Exception{
        homePage.pressFindMy();
    }

//Pick business Screen tests
    @Test
    public void test10_assertUrlBusinessScreen(){
        businessPage = new BusinessPage(driver);
        businessPage.assertUrl();
    }
    @Test
    public void test11_pickBusiness() throws Exception {
        businessPage.pickBusiness();
    }
    @Test
    public void test12_enterPriceAndClick () throws Exception {
        businessPage.enterPrice();
        businessPage.clickEnterPriceButton();
    }

//Sender and Receiver Screen tests
    @Test
    public void test13_someoneElseButtonAndClick () throws Exception {
        infoPage = new SenderAndReceiverInfoPage(driver);
        infoPage.someoneElseButtonAndClick();
    }
    @Test
    public void test14_inputSenderFirstName() throws Exception {
        infoPage.inputFirstName();
    }
    @Test
    public void test15_selectEvent() throws Exception {
        infoPage.selectEvent();
    }
    @Test
    public void test16_inputBlessing() throws Exception {
        infoPage.inputBlessing();
    }
    @Test
    public void test17_uploadFile() throws Exception {
        infoPage.uploadFile();
    }
    @Test
    public void test18_submitButtonAndClick() throws Exception {
        infoPage.submitButtonAndClick();
    }
    @Test
    public void test19_checkSendByEmail() throws Exception {
        infoPage.checkSendByEmail();
    }
    @Test
    public void test20_enterReceiverMail() throws Exception {
        infoPage.enterReceiverMail();
    }

    @Test
    public void test21_enterSenderName() throws Exception {
        infoPage.enterSenderName();
    }

    @Test
    public void test22_paymentButtonAndClickl() throws Exception {
        infoPage.paymentButtonAndClick();
    }

     @AfterClass
   public static void tearDown() throws InterruptedException {

        Thread.sleep(20000);
        driver.quit();

    }
}
