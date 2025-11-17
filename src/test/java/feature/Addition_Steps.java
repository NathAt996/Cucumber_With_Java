package feature;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class Addition_Steps {

        private Calculator_Addition calculator;
        private int result;

        @Given("the calculator is open")
        public void the_calculator_is_open() {
            this.calculator = new Calculator_Addition();
        }

        @When("I add {int} and {int}")
        public void i_add_and(int num1, int num2) {
            this.result = calculator.add(num1, num2);
        }

        @Then("the result should be {int}")
        public void the_result_should_be(int expectedResult) {
            assertEquals(expectedResult, this.result);
        }
    }

