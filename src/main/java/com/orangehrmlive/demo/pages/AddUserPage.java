package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    public AddUserPage() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//h1[normalize-space()='Add User']")
    WebElement addUserText;
    @FindBy(id = "systemUser_userType")
    WebElement userRollDDAddUser;
    @FindBy(id = "systemUser_employeeName_empName")
    WebElement employeeNameAddUser;
    @FindBy(id = "systemUser_userName")
    WebElement userNameAddUser;
    @FindBy(id = "systemUser_status")
    WebElement statusDDAdduser;
    @FindBy(id = "systemUser_password")
    WebElement passwordAddUser;
    @FindBy(id = "systemUser_confirmPassword")
    WebElement confirmPasswordAddUser;
    @FindBy(id = "btnSave")
    WebElement saveButton;
    @FindBy(id = "btnCancel")
    WebElement cancelButton;

    public String VerifyAddUserText() {
        return getTextFromElement(addUserText);

    }

    public void selectUserRole(String keys) {
        selectByValueFromDropDown(userRollDDAddUser, keys);
    }

    public void enterEmployeeName(String keys) {
        sendTextToElement(userNameAddUser, keys);
    }

    public void addUserName(String keys) {
        sendTextToElement(userNameAddUser, keys);
    }

    public void selectStatusDisable(String keys) {
        selectByValueFromDropDown(statusDDAdduser, keys);
    }

    public void addPassword(String keys) {
        sendTextToElement(passwordAddUser, keys);
    }

    public void confirmPassword(String keys) {
        sendTextToElement(confirmPasswordAddUser, keys);
    }

    public void clickOnSave() {
        clickOnElement(saveButton);
    }

}

