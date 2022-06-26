package com.cydeoLibrary.pages;

import com.cydeoLibrary.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailAddress;


    @FindBy(id = "inputPassword")
    public WebElement password;

    public void login(String email, String pass){
        emailAddress.sendKeys(email);
        password.sendKeys(pass , Keys.ENTER);
    }
}
