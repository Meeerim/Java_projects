package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Helper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage.LoginPage;
import pages.MainPage.MainPage;
import pojo.LoginDataContainer;
import utilities.Driver;

import java.util.List;

public class LoginSteps {
    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Given("^Пользователь должен нажать на  кнопку ВОЙТИ$")
    public void пользовательДолженНажатьНаКнопкуВОЙТИ() {
        mainPage.signIn(mainPage.singInToSystem);
    }


    @When("^Пользователь войдет в систему с этими данными$")
    public void пользовательВойдетВСистемуСЭтимиДанными(List <LoginDataContainer>loginData) {
        loginPage.Login(loginData.get(0).getUsername(),loginData.get(0).getPassword());
    }
    @Then("^Пользователь должен успешно в войти в систему$")
    public void пользователь_должен_успешно_в_войти_в_систему()  {
        mainPage.clickProfileMenu(mainPage.profileMenu);
        String expectedResult = "Здравствуйте, Meerim";
        Assert.assertEquals(expectedResult,Helper.getTextValuev(mainPage.profileName));

    }


    @Then("^Пользователь должен увидеть ошибку \"([^\"]*)\"$")
    public void пользовательДолженУвидетьОшибку(String expectedErrorMessage)  {
        String actualResult = Helper.getTextValuev(loginPage.errorMessage);
        Assert.assertEquals(expectedErrorMessage,actualResult);

    }
}
