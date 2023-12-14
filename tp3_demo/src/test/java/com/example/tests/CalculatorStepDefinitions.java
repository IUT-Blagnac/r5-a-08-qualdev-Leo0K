
package com.example.steps;

import com.example.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class CalculatorStepDefinitions {
    private Calculator calculator;
    private int result;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
        System.out.println("Calculator initialized");
    }

    @When("I add {int} and {int}")
    public void i_add_and(int a, int b) {
        result = calculator.add(a, b);
        System.out.println("Adding " + a + " and " + b);
    }

    @When("I subtract {int} from {int}")
    public void i_subtract_from(int a, int b) {
        result = calculator.subtract(b, a);
        System.out.println("Subtracting " + a + " from " + b);
    }

    @When("I add {int}, {int}, and {int}")
    public void i_add_multiple_numbers(int a, int b, int c) {
        result = calculator.add(a, calculator.add(b, c));
        System.out.println("Adding " + a + ", " + b + ", and " + c);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expectedResult) {
        assertEquals(expectedResult, result);
        System.out.println("Expected result: " + expectedResult);
    }

    @Then("I print the result to the terminal")
    public void i_print_the_result_to_the_terminal() {
        System.out.println("The result is: " + result);
    }
}
