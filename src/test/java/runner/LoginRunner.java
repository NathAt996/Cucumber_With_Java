package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// Move the annotations to the top-level public class
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"}, // This correctly points to your steps package
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class LoginRunner {
    // This class should be empty. JUnit uses the annotations to run the tests.
}