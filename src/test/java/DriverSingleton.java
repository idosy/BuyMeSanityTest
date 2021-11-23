
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverSingleton{
    private static WebDriver driver;

    //create Single Driver as shown in Xml File
    public static WebDriver getDriverInstance() throws Exception {
        if(driver == null){
            String type = XmlReader.getData("browserType");
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


}
