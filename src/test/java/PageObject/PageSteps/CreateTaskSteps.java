package PageObject.PageSteps;

import PageObject.PageElements.CreateTaskPage;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;

import static PageObject.PageElements.CreateTaskPage.*;

public class CreateTaskSteps {

    @When("Пользователь создал задачу типа {string} с названием {string} и описанием {string}")
    public static void createTask(String taskType, String summary, String description) {
        taskTypeSelector.click();
        typeTask.sendKeys(taskType);
        summaryField.setValue(summary);
        textButton.click();
        descriptionField.sendKeys(description);
        assignMeButton.click();
        createButton.click();
    }


}
