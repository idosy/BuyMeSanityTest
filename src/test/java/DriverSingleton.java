import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
    private static WebDriver driver;

    public static WebDriver getChromeDriverInstance(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\97252\\Desktop\\USA\\QA\\auto\\chromedriver_win32\\ChromeDriver.exe");
            driver = new ChromeDriver();
        }

        return driver;
    }
}
