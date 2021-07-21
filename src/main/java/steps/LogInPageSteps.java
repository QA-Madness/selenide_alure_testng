package steps;

import io.qameta.allure.Step;
import methods.LogInPageMethods;
import utils.BaseSteps;

public class LogInPageSteps extends BaseSteps {

    private final LogInPageMethods logInPage = new LogInPageMethods();

    @Step("Log in")
    public void logIn(String username, String password) {
        logInPage.fillUserNameField(username);
        logInPage.fillPasswordField(password);
        logInPage.clickLogInButton();
    }

    @Step("Proceed to Log In page")
    public void proceedToLogInPage() {
        navMenu.clickLogInButton();
        logInPage.checkLoginFormVisible();
    }

    @Step("Check error text")
    public void checkErrorText( String text) {
        logInPage.checkErrorText(text);
    }
}
