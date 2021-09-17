package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class Helper {
    public static void mouseClick (WebElement element){
        waitElementToBeDisplayed(element);
        waitElementToBeClickable(element);
        Actions actions = new Actions(Driver.getDriver());
        actions.click(element).perform();

    }

    public static void waitElementToBeDisplayed (WebElement element){
        new WebDriverWait(Driver.getDriver(),10)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitElementToBeClickable (WebElement element){
        new WebDriverWait(Driver.getDriver(),10)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void scrollDownThePage (){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollBy(0,250)");
    }
// for StaleElementReferenceException
    public static boolean retryingFindClick (By by) {
        boolean result = false;
        int attempts = 0;
        while (attempts < 2) {
            try {
                Driver.getDriver().findElement(by).click();
                result = true;
                break;
            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
            }
            attempts++;
        }
    return result;
    }

    public static String getTextValuev (WebElement element){
        waitElementToBeDisplayed(element);
        String text = element.getText();
        return text;
    }
}
