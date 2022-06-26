package com.cydeoLibrary.pages;

import com.cydeoLibrary.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LibraryDashBoard {
    public LibraryDashBoard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//li//a[@id='navbarDropdown']/span")
     public WebElement userNameItem;


    @FindBy(id = "user_avatar")
    public WebElement userAvatar;


    @FindBy(linkText = "Logout")
    public WebElement logoutLink;


   // @FindBy(css="h2#user_count")

    @FindBy(xpath = "//div//h2[@id='user_count']")
    public WebElement userCount;




    @FindBy(linkText = "Users")
    public WebElement usersLink;

    @FindBy(linkText = "Books")
    public WebElement booksLink;

    @FindBy(linkText = "Dashboard")
    public WebElement Dashboard;




    public void logout() {
        usersLink.click();
        logoutLink.click();
    }





}
