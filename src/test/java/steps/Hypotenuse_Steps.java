package steps;

import feature.Hypotenuse_Formula;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class Hypotenuse_Steps {

    private Hypotenuse_Formula formula;
    private double answer;

    @Given("a triangle with side length of 4 and another side length of 3")
    public void triangleWithSideLengthandSideLength() {
        this.formula = new Hypotenuse_Formula();
    }

    @When("I calculate {int} and {int}")
    public void i_calculate_and(int sideA, int sideB) {
        this.answer = formula.calculateHypotenuse(sideA, sideB);
    }

    @Then("the hypotenuse should be {int}")
    public void the_result_should_be(double expectedResult) {
        assertEquals(expectedResult, this.answer, 0.001);
    }
}