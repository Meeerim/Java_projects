package pages.MainPage;

import helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage extends Helper {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //page object model - каждый элемент превращаю в джава обьект


    @FindBy(xpath = "//a[@class='home--cat-item food']")
    public WebElement food;

    @FindBy(xpath = "/html/body/main/section[3]/div[1]/a[1]")
    public WebElement pharmacy;

    @FindBy (xpath = "/html/body/main/section[3]/div[2]/a[1]")
    public WebElement stores;

    @FindBy (xpath = "/html/body/main/section[3]/div[1]/a[2]")
    public WebElement flowersGifts;

    @FindBy (id = "login--button")
    public WebElement singInToSystem;

    @FindBy (xpath = "/html/body/header/section[1]/div[4]/div[3]/a[1]")
    public WebElement userWelcome;

    @FindBy(id = "menu--profile-btn")
    public WebElement profileMenu;

    public void clickProfileMenu (WebElement element){
        waitElementToBeDisplayed(element);
        waitElementToBeClickable(element);
        profileMenu.click();
    }
    @FindBy(xpath = "/html/body/header/section[1]/div[4]/div[3]/a[1]")
    public WebElement profileName;



    public void signIn(WebElement element){
        waitElementToBeDisplayed(element);
        waitElementToBeClickable(element);
        singInToSystem.click();

    }
}
