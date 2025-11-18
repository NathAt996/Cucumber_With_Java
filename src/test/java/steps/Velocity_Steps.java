package steps;

import feature.VelocityCalculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class Velocity_Steps {

        private VelocityCalculator calculator;
        private double initialVelocity;
        private double acceleration;
    private double finalVelocity;

    @Given("an object with an initial velocity of {double} and an acceleration of {double}")
    public void anObjectWithAnInitialVelocityOfMSAndAnAccelerationOfMS(double initialVelocity, double acceleration) {
            this.calculator = new VelocityCalculator();
            this.initialVelocity = initialVelocity;
            this.acceleration = acceleration;
        }

        @When("the time elapsed is {double} seconds")
        public void theTimeElapsedIsSeconds(double time) {
            this.finalVelocity = calculator.calculateFinalVelocity(initialVelocity, acceleration, time);
        }

        @Then("the final velocity should be {int}")
        public void theFinalVelocityShouldBeMS(Integer expectedVelocity) {
            assertEquals(expectedVelocity, finalVelocity, 0.001);
        }
    }

