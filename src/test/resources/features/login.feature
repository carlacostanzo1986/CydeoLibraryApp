Feature: Library app login feature

  User Story:
  As a user, I should be able to login with correct
  credentials to different accounts

  Background: Assuming user is on the login page
    Given user is on the library login page

  @student
  Scenario: Login as a student
    When user enters student username and password
   Then user should see the dashboard

  @librarian @employee
    Scenario: Login as a librarian
      When user enters Librarian username and password
      Then user should see the dashboard