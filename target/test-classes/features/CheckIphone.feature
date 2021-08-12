@Regression
Feature: Login In

  Scenario: User should enter the system with correct information (Positive Test)
    Given Me as user should open the site Facebook.com
    And User should enter his the email address where its required
    And User should enter his password in the line Password
    When User will enter the bottom Log In
    Then User should successfully enter by the system


    Scenario: User should enter the system with incorrect information (Negative Test)
      Given Me as user should open the site Facebook.com
      And User should enter his the email address where its required
      And User should enter incorrect password in the line Password
      When User will enter the bottom Log In
      Then User will be an able to enter the system as answer from the system

      Scenario: проверка вычитания
        Given Я должен зайти на сайт svetofor kg
        And Я должен найти наушники для Iphone
        And У меня на карте 100 usd
        And Наушники стоят 30 usd
        When Я нажимаю на кнопку купить
        And Сайт должен снять со счета 30 usd
        Then У меня на карте должен остаться 70 usd


        Scenario: Receive August salary
          Given I need to receive my month salary
          And I need to check online my bank account by ibank.com
          And In my account previously i had 100usd
          When I will receive 3000usd as august salary
          Then Total in my bank account supposed to be 3100usd


