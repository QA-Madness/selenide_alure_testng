package methods;

import elements.LogInPageElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class LogInPageMethods {

    private final LogInPageElements logInPage = new LogInPageElements();

    public void fillUserNameField(String username) {
        logInPage.usernameField.sendKeys(username);
    }

    public void fillPasswordField(String password) {
        logInPage.passwordField.sendKeys(password);
    }

    public void clickLogInButton() {
        logInPage.logInButton.click();
    }

    public void checkLoginFormVisible() {
        logInPage.loginForm.shouldBe(visible);
    }

    public void checkErrorText(String text) {
        logInPage.errorBox.shouldHave(text(text));
    }
}
