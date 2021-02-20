package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BingSerchPage {
   private  SelenideElement serchElement = $(By.name("q"));
   private  SelenideElement serchBatton = $x("//*[@id=\"sb_form\"]/label");

    public  BingSerchPage setSerchQuery(String text){
        serchElement.sendKeys(text);
        return this;
    }

    public void clickSerchBatton (){
        serchBatton.click();
    }
}
