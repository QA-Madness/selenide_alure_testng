package methods;

import elements.MainPageElements;

import static com.codeborne.selenide.Condition.visible;

public class MainPageMethods {

    private final MainPageElements mainPage = new MainPageElements();

    public void checkWelcomeTextIsVisible() {
        mainPage.pageTitle.shouldBe(visible);
    }
}
