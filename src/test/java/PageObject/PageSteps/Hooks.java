package PageObject.PageSteps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public static void setDriverFromProps() {
        Configuration.startMaximized = true;
    }

    @After
    public void driverClose() {
        WebDriverRunner.closeWebDriver();
    }
}
