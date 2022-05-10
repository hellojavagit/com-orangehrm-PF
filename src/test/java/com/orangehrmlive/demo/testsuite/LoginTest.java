package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void inIt() {

        loginPage = new LoginPage();
        homePage = new HomePage();
    }
    @Test(groups={"sanity","smoke","regression"})
    public void verifyUserShouldLoginSuccessFully(){
        loginPage.enterUserName( "Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();

    }
}
