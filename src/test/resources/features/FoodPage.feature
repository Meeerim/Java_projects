@Smoke
Feature: Test Food Page

  Scenario: Пользователь должен верифицировать все виды кухни
  Given Я как пользователь должен зайти на сайт https://nambafood.kg/
  And Пользователь должен нажать на  картину Еда
    And Пользователь должен прокрутить страницу вниз
    Then Пользователь должен увидеть все виды кухни
    And Пользователь должен увидеть такие кухни как национальная кухня, у национальной кухни должен быть 83 кафе
    And У европейской кухни должен быть 145 кафе
    And У кока кола комбо должно быть 13 кафе
    And У китайской кухни быть 34
    And У суши должен быть 41 кафе

