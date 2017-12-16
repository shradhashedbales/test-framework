package OrangeHm;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


/**
 * Created by SHRADHA on 01/08/2017.
 */
public class BaseMain {
    public static WebDriver driver;
    Boolean runTestsONGrid = false;

    public BaseMain() {

        PageFactory.initElements(driver, this);
    }

    public void openbrowser() throws Throwable {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties");
        properties.load(fileInputStream);


        String url = properties.getProperty("url");
        String browser = properties.getProperty("browser");

        if (runTestsONGrid) {
            System.out.println("Selenium Grid running.............");
// Saucelabs selenium grid setup
//            DesiredCapabilities caps = DesiredCapabilities.safari();
//            caps.setCapability("platform", "macOS 10.12");
//            caps.setCapability("version", "10.0");

            String USERNAME = "shradhashedbale";
            String ACCESS_KEY = "1dacdc96-bebb-4b8c-90ef-61739d338fa3";
//            String gridURL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

// Local selenium grid setup
            DesiredCapabilities caps = DesiredCapabilities.chrome();
            caps.setCapability("platform", "");
            caps.setCapability("version", "");
            String gridURL = "http://localhost:4444/wd/hub";

            driver = new RemoteWebDriver(new URL(gridURL), caps);

        } else {

            FirefoxDriverManager.getInstance().setup();
            ChromeDriverManager.getInstance().setup();

            //System.setProperty("webdriver.chromedriver.driver", "cromedriver.exe");
            //System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");

           /* DesiredCapabilities capabilities = new DesiredCapabilities();
            WebDriver driver = new RemoteWebDriver(capabilities);
            Capabilities actualCapabilities = ((RemoteWebDriver) driver).getCapabilities();*/


            if ("chrome".matches(browser)) {
                driver = new ChromeDriver();
            } else if ("firefox".matches(browser)) {
                driver = new FirefoxDriver();
            }/*else if ("REMOTE" .matches(browser))
            {
                driver = new RemoteWebDriver(new URL("http://localhost:4444"),capabilities);
            }*/
        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public void closeBrowser() {
        driver.quit();
    }

}



