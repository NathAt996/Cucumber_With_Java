package steps;

import feature.Pentagon_Area_Formula;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class Pentagon_Area_Steps {

    private double answer;
    private double sideLength;

    @Given("a pentagon with side lengths of {double}")
    public void a_pentagon_with_side_lengths_of(Double sideLength) {
        this.sideLength = sideLength;
    }

    @When("I calculate the area")
    public void i_calculate_the_area() {
        this.answer = Pentagon_Area_Formula.areaCalc(this.sideLength);
    }

    @Then("the pentagon area should be {double}")
    public void the_pentagon_area_should_be(Double expectedResult) {
        assertEquals(expectedResult, this.answer, 0.001);
    }
}