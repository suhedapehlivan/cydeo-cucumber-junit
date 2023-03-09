package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CtissolutionsPortalPage {

    public CtissolutionsPortalPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[5]")
    public WebElement logoutButton;

    @FindBy(id = "user-block")
    public WebElement firstButton;

    public void logOut() {
        //  Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        firstButton.click();
        logoutButton.click();
    }
}