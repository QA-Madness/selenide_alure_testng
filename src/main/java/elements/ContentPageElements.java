package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ContentPageElements {

    public SelenideElement pageHeader = $("#firstHeading");
    public SelenideElement noResultsError = $(".mw-search-nonefound");
}
