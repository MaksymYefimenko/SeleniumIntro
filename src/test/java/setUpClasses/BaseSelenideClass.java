package setUpClasses;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners({ScreenShooter.class})
public class BaseSelenideClass {
    @BeforeClass
    public void setUp () {
        Configuration.baseUrl = "https://www.bing.com";
        Configuration.timeout = 5000;
        Configuration.reportsFolder = "reportsSelenide";
    }
}
