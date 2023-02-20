package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodoElements {
    public TodoElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[.='JavaScript']")
    public WebElement javaScript;

    @FindBy(xpath = "//a[.='Polymer']")
    public WebElement polymer;

    @FindBy(xpath = "//input[@id='new-todo']")
    public WebElement toDoItem;

    @FindBy(xpath = "(//label[@class='style-scope td-item'])[2]")
    public WebElement SecondItem;

    @FindBy(xpath = "//input[@id='edit']")
    public WebElement inPut;

}
