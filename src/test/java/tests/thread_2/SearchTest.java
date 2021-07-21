package tests.thread_2;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import steps.ContentPageSteps;
import utils.BaseTest;
import utils.Retry;

import static utils.SearchTerms.*;
import static utils.TestStepLogger.logStep;

public class SearchTest extends BaseTest {

    private final ContentPageSteps contentPage = new ContentPageSteps();

    @Test(retryAnalyzer = Retry.class)
    @Description("Search for term with results")
    public void searchForTermWithResults() {
        logStep(1, "Search for term");
        navMenu.searchForTerm(KEANU_REEVES_SEARCH_TERM);

        logStep(2, "Check correct page is opened");
        contentPage.checkPageTitleText(KEANU_REEVES_SEARCH_TERM);
    }

    @Test(retryAnalyzer = Retry.class)
    @Description("Search for term without results")
    public void searchForTermWithoutResults() {
        logStep(1, "Search for term");
        navMenu.searchForTerm(NO_RESULTS_SEARCH_TERM);

        logStep(2, "Check correct page is opened");
        contentPage.checkNoResultsErrorVisible();
    }
}
