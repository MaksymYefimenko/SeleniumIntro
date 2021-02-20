package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class BingResultPage {
    private ElementsCollection results = $$("li.b_algo");

    public void ClickResultByText(String TextToSerch) {
        results.shouldHave(sizeGreaterThan(0));
        results.find(text(TextToSerch)).click();
    }
}
