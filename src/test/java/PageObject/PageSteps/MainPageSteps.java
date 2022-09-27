package PageObject.PageSteps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static PageObject.PageElements.MainPageElem.*;
import static PageObject.PageElements.ProjectPageElem.projectNameValue;

public class MainPageSteps {

    @Given("Пользователь открыл проект TEST")
    public static void openTestProject(){
        projectsButton.click();
        testProjectLink.shouldBe(Condition.visible).click();
        Assertions.assertEquals("Test", projectNameValue.text());
    }
}
