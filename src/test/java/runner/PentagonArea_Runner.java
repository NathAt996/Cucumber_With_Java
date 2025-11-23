package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/Pentagon_Area.feature",
        glue = "steps",
        plugin = {"pretty"}
)
public class PentagonArea_Runner {

}