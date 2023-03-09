package com.cydeo.step_definitions;

import com.cydeo.pages.CtisPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CtisStepDef {
    CtisPage ctisPage=new CtisPage();

    @Given("user is on the ctis login page")
    public void user_is_on_the_ctis_login_page() {
        Driver.getDriver().get("https://qa.ctissolutions.com/");
    }
    @When("user types valid email")
    public void user_types_valid_email() {
ctisPage.usernameBox.sendKeys("hr5@cybertekschool.com");
    }
    @When("user types valid password")
    public void user_types_valid_password() {
ctisPage.passwordBox.sendKeys("UserUser");
    }
    @When("user click to login button")
    public void user_click_to_login_button() {
ctisPage.LoginButton.click();
    }
    @Then("user should see title is Portal")
    public void user_should_see_title_is_portal() {
        String actual=Driver.getDriver().getTitle();
        String expected="Portal";
        Assert.assertTrue(actual.contains(expected));
    }


    @When("user types username {string}")
    public void user_types_username(String username) {
        ctisPage.usernameBox.sendKeys(username);
    }
    @When("user types password {string}")
    public void user_types_password(String password) {
        ctisPage.passwordBox.sendKeys(password);
    }



    @When("user types valid email and valid password")
    public void userTypesValidEmailAndValidPassword(List<String> loginInputs) {
        ctisPage.usernameBox.sendKeys(loginInputs.get(0));
        ctisPage.passwordBox.sendKeys(loginInputs.get(1));

    }

    @When("user types username {string} as user")
    public void userTypesUsernameAsUser(String username) {
        ctisPage.usernameBox.sendKeys(username);
    }

    @And("user types password {string} as user")
    public void userTypesPasswordAsUser(String password) {
        ctisPage.passwordBox.sendKeys(password);
    }
}
