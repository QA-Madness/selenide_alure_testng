package methods;

import elements.NavMenuElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class NavMenuMethods {

    private final NavMenuElements navMenu = new NavMenuElements();

    public void clickLogInButton() {
        navMenu.logInButton.click();
    }

    public void checkLogInButtonVisible() {
        navMenu.logInButton.shouldBe(visible);
    }

    public void clickLogOutButton() {
        navMenu.logOutButton.click();
    }

    public void checkLogOutButtonVisible() {
        navMenu.logOutButton.shouldBe(visible);
    }

    public void checkLoggedInUserNameHaveText(String username) {
        navMenu.loggedInUserName.shouldHave(text(username));
    }

    public void fillSearchInput(String searchTerm) {
        navMenu.searchInput.sendKeys(searchTerm);
    }

    public void clickSearchButton() {
        navMenu.searchButton.click();
    }
}
