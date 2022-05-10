package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "menu_admin_UserManagement")
    WebElement userManagement;
    @FindBy(id="menu_admin_Job")
    WebElement job;
    @FindBy(id="menu_admin_Organization")
    WebElement organization;

}
