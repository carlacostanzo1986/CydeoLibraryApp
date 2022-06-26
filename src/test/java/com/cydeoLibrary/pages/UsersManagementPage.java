package com.cydeoLibrary.pages;

import com.cydeoLibrary.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class UsersManagementPage {
    public UsersManagementPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//thead//th")
    public List<WebElement> allColumns;

    @FindBy(xpath= "//th[@data-name='actions']")
    public WebElement actionsColumn;
    @FindBy(xpath = "//th[@data-name='id']")
    public WebElement userIDColumn;
    @FindBy(xpath = "//th[@data-name='full_name']")
    public WebElement fullNameColumn;
    @FindBy(xpath = "//th[@data-name='email']")
    public WebElement emailColumn;
    @FindBy(xpath = "//th[@data-name='group_name']")
    public WebElement groupColumn;
    @FindBy(xpath = "//th[@data-name='status']")
    public WebElement statusColumn;


    @FindBy(xpath = "//a[@href='tpl/add-user.html']")
    public WebElement adduserLink;




}
