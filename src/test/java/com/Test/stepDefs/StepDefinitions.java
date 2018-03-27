package com.Test.stepDefs;

import com.Test.driverHelpers.BasePage;
import com.Test.pageObjects.RegistrationPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;

public class StepDefinitions {
    RegistrationPage registrationPage = new RegistrationPage();

    @Before
    public void OpenUrl(){
        BasePage.driver.get("http://newtours.demoaut.com/");
    }
    @After
    public void quitBrowser(){
        BasePage.driver.quit();
    }


    @Given("^user is on homepage$")
    public void user_is_on_homepage(){

        String actual = registrationPage.isOnHomePage();
        assertThat(actual, endsWith(".com/"));
    }

    @When("^selects Register$")
    public void selects_Register() {
        registrationPage.register();
    }

    @When("^enters all the required registration information$")
    public void enters_all_the_required_registration_information(){
        registrationPage.fillForm();
    }

    @When("^selects submit$")
    public void selects_submit() {
        registrationPage.submitBtn();
    }

    @Then("^user should successfully register$")
    public void user_should_successfully_register() {
        String actual = registrationPage.userSuccessfullyRegister();
        assertThat(actual, endsWith("success.php"));
    }


}
