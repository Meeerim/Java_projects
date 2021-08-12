package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"step_definitions"},
        tags = {"@Regression"},
        plugin = {"json:target/cucumber.json"},
        //json это формат,plugin- report
        format = {"pretty","html:target/reports"}
)

public class RegressionRunner {


}
