package PageObject.PageSteps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static PageObject.PageElements.ProjectPageElem.*;
import static PageObject.PageElements.TaskScreenElem.taskDescription;
import static PageObject.PageElements.TaskScreenElem.taskSummary;

public class ProjectPageSteps {
    @Then("Пользователь открыл все задачи проекта")
    public static void openAllTasks() {
        allTasksButton.click();
    }

    @When("Проверить количество задач в проекте TEST")
    public static void getTasksCount() {
        String tasksCount = tasksCountLabel.text();
        System.out.println("Количество задач в проекте: " + tasksCount.substring(tasksCount.lastIndexOf(" ")+1));
    }

    @Then("Пользователь нашел задачу с названием {string}")
    public static void searchTask(String taskSummary) {
        searchField.setValue(taskSummary);
        searchButton.click();
    }

    @Then("Проверить статус задачи")
    public static void getTaskStatus() {
        String taskStatus = statusLabel.text();
        System.out.println("Статус задачи: " + taskStatus);
        Assertions.assertEquals("В РАБОТЕ", taskStatus);
    }

    @Then("Проверить затронутую версию в задаче")
    public static void getTaskAffectedVersion() {
        String taskAffectedVersion = affectedVersionsValue.text();
        System.out.println("Затронута версия: " + taskAffectedVersion);
        Assertions.assertEquals("Version 2.0", taskAffectedVersion);
    }

    @Given("Пользователь открыл окно создания задачи")
    public static void clickCreateButton() {
        createTaskButton.shouldBe(Condition.enabled).click();
    }

    @And("Пользователь открыл созданную задачу")
    public static void goToCreatedTask() {
        taskCreationLabel.shouldBe(Condition.visible).click();
        Assertions.assertEquals("Test", projectNameValue.text());
        Assertions.assertEquals("Test bug", taskSummary.text());
        Assertions.assertEquals("Test bug description", taskDescription.text());
    }
}
