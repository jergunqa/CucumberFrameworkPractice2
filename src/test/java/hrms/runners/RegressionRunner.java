package hrms.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = "hrms/stepdefinitions",
        tags = "@regression",
        dryRun = true,
        plugin = {"pretty", // will print executed steps inside console
                "html:target/cucumber-default-reports", //generate default html report
                "rerun:target/FailedTests.txt"    // generates text file with failed tests only
        }
)

public class RegressionRunner {

}
