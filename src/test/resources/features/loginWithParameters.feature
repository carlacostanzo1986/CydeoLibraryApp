Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts

  Background: Assuming user is on the login page
    Given user is on the library login page

  @librarian @employee
  Scenario: Login as librarian
    When user enters Librarian username and password
    Then user should see the dashboard
  @student
  Scenario: Login as student
    When user enters student username and password
    Then user should see the dashboard

    Scenario: Login as librarian in the same line

      When I login using "librarian1@library" and "rs4BNN9G"
      Then user should see the dashboard
      And there should be  number of the users


