package com.hrms.stepDefinition;

import com.hrms.steps.LogInSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginTest {

    @Steps
    LogInSteps logInSteps;

    @Given("Go to HRMS page")
    public void goToHrmsPage() {
        logInSteps.openHrmsLogin();
    }


    @When("User enter login information")
    public void userEnterLoginInformation() {
        logInSteps.enterLoginInf();
    }

    @And(value = "^Click log in button$")
    public void clickLogInButton() throws InterruptedException {
        logInSteps.clickLogin();
    }

    @Then(value = "^They can see Timesheet page$")
    public void theyCanSeeTimesheetPage() {
        logInSteps.checkCurrentUrl();
    }
}
