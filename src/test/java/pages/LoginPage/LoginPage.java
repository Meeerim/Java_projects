package pages.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "username")
    public WebElement username;

    @FindBy (id = "password")
    public WebElement password;
    @FindBy (id = "_submit")
    public WebElement loginButton;

    public void Login (String usernameInput, String passwordInput) {
        username.sendKeys(usernameInput);
        password.sendKeys(passwordInput);
        loginButton.click();
    }

    @FindBy (xpath = "/html/body/div[5]/div/div/span")
    public WebElement errorMessage;
}
