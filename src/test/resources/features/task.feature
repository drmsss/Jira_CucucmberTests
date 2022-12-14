Feature: Работа с задачей
  Background:
    Given Пользователь перешел по ссылке "https://edujira.ifellow.ru/"
    And Пользователь авторизовался с логином "kukhar" и паролем "Qwerty123"

  Scenario: Создать задачу и провести ее по статусам до закрытого
    Given Пользователь открыл окно создания задачи
    When Пользователь создал задачу типа "Ошибка" с названием "Test bug" и описанием "Test bug description"
    And Пользователь открыл созданную задачу
    Then Пользователь переводит задачу в статус В РАБОТЕ
    Then Пользователь переводит задачу в статус ВЫПОЛНЕНО