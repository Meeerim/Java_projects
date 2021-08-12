@Smoke
Feature: Scenario Outline feature

  Scenario Outline: Checking the log in function
    Given Me as user should open the site Facebook\.com
    And in the email field, enter the "<email>"
    When in the password field, enter "<password>"
    Then I need to press the button enter
    Then System have to show the answer " Invalid data"
    Examples:
      |email         |password |
      |test@test.com  |123456  |


