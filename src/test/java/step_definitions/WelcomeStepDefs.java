package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.MainPage.MainPage;
import utilities.Driver;

public class WelcomeStepDefs {

    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage();
    Helper helper = new Helper();
    @Given("^Я как пользователь должен зайти на сайт nambafood$")
    public void я_как_пользователь_должен_зайти_на_сайт_nambafood() {
        driver.navigate().to("https://nambafood.kg/");

    }

    @Given("^Заголовок должен быть - Namba Food — круглосуточная служба доставки №(\\d+) в Бишкеке$")
    public void заголовок_должен_быть_Namba_Food_круглосуточная_служба_доставки_в_Бишкеке(String expectedPageTitle) {
     String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }

    @When("^Пользователь нажмет на картинку Еда$")
    public void пользователь_нажмет_на_картинку_Еда() {
      Helper.mouseClick(mainPage.food);
        
    }

    @Then("^Пользователь успешно должен зайти в раздел Еда$")
    public void пользователь_успешно_должен_зайти_в_раздел_Еда() {
        Helper.scrollDownThePage();
        String cafes = driver.findElement(By.xpath("/html/body/div[2]/main/section[3]/h1")).getText();
        Assert.assertTrue(cafes.contains("n"+ "\n" +
                "                250 лучших заведений города "));

    }

}
