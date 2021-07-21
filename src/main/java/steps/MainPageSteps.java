package steps;

import io.qameta.allure.Step;
import methods.MainPageMethods;
import utils.BaseSteps;

public class MainPageSteps extends BaseSteps {

    private final MainPageMethods mainPage = new MainPageMethods();

    @Step("Check Main page is opened")
    public void checkPageOpened() {
        mainPage.checkWelcomeTextIsVisible();
    }

}
