package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckIphoneSteps {
    @Given("^Me as user should open the site Facebook\\.com$")
    public void me_as_user_should_open_the_site_Facebook_com() throws Throwable {
        System.out.println("I opened the site Facebook.com");
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^User should enter his the email address where its required$")
    public void user_should_enter_his_the_email_address_where_its_required() throws Throwable {
        System.out.println("I entered my email address");
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^User should enter his password in the line Password$")
    public void user_should_enter_his_password_in_the_line_Password() throws Throwable {
        System.out.println("I entered my password");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User will enter the bottom Log In$")
    public void user_will_enter_the_bottom_Log_In() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^User should successfully enter by the system$")
    public void user_should_successfully_enter_by_the_system() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I pressed the bottom Log in");
    }

    @Given("^User should enter incorrect password in the line Password$")
    public void user_should_enter_incorrect_password_in_the_line_Password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^User will be an able to enter the system as answer from the system$")
    public void user_will_be_an_able_to_enter_the_system_as_answer_from_the_system() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^Я должен зайти на сайт svetofor\\.kg$")
    public void яДолженЗайтиНаСайтSvetoforKg() {
        System.out.println();

    }

    @And("^Я должен найти наушники для Iphone$")
    public void яДолженНайтиНаушникиДляIphone() {
        System.out.println(" Я нашел AirPods");

    }

    @And("^У меня на карте (\\d+) usd$")
    public void уМеняНаКартеUsd(int budget) {
        System.out.println("У меня на балансе" + budget);

    }

    @And("^Наушники стоят (\\d+) usd$")
    public void наушникиСтоятUsd(int headPhonePrice) {
        System.out.println("Стоимость наушников" + headPhonePrice);
    }

    @When("^Я нажимаю на кнопку купить$")
    public void яНажимаюНаКнопкуКупить() {
        System.out.println("Я нажал на кнопку купить");
    }

    @And("^Сайт должен снять со счета (\\d+)usd$")
    public void сайтДолженСнятьСоСчетаUsd(int withDraw) {
        System.out.println(" Сайт снял с моей карты" + withDraw + "usd");
    }

    @Then("^У меня на карте должен остаться (\\d+) usd$")
    public void уМеняНаКартеДолженОстатьсяUsd(int remainingBalance) {
        System.out.println(" У меня осталось" + remainingBalance);
    }

    @Given("^I need to receive my month salary$")
    public void i_need_to_receive_my_month_salary() throws Throwable {
        System.out.println(" I received my salary");

    }

    @Given("^I need to check online my bank account by ibank\\.com$")
    public void i_need_to_check_online_my_bank_account_by_ibank_com() throws Throwable {
        System.out.println(" I went to online banking ");
    }

    @Given("^In my account previously i had (\\d+)usd$")
    public void in_my_account_previously_i_had_usd(int previousBalance) throws Throwable {
        System.out.println("In my account i had " + previousBalance);
    }

    @When("^I will receive (\\d+)usd as august salary$")
    public void i_will_receive_usd_as_august_salary(int augustSalary) throws Throwable {
        System.out.println("For August month i will receive" + augustSalary);
    }

    @Then("^Total in my bank account supposed to be (\\d+)usd$")
    public void total_in_my_bank_account_supposed_to_be_usd(int total) throws Throwable {
        System.out.println("Total money in my bank account will be" + total);
    }

}
