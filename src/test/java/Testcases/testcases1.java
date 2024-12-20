package Testcases;

import BaseTest.Base;
import DifferentPagesApplication.HomePage;
import DifferentPagesApplication.LoginPage;
import Utils.AppConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testcases1 {
    Base base = new Base();

         WebDriver driver;
         AppConstants constants;
        LoginPage loginPage;
         HomePage homePage ;



       @BeforeMethod
        public void setup() {
           constants = new AppConstants();
            loginPage = new LoginPage(driver);
            homePage = new HomePage(driver);
        }

        @Test
        public void LoginFun() {
            WebDriver driver = base.setup();
            String actualResult = driver.findElement(By.className("login_logo")).getText();
            String expectedResult = "Swag Labs";
            Assert.assertEquals(actualResult, expectedResult);
        }

        @Test(priority = 1)
        public void ValidLogin()
        {
            loginPage.logincredentials(constants.username, constants.password);
            String actualTitle = homePage.getProductTitle();
            Assert.assertTrue(actualTitle.contains("Products"), "Valid login failed!");

        }

    }








