package steps;

import io.qameta.allure.Step;
import utils.BaseSteps;

public class NavMenuSteps extends BaseSteps {

    @Step("Check user logged in")
    public void checkUserLoggedIn(String username) {
        navMenu.checkLoggedInUserNameHaveText(username);
        navMenu.checkLogOutButtonVisible();
    }

    @Step("Log out")
    public void logOut() {
        navMenu.clickLogOutButton();
        navMenu.checkLogInButtonVisible();
    }

    @Step("Search for term")
    public void searchForTerm(String term) {
        navMenu.fillSearchInput(term);
        navMenu.clickSearchButton();
    }
}
