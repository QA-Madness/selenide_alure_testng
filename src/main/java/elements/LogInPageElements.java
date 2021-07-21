package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LogInPageElements {

    public SelenideElement usernameField = $("#wpName1");
    public SelenideElement passwordField = $("#wpPassword1");
    public SelenideElement logInButton = $("#wpLoginAttempt");

    public SelenideElement loginForm = $("#userloginForm");

    public SelenideElement errorBox = $(".errorbox");
}
