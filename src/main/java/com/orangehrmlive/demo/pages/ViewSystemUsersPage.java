package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {
    public ViewSystemUsersPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText =">")
    WebElement systemUsersText;
    @FindBy(id="searchSystemUser_userName")
    WebElement userName1;
    @FindBy(id="searchSystemUser_userType")
    WebElement userRoll;
    @FindBy(name="searchSystemUser[employeeName][empName]")
    WebElement employeeName;
     @FindBy(id="searchSystemUser_status")
    WebElement statusDropDown;
    @FindBy(id="btnDelete")
    WebElement deleteButton;

    @FindBy(id="searchBtn")
    WebElement searchButton;

    @FindBy(id="resetBtn")
    WebElement resetButton;

    @FindBy(id="btnAdd")
    WebElement addButton;
    @FindBy(xpath = "//div[contains(text(),'Successfully Saved')]")
    WebElement successfullySavedText;


    @FindBy(xpath=" //td[normalize-space()='No Records Found']")
    WebElement deletedUser;
    public void clickOnAddButton(){
        clickOnElement(addButton);
    }


    public String getSystemUsersText(){
        return getTextFromElement(systemUsersText);
    }
    public void enterSystemUsersUserName(String keys){
        sendTextToElement(userName1,keys);
    }
    public void selectUserRoll(String keys){
        selectByValueFromDropDown(userRoll,keys);
    }
    public void selectStatus(String keys){
        selectByValueFromDropDown(statusDropDown,keys);
    }
    public void clickOnSearch(){
        clickOnElement(searchButton);
    }
    public String verifyTextNoRecord(){
        return getTextFromElement(deletedUser);
    }

public String verifysucessfullyaddedText(){
        return getTextFromElement(successfullySavedText);
}
}
