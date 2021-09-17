import helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabsNewDemo {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        String Username = "skmeerim1999@gmail.com";
        String AccessKey = "01544080-68ff-438a-94f8-678fa65cd438";


        String url = "https://oauth-skmeerim1999-362cd:01544080-68ff-438a-94f8-678fa65cd438@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.WIN10);
        capabilities.setCapability("browserName", BrowserType.CHROME);
        capabilities.setCapability("browserVersion","latest");

        WebDriver driver = new RemoteWebDriver(new URL(url),capabilities);
        driver.get( "https://nambafood.kg/");
        Helper.scrollDownThePage();
        Thread.sleep(3000);
        String element = driver.findElement(By.xpath("//div[2]//p[2]")).getText();
        System.out.println(element);
    }
}
