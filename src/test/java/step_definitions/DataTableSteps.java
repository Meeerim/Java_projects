package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Ma;

import java.util.List;
import java.util.Map;

public class DataTableSteps {
    @Given("^User on the page sign in$")
    public void user_on_the_page_sign_in()  {
        System.out.println("I entered the sign in page");
    }

    @When("^User  enter his data$")
    public void user_enter_his_data(DataTable table)  {
        List<List<String>>UserList = table.asLists(String.class);
        for (List<String> e: UserList){
            System.out.println(e);
        }
        
    }

    @Then("^User should enter the button Sign In$")
    public void user_should_enter_the_button_Sign_In()  {
        System.out.println("I pressed the button Sign In");
        
        
    }

    @Then("^User should successfully sign in$")
    public void user_should_successfully_sign_in()  {
        System.out.println("I successfully signed in");
    }
    @When("^User  enter data from the table$")
    public void user_enter_data_from_the_table(DataTable table) {
        List<Map<String,String>>userList = table.asMaps(String.class,String.class);
        for (Map<String,String> e : userList){
            System.out.println(e);
        }
    }
}
