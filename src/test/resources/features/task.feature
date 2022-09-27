Feature: Работа с задачей
  Background:
    Given Пользователь перешел по ссылке "https://edujira.ifellow.ru/"
    And Авторизоваться с логином "kukhar" и паролем "Qwerty123"

  Scenario: Создать задачу и провести ее по статусам до закрытого
    Given Пользователь открыл окно создания задачи
    When Пользователь создал задачу типа "Ошибка" с названием "Test bug" и описанием "Test bug description"
    Then Открыть созданную задачу
    Then Перевести задачу в статус В РАБОТЕ
    Then Перевести задачу в статус ВЫПОЛНЕНО