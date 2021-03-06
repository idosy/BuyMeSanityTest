
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class
mainTests extends DriverSingleton {
    private static WebDriver driver;
    private static SignOnAndRegistrationPage loginPage;
    private static HomePage homePage;
    private static BusinessPage businessPage;
    private static SenderAndReceiverInfoPage infoPage;
    private static Extras extras;

    // create the report object, path and name
    private static ExtentReports extent= new ExtentReports();
    private static ExtentTest test = extent.createTest("BuyMeSanityTests", "Description");


    @BeforeClass
    public static void runOnceBeforeClass() throws Exception {


        driver = DriverSingleton.getDriverInstance();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get(XmlReader.getData("Url"));

        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(XmlReader.getData("reportPath"));
        extent.attachReporter(htmlReporter);
        test.log(Status.INFO, "before test method");


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


//Home Screen tests
  @Test
  public void test06_pickPrice() throws Exception {
      homePage = new HomePage(driver);
      //this method is for existing user
      driver.get(XmlReader.getData("Url"));
      homePage.doLogin();
      homePage.selectPrice();
}
    @Test
    public void test07_pickRegion() throws Exception {homePage.selectRegion();}

    @Test
    public void test08_pickCategory() throws Exception {homePage.selectCategory();}

    @Test
    public void test09_pressFindMy() throws Exception{homePage.pressFindMy();}

//Pick business Screen tests
    @Test
    public void test10_assertUrlBusinessScreen() throws Exception {
        businessPage = new BusinessPage(driver);
        //this url is because previous tests failed
        driver.get(XmlReader.getData("Url",1));
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
        driver.get(XmlReader.getData("Url",2));
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
    public void test22_paymentButtonAndClick() throws Exception {
        infoPage.paymentButtonAndClick();
    }

    //Extra tests
    @Test
    public void test23_extrasAssertErrorFieldsV1()throws Exception{

        extras = new Extras(driver);
        //jump to relevant Url
        driver.get(XmlReader.getData("Url"));
        extras.doLogOut();
        extras.SignOnLoginButtonAndClick();
        extras.clickSubmitButton();
        extras.assertErrorFields();
    }

    @Test
    public void test25_getElementColor()throws Exception {
        //jump to relevant Url
       driver.get(XmlReader.getData("Url",2));
       extras.getElementColor();
    }
    @AfterClass

  public static void tearDown() throws InterruptedException {
        test.log(Status.INFO, "@AfterClass");
        extent.flush();
        driver.quit();
  }

}


