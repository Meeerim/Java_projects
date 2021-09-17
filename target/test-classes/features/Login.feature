@Smoke
Feature: Namba Food Login

  Background:
    Given Я как пользователь должен зайти на сайт https://nambafood.kg/

    Scenario: Я как пользователь успешно войти в систему c валидными данными
    Given Пользователь должен нажать на  кнопку ВОЙТИ
      When Пользователь войдет в систему с этими данными
      |username | password|
      |skmeerim1999@gmail.com |Password1|
      Then Пользователь должен успешно в войти в систему

    Scenario: Пользователь должен вести неправильные данные и должен увидеть ошибку
      Given Пользователь должен нажать на  кнопку ВОЙТИ
      When Пользователь войдет в систему с этими данными
      |username|password|
      |elonMusk@gmail.com|12345|
      Then Пользователь должен увидеть ошибку "Неправильные email и/или пароль"

