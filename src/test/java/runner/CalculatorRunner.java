package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// @RunWith must be on the main class
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to .feature files directory
        glue = "feature",                         // The package name
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class CalculatorRunner {

    // The class body should be empty for a standard Cucumber runner
}