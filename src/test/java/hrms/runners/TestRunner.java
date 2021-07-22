package hrms.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "hrms/stepdefinitions",
        dryRun = false,
        tags = {"@addEmployee's_Contact_Details"},
        strict = true,
        plugin = {"pretty",
                "html:target/cucumber-default-reports",
                "rerun:target/FailedTests.txt",
                "json:target/cucumber.json"})
public class TestRunner {
}
