package tests.thread_1;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.LogInPageSteps;
import utils.BaseTest;
import utils.Retry;

import static utils.TestUserData.*;
import static utils.Errors.*;
import static utils.TestStepLogger.logStep;

public class LogInOutTest extends BaseTest {

    private final LogInPageSteps logInPage = new LogInPageSteps();

    @BeforeMethod(alwaysRun = true)
    public void before() {
        logInPage.proceedToLogInPage();
    }

    @Test(retryAnalyzer = Retry.class)
    @Description("Log in with correct credentials")
    public void logInWithCorrectCredentials() {
        logStep(1, "Fill login form with correct data and log in");
        logInPage.logIn(USERNAME, PASSWORD);

        logStep(2, "Check user is logged in");
        navMenu.checkUserLoggedIn(USERNAME);
    }

    @Test(retryAnalyzer = Retry.class)
    @Description("Log in with not correct credentials")
    public void logInWithNotCorrectCredentials() {
        logStep(1, "Fill login form with not correct data and log in");
        logInPage.logIn(USERNAME, INCORRECT_PASSWORD);

        logStep(2, "Check error is displayed and user not logged in");
        logInPage.checkErrorText(INCORRECT_USERNAME_OR_PASSWORD_ERROR);
    }

    @Test(retryAnalyzer = Retry.class)
    @Description("Log out")
    public void logOut() {
        logStep(1, "Fill login form with correct data and log in");
        logInPage.logIn(USERNAME, PASSWORD);

        logStep(2, "Check user is logged in");
        navMenu.checkUserLoggedIn(USERNAME);

        logStep(3, "Log out");
        navMenu.logOut();
    }

}
