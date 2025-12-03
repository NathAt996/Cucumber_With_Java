package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "feature",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class CalculatorRunner {
}