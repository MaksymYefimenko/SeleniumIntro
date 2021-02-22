package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class DemoResultPage {
    private ElementsCollection results = $$(" a");

    public void ClickResultByText(String TextToSerch) {
        results.shouldHave(sizeGreaterThan(0));
        results.find(text(TextToSerch)).click();
    }
}
