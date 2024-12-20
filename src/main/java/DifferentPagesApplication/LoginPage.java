package DifferentPagesApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LoginPage {
    WebDriver driver;

    // Locators for login page elements
     By username = By.id("user-name");
    By password= By.id("password");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // creating the method to enter the username, password and login
    public void user1(String usrname){
        driver.findElement(username).sendKeys(usrname);
     }
     public void password(String pswrd){
        driver.findElement(password).sendKeys(pswrd);
     }

     public void clicklogin(){
        driver.findElement(loginButton).click();
     }

     //Creating the method to provide the login credentials
    public void logincredentials(String username, String password){
        user1(username);
        password(password);
        clicklogin();
    }
}



