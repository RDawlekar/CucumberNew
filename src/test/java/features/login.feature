
@smoke2
Feature: login
  Description: my first login
  Scenario: Login User
    Given the User is on user login page
    When the user enters the email as "kenadmas@gmail.com" and password as "ken@2123"
    Then Login is successfully

