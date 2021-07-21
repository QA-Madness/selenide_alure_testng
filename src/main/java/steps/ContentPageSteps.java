package steps;

import io.qameta.allure.Step;
import methods.ContentPageMethods;
import utils.BaseSteps;

public class ContentPageSteps extends BaseSteps {

    private final ContentPageMethods contentPage = new ContentPageMethods();

    @Step("Check page title have text")
    public void checkPageTitleText(String pageTitle) {
        contentPage.checkPageHeaderHasText(pageTitle);
    }

    @Step("Check no results error visible")
    public void checkNoResultsErrorVisible() {
        contentPage.checkNoResultsErrorVisible();
    }
}
