package StepDefinationFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefination {
    int var1, var2, Currentsum, sum;

    @Given("the numbers {int} and {int}")
    public void theNumbersAnd(int arg0, int arg1) {
        System.out.println(arg0);
        System.out.println(arg1);
        var1 = arg0;
        var2 = arg1;
    }

    @When("I add the two numbers")
    public void iAddTheTwoNumbers() {
        Currentsum = var1 + var2;

    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int arg0) {
        sum = arg0;
        if (sum == Currentsum) {
            System.out.println("sum is " + Currentsum);
        }

    }
}