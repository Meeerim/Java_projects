package utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    //Singleton pattern - Использую для того чтобы мой драйвер был единственным, чтобы другие классы не могли создать обьекты
    private Driver(){}

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "firefox":
                    driver = FirefoxWebDriver.loadFirefoxWebDriver();
                    break;

                case "safari":
                    driver = new SafariDriver();
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    driver.manage().window().maximize();
                case "sauceLabs":
                    driver = loadSauceLabs();
                    break;
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
            }
        }
        return driver;
    }
    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static WebDriver loadSauceLabs (){
        String url = "https://oauth-skmeerim1999-362cd:01544080-68ff-438a-94f8-678fa65cd438@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.HIGH_SIERRA);
        capabilities.setCapability("browserName", BrowserType.SAFARI);
        capabilities.setCapability("browserVersion","latest");

        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(url),capabilities);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        return driver;
    }
}
