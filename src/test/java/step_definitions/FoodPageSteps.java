package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helper.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.FoodPage.FoodPage;
import pages.MainPage.MainPage;
import utilities.Driver;


public class FoodPageSteps {
    WebDriver driver = Driver.getDriver();
    MainPage mainPage =  new MainPage();
    Helper helper = new Helper();
    FoodPage foodPage = new FoodPage();
    @Given("^Я как пользователь должен зайти на сайт https://nambafood\\.kg/$")
    public void я_как_пользователь_должен_зайти_на_сайт_https_nambafood_kg()  {
        driver.navigate().to("https://nambafood.kg/");

    }

    @Given("^Пользователь должен нажать на  картину Еда$")
    public void пользователь_должен_нажать_на_картину_Еда() {
        Helper.mouseClick(mainPage.food);
        Helper.scrollDownThePage();
    }

    @Given("^Пользователь должен прокрутить страницу вниз$")
    public void пользователь_должен_прокрутить_страницу_вниз(){
        Helper.scrollDownThePage();
    }

    @Then("^Пользователь должен увидеть все виды кухни$")
    public void пользователь_должен_увидеть_все_виды_кухни() {
        String cafes = driver.findElement(By.xpath("/html/body/div[2]/main/section[3]/h1")).getText();
        Assert.assertTrue(cafes.contains("250 лучших заведений города "));
    }

    @Then("^Пользователь должен увидеть такие кухни как национальная кухня, у национальной кухни должен быть (\\d+) кафе$")
    public void пользователь_должен_увидеть_такие_кухни_как_национальная_кухня_у_национальной_кухни_должен_быть_кафе(String expectedAmountOfCafe)  {
     String actualAmountOfCafe = foodPage.nationalCousine.getText();
     Assert.assertEquals(expectedAmountOfCafe,actualAmountOfCafe);
    }

    @Then("^У европейской кухни должен быть (\\d+) кафе$")
    public void у_европейской_кухни_должен_быть_кафе(int arg1) {
    }

    @Then("^У кока кола комбо должно быть (\\d+) кафе$")
    public void у_кока_кола_комбо_должно_быть_кафе(int arg1) {
    }

    @Then("^У китайской кухни быть (\\d+)$")
    public void у_китайской_кухни_быть(int arg1){
    }

    @Then("^У суши должен быть (\\d+) кафе$")
    public void у_суши_должен_быть_кафе(int arg1) {
    }

}
