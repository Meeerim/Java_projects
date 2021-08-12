@Transactions
Feature: Transfer with MBank
  Scenario: Перевод денег с аккаунта А на аккаунт Б positive
    Given У нас есть банк "Commercial Bank of Kyrgyzstan"
    And Пользователь с номером счета 12345 и с email "sanira@gmail.com" и с балансом на счету $1000 зарегистрирована на банке "Commercial Bank of Kyrgyzstan"
    And Пользователь с номером счета 111111 и с email "aidana@gmail.com" и с балансом на счету $2000 зарегистрирована на банке "Commercial Bank of Kyrgyzstan"
    When Пользователь с номером счета 12345 должен отправить $200 на email "aidana@gmail.com" в "Commercial Bank of Kyrgyzstan"
    Then У пользователя с номером счета 12345 должно остаться на балансе $800
    And У пользователя с номером счета 111111 должно остаться на балансе $2200