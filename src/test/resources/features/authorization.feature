Feature: Авторизация на сайте

  Scenario: Авторизация пользователя в Jira
    Given Пользователь перешел по ссылке "https://edujira.ifellow.ru/"
    Then  Авторизоваться с логином "kukhar" и паролем "Qwerty123"

