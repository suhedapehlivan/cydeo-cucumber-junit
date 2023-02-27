package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AERegisterUserPage {

    public AERegisterUserPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Signup / Login")
    public WebElement signupLogin;

    @FindBy(tagName = "h2")
    public WebElement header;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement signupName;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupBtn;

    @FindBy(xpath = "//h2/b[text()='Enter Account Information']")
    public WebElement accountInfo;

    @FindBy(id = "id_gender1")
    public WebElement title;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "days")
    public WebElement days;

    @FindBy(id = "months")
    public WebElement months;

    @FindBy(xpath = "//select[@id='years']/option[@value='1997']")
    public WebElement years;

    @FindBy(id = "newsletter")
    public WebElement newsletter;

    @FindBy(id = "optin")
    public WebElement offers;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccount;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueBtn;

    @FindBy(xpath = "//iframe[@id='aswift_2']")
    public WebElement iframe;

    @FindBy(xpath = "//iframe[@id='ad_iframe']")
    public WebElement iframe2;

    @FindBy(xpath = "//div[@id='dismiss-button']")
    public WebElement dismissBtn;

    @FindBy(xpath = "//a[text()=' Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    public WebElement deletedAcc;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton2;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;


}