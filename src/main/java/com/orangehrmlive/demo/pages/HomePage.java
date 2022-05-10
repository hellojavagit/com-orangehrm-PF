package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//img[@alt='OrangeHRM']")
    WebElement storeLogoLocator;
    @FindBy(linkText = "Admin")
    WebElement admin;
    @FindBy(linkText = "PIM")
    WebElement PIM;
    @FindBy(linkText ="Leave")
    WebElement leave;
    @FindBy(xpath="//b[normalize-space()='Dashboard']")
    WebElement dashBoard;
    @FindBy(id="welcome")
    WebElement welcome;

    public void clickOnAdmin(){
        clickOnElement(admin);

    }
    public String welcomeText(){
        return getTextFromElement(welcome);
    }

}
