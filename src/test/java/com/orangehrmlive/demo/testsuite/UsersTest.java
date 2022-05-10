package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class UsersTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    ViewSystemUsersPage verSysUserPage;
    AddUserPage addUserPage;
    @BeforeMethod
    public void inIt(){

        loginPage = new LoginPage();
        homePage = new HomePage();
        verSysUserPage = new ViewSystemUsersPage();
        addUserPage = new AddUserPage();
    }


    @Test(groups={"sanity","smoke","regression"})
    public void adminShouldAddUserSuccessFully(){
        loginPage.enterUserName( "Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();
        homePage.clickOnAdmin();
        String expectedMessage="Welcome kjk";
        String actualMessage = verSysUserPage.getSystemUsersText();
        Assert.assertEquals("Error In Messages",expectedMessage,actualMessage);
        verSysUserPage.clickOnAddButton();
        String expectedMessage1= "Add User";
        String actualMessage1 = addUserPage.VerifyAddUserText();
        Assert.assertEquals("Messages no Match",expectedMessage1,actualMessage1);
        addUserPage.selectUserRole("1");
        addUserPage.enterEmployeeName("Ananya Dash");
        addUserPage.addUserName("hihello");
        addUserPage.selectStatusDisable("0");
        addUserPage.addPassword("abcd123");
        addUserPage.confirmPassword("abcd123");
        addUserPage.clickOnSave();
        String expectedMessage3="Successfully Saved";
        String actualMessage3= verSysUserPage.verifysucessfullyaddedText();
        Assert.assertEquals("Messages no match",expectedMessage3,actualMessage3);
    }
    @Test(groups={"smoke","regression"})
    public void searchTheUserCreatedAndVerifyIt(){
        loginPage.enterUserName( "Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();
        homePage.clickOnAdmin();
        String expectedMessage=">";
        String actualMessage = verSysUserPage.getSystemUsersText();
        Assert.assertEquals("Error In Messages",expectedMessage,actualMessage);
        verSysUserPage.enterSystemUsersUserName("hihello");
        verSysUserPage.selectUserRoll("1");
        verSysUserPage.selectStatus("0");
        verSysUserPage.clickOnSearch();

    }
    @Test(groups={"regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
        loginPage.enterUserName( "Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();
        homePage.clickOnAdmin();
        String expectedMessage=">";
        String actualMessage = verSysUserPage.getSystemUsersText();
        Assert.assertEquals("Error In Messages",expectedMessage,actualMessage);
        verSysUserPage.enterSystemUsersUserName("hi");
        verSysUserPage.selectUserRoll("1");
        verSysUserPage.selectStatus("0");
        verSysUserPage.clickOnSearch();

    }
    @Test(groups={"regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        loginPage.enterUserName( "Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();
        homePage.clickOnAdmin();
        String expectedMessage=">";
        String actualMessage = verSysUserPage.getSystemUsersText();
        Assert.assertEquals("Error In Messages",expectedMessage,actualMessage);
        verSysUserPage.enterSystemUsersUserName("hihello");
        verSysUserPage.selectUserRoll("1");
        verSysUserPage.selectStatus("0");
        verSysUserPage.clickOnSearch();
        String expectedMessage3 = "No Records Found";
        String actualMessage3 = verSysUserPage.verifyTextNoRecord();
        Assert.assertEquals("Error",expectedMessage3,actualMessage3);
    }

}
