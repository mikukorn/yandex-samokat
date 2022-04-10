package uitest;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import uitest.pageWidgets.MainWidget;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    private final MainWidget mainWidget = new MainWidget();

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("selenide.browser", "Chrome");
        open("https://qa-scooter.praktikum-services.ru/");
        $x("//button[@id='rcc-confirm-button']").shouldBe(visible).click();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}



