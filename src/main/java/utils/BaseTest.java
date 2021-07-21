package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.MainPageSteps;
import steps.NavMenuSteps;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    public NavMenuSteps navMenu = new NavMenuSteps();
    public MainPageSteps mainPage = new MainPageSteps();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));

        open("https://en.wikipedia.org/");
        mainPage.checkPageOpened();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}
