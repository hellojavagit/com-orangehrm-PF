package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="txtUsername")
    WebElement userName;
    @FindBy(id="txtPassword")
    WebElement password;
    @FindBy(id="btnLogin")
    WebElement loginButton;
    @FindBy(xpath = "//div[normalize-space()='LOGIN Panel']")
    WebElement loginPanel;

    public void enterUserName(String key){
        sendTextToElement(userName,key);
    }
    public void enterPassword(String key){
        sendTextToElement(password,key);
    }
    public void clickLoginButton(){
        clickOnElement(loginButton);
    }

}
