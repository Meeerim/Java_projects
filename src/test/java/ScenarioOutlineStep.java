import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineStep {
    @Given("^Me as user should open the site Facebook\\\\.com$")
    public void meAsUserShouldOpenTheSiteFacebookCom() {
        System.out.println("I entered the site facebook");
    }


    @And("^in the email field, enter the \"([^\"]*)\"$")
    public void inTheEmailFieldEnterTheEmail(String email) {
        System.out.println(" In the field email i entered" + email);
    }

    @When("^in the password field, enter \"([^\"]*)\"$")
    public void inThePasswordFieldEnter(String password)  {
        System.out.println("In the password field i entered " + password);
    }

    @Then("^I need to press the button enter$")
    public void iNeedToPressTheButtonEnter() {
        System.out.println("I pressed the enter button");
    }

    @Then("^System have to show the answer \"([^\"]*)\"$")
    public void systemHaveToShowTheAnswer(String errorMessage) throws Throwable {
        System.out.println("You entered invalid data, please check again");
    }



}
