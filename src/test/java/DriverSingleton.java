import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;
import com.aventstack.extentreports.Status;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class DriverSingleton {
    private static WebDriver driver;


    public static WebDriver getDriverInstance() throws Exception {
        if(driver == null){
            String type = getData("browserType");
            if(type.equals("Chrome")){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\97252\\Desktop\\USA\\QA\\auto\\chromedriver_win32\\ChromeDriver.exe");
                driver = new ChromeDriver();
            }else if(type.equals("FireFox")){
                System.setProperty("webdriver.firefox.driver", "C:\\Users\\97252\\Desktop\\USA\\QA\\auto\\geckodriver\\geckodriver.exe");
                driver = new FirefoxDriver();
            }

            }
        return driver;
    }
    public static String getData (String keyName) throws Exception{
        ClassLoader classLoader = DriverSingleton.class.getClassLoader();
        String xmlFilePath = String.valueOf(new File(classLoader.getResource("data.xml").getFile()));
        File fXmlFile = new File(xmlFilePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }

}
