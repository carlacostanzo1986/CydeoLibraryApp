package com.cydeoLibrary.step_definitions;

import com.cydeoLibrary.pages.LibraryDashBoard;
import com.cydeoLibrary.pages.LoginPage;
import com.cydeoLibrary.pages.UsersManagementPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResults_stepDefinitions {
    LibraryDashBoard libraryDashBoard = new LibraryDashBoard();
    LoginPage loginPage = new LoginPage();
    UsersManagementPage page = new UsersManagementPage();

    @And("I click on Users link")
    public void iClickOnLink() {
        libraryDashBoard.usersLink.click();

    }

    @Then("table should have following column names:")
    public void tableShouldHaveFollowingColumnNames(List<String> namesOfTheColumns) {

       /* List<String> actualNamesOfTheColumn = new ArrayList<>();  // i find the columns one by one and assert them equals

        actualNamesOfTheColumn.add(page.actionsColumn.getText());
        actualNamesOfTheColumn.add(page.userIDColumn.getText());
        actualNamesOfTheColumn.add(page.fullNameColumn.getText());
        actualNamesOfTheColumn.add(page.emailColumn.getText());
        actualNamesOfTheColumn.add(page.groupColumn.getText());
        actualNamesOfTheColumn.add(page.statusColumn.getText());

         Assert.assertEquals(namesOfTheColumns, actualNamesOfTheColumn);
*/

        List<WebElement> columnNames = page.allColumns;  // webelemnts of columns found and put in List

        List<String> actualNamesOfTheColumn = new ArrayList<>();  // creat a empty arrayList to put the name of the columns

        for (WebElement each : columnNames) {
            actualNamesOfTheColumn.add(each.getText());  // all names of them are added
        }

        Assert.assertEquals(namesOfTheColumns, actualNamesOfTheColumn);   //  compared here









    }


}
