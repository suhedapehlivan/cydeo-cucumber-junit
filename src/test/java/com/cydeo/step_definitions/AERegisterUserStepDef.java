package com.cydeo.step_definitions;

import com.cydeo.pages.AERegisterUserPage;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;

public class AERegisterUserStepDef {
    AERegisterUserPage aeRegisterUserPage = new AERegisterUserPage();

    Faker faker =new Faker();

    @Given("user is on {string}")
    public void userIsOnAutomationexerciseCom(String website) {
        Driver.getDriver().get("http://automationexercise.com");

    }

    @When("Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        aeRegisterUserPage.signupLogin.click();
    }

    @When("Enter name and email address")
    public void enter_name_and_email_address() {
        aeRegisterUserPage.signupName.sendKeys(faker.name().fullName()+Keys.TAB+faker.internet().emailAddress());
    }
    @When("Click Signup button")
    public void click_signup_button() {
        aeRegisterUserPage.signupBtn.click();
    }
    @When("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        aeRegisterUserPage.title.click();
        aeRegisterUserPage.password.sendKeys(faker.internet().password());

        Select selectDay = new Select(aeRegisterUserPage.days);
        selectDay.selectByValue("15");

        Select selectMonth = new Select( aeRegisterUserPage.months);
        selectMonth.selectByValue("4");

        aeRegisterUserPage.years.click();


    }
    @When("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        aeRegisterUserPage.newsletter.click();
    }
    @When("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        aeRegisterUserPage.offers.click();
    }
    @When("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        aeRegisterUserPage.firstName.sendKeys(faker.name().firstName()+ Keys.TAB+faker.name().lastName()+Keys.TAB
                + faker.company().name()+Keys.TAB+faker.address().streetName()+Keys.TAB+faker.address().cityName());

        Select country = new Select( aeRegisterUserPage.country);

        country.selectByValue("Canada");


        aeRegisterUserPage.state.sendKeys(faker.address().state()+Keys.TAB+faker.address().city()+Keys.TAB
                +faker.address().zipCode()+Keys.TAB+faker.numerify("###-###-##-##"));
    }

    @When("Click Create Account button")
    public void click_create_account_button() {
        aeRegisterUserPage.createAccount.click();
    }



    @When("Click Continue button")
    public void click_continue_button() throws AWTException, InterruptedException {

        aeRegisterUserPage.continueBtn.click();

        Robot rb =new Robot();
        Dimension i = Driver.getDriver().manage().window().getSize();
        System.out.println(i);
        System.out.println("Dimension x and y :"+i.getWidth()+" "+i.getHeight());
        int x = (i.getWidth()/4)+130;
        int y = (i.getHeight()/10)+200;
        System.out.println(x+":"+y);


        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        WebElement pop=Driver.getDriver().findElement(By.xpath("//*[@data-vignette-loaded='true']"));
        aeRegisterUserPage.continueBtn.click();
        if (pop.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(pop));
            rb.mouseMove(x, y);
            rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            rb.delay(1000);
            rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            rb.delay(1000);
            //pop.click();
            Thread.sleep(3000);
        }




    }
    @When("Click Delete Account button")
    public void click_delete_account_button() {
        aeRegisterUserPage.deleteAccount.click();
    }
    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        Assert.assertTrue(aeRegisterUserPage.deletedAcc.isDisplayed());
        aeRegisterUserPage.continueButton2.click();
    }



}
