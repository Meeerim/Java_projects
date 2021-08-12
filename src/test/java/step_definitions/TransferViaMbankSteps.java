package step_definitions;
import bankApp.Account;
import bankApp.Bank;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class TransferViaMbankSteps {

    private Bank cbk;
    private List<Account> accountList = new ArrayList<>();

    @Given("^У нас есть банк \"([^\"]*)\"$")
    public void у_нас_есть_банк(String bankName) {
        cbk = new Bank(bankName);
        System.out.println("Создаем банк " + bankName);
    }

    @Given("^Пользователь с номером счета (\\d+) и с email \"([^\"]*)\" и с балансом на счету \\$(\\d+) зарегистрирована на банке \"([^\"]*)\"$")
    public void пользователь_с_номером_счета_и_с_email_и_с_балансом_на_счету_$_зарегистрирована_на_банке(int accNum, String email, int balance, String bankName) {

        System.out.println("Регистрируем " + accNum + " email " + email + " to " + bankName);
        Account sanirasAccount = new Account(accNum, email, balance);
        cbk.registerAccount(sanirasAccount);
        accountList.add(sanirasAccount);
    }

    @When("^Пользователь с номером счета (\\d+) должен отправить \\$(\\d+) на email \"([^\"]*)\" в \"([^\"]*)\"$")
    public void пользователь_с_номером_счета_должен_отправить_$_на_счет_на_email_в(int accNum, int transAmount, String email, String bankName) {

        System.out.println(" Перевод на счет " + accNum + " на email " + email + " сумма перевода " + transAmount + "$");

        for (Account account : accountList) {
            if (accNum == account.getAccountNum()) {
                account.transferViaMbank(email, transAmount, cbk);
            }
        }
    }

    @Then("^У пользователя с номером счета (\\d+) должно остаться на балансе \\$(\\d+)$")
    public void у_пользователя_с_номером_счета_должно_остаться_на_балансе_$(int accNum, int expectedBalance) {

        System.out.println(accNum + " остаток на счете: $" + expectedBalance);

        for (Account account : accountList) {
            if (account.getAccountNum() == accNum) {
                Assert.assertEquals(expectedBalance, account.getBalance(), 0);
            }
        }
    }
}


