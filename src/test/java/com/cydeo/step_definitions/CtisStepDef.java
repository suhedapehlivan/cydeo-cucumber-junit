package com.cydeo.step_definitions;

import com.cydeo.pages.CtisPage;
import com.cydeo.pages.CtissolutionsPortalPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CtisStepDef {
    CtisPage ctisPage=new CtisPage();

    CtissolutionsPortalPage ctissolutionsPortalPage = new CtissolutionsPortalPage();


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
    @And("user get data from excel and verify login")
    public void userGetDataFromExcelAndVerifyLogin() throws IOException {
        String path = "CTIS.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("ctis");
        for (int i = 1; i < sheet.getLastRowNum(); i++) {
            String userName = sheet.getRow(i).getCell(0).toString();
            String userPass = sheet.getRow(i).getCell(1).toString();
            Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ctisPage.login(userName, userPass);
            ctissolutionsPortalPage.logOut();
            ctisPage.usernameBox.clear();
        }
        }

    @Then("user close the driver")
    public void userCloseTheDriver() {
        Driver.closeDriver();
    }
    }
