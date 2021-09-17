package pages.FoodPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FoodPage {
    public FoodPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[1]/div[3]")
    public WebElement nationalCousine;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[2]/div[3]")
    public WebElement europeanCousine;

    @FindBy (xpath = "/html/body/div[2]/main/section[3]/div/a[3]/div[3]")
    public WebElement cocaColaCombo;
}
