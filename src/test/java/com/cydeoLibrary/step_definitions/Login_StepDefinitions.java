package com.cydeoLibrary.step_definitions;

import com.cydeoLibrary.pages.LibraryDashBoard;
import com.cydeoLibrary.pages.LoginPage;
import com.cydeoLibrary.utilities.BrowserUtils;
import com.cydeoLibrary.utilities.ConfigurationReader;
import com.cydeoLibrary.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    LibraryDashBoard libraryDashBoard = new LibraryDashBoard();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
    }

    @When("user enters student username and password")
    public void userEntersStudentUsernameAndPassword() {
        loginPage.login("student1@library", "i2A9TgXa"
        );
    }

    @When("user enters Librarian username and password")
    public void userEntersLibrarianUsernameAndPassword() {
        loginPage.login("librarian1@library", "rs4BNN9G");
    }


    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {


        Assert.assertTrue(Driver.getDriver().getTitle().equals("Login - Library"));
        Assert.assertTrue(libraryDashBoard.userAvatar.isDisplayed());
    }


    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String username, String pass) {
        loginPage.login(username, pass);

    }

    @And("there should be  number of the users")
    public void thereShouldBeNumberOfTheUsers() {

        BrowserUtils.sleep(1);
        System.out.println("There are " + libraryDashBoard.userCount.getText() + " users ");
    }


    @And("I login as a librarian")
    public void iLoginAsALibrarian() {
        loginPage.login("librarian1@library", "rs4BNN9G");
    }


    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String name) {

        wait.until(ExpectedConditions.visibilityOf(libraryDashBoard.userNameItem));
        String actualHolderName = libraryDashBoard.userNameItem.getText();
        Assert.assertEquals(name, actualHolderName);

    }


}



