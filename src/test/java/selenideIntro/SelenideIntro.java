package selenideIntro;


import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BingResultPage;
import pages.BingSerchPage;
import pages.DemoResultPage;
import setUpClasses.BaseSelenideClass;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideIntro extends BaseSelenideClass {
    private Object DemoResultPage;

    @Test
    public void test1() {
        open("/");
        $(By.name("q"));
        $(By.name("q")).sendKeys("Selenide");
        $(By.name("q")).shouldHave(value("Selenide"));
        $("label.search.icon.tooltip").click();
        $$("li.b_algo").shouldHave(sizeGreaterThan(0));
        $$("li.b_algo").find(text("Selenide - Wikipedia")).click();
        $x("//*[@id=\"p-logo\"]/a").isDisplayed();


    }

    @Test
    public void test2() {
        BingSerchPage serchPage = new BingSerchPage();
        open("/");
        serchPage.setSerchQuery("Selenide").clickSerchBatton();
        BingResultPage resultPage = new BingResultPage();
        resultPage.ClickResultByText("Selenide: concise UI tests in Java");
        $x("/html/body/div[1]/div/header/a/img").isDisplayed();

    }

    @Test
    public void test3() {
        BingSerchPage serchPage = new BingSerchPage();
        open("/");
        serchPage.setSerchQuery("demo.guru99.com/test/newtours/").clickSerchBatton();
        DemoResultPage = new DemoResultPage();
        DemoResultPage resultPage = new DemoResultPage();
        resultPage.ClickResultByText("Guru99");
        $x("//*[@id=\"site-name\"]/a").isDisplayed();

    }
}
