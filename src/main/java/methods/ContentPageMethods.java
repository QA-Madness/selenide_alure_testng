package methods;

import elements.ContentPageElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class ContentPageMethods {

    private final ContentPageElements contentPage = new ContentPageElements();

    public void checkPageHeaderHasText(String pageName) {
        contentPage.pageHeader.shouldHave(text(pageName));
    }

    public void checkNoResultsErrorVisible() {
        contentPage.noResultsError.shouldBe(visible);
    }
}
