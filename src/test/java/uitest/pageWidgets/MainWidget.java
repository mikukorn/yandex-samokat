package uitest.pageWidgets;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;

import static java.lang.String.format;

public class MainWidget {

    //локатор кнопки «Заказать» вверху страницы
    private final SelenideElement signInTopButton = $x(".//div[starts-with(@class, 'Header_Nav')]/button[text()='Заказать']");
    //локатор кнопки «сообщения о куках»
    private final SelenideElement appCookieButton = $(byId("rcc-confirm-button"));
    //локатор пункта выпадающего списока «Вопросы о важном»
    private final SelenideElement importantQuestionsItem =  $(byClassName("accordion__item"));
    //локатор кнопки «Заказать» внизу страницы
    private final SelenideElement signInBottomButton = $x(".//div[starts-with(@class, 'Home_FinishButton')]/button[text()='Заказать']") ;
    //локатор «Вопросы о важном»
    private final SelenideElement importantQuestions =  $x(".//div[text()='Вопросы о важном']");
    //локатор логотип «Самоката»
    private final SelenideElement logoScooter = $x(".//img[@alt='Scooter']");
    //локатор логотип «Яндекса»
    private final SelenideElement logoYandex = $x(".//img[@alt='Yandex']");
    //локатор кнопки Статус заказа
    private final SelenideElement orderStatusButton = $x(".//button[text()='Статус заказа']");
    //локатор поля ввода "Введите номер заказа"
    private final SelenideElement orderNumberField = $x(".//input[@placeholder='Введите номер заказа']");
    //локатор кнопки "Go!"
    private final SelenideElement goButton = $x(".//button[text()='Go!']");

    // логотип Самоката в шапке страницы
    private final SelenideElement scooterLogo =  $(byClassName("Header_LogoScooter__3lsAR"));
    // дисклеймер "учебный тренажер" в шапке страницы
    private final SelenideElement headerDisclaimer =  $(byClassName("Header_Disclaimer__3VEni"));
    // кнопка "Статус заказа" в шапке страницы
    private final SelenideElement orderStatusButtonHeader = $x("//div[@class='Header_Nav__AGCXC']/button[text()='Статус заказа']");
    // гланый title страницы, 1 строка
    private final SelenideElement titleFirstLine = $x("//div[@class='Home_Header__iJKdX']/text()[1]");
    // главный title страницы, 2 строка
    private final SelenideElement titleSecondLine =  $x("//div[@class='Home_Header__iJKdX']/text()[2]");
    // картинка, схематическое изображение самоката
    private final SelenideElement scooterBlueprintImage = $x("//div[@class='Home_BluePrint__TGX2n']/img[@alt='Scooter blueprint']");
    // картинка, фотография самоката
    private final SelenideElement scooterPhotoImage = $x("//div[@class='Home_Scooter__3YdJy']/img[@alt='Scooter blueprint']");
    // subheader 3, "Как это работает"
    private final SelenideElement subheaderHowItWorks = $x("//div[@class='Home_ThirdPart__LSTEE']/div[@class='Home_SubHeader__zwi_E']/text()");
    // "Как это работает", шаг 1, номер шага
    private final SelenideElement numberOfFirstStep = $x("//div[@class='Home_RoadMap__2tal_']/div[1]/div[@class='Home_StatusCircle__3_aTp']");


    //метод клика по пункту выпадающего списока и проверки что в нем есть текст
    public SelenideElement getImportantQuestionsItem(String questionText) {
        return $(By.xpath(format(".//div[text()='%s']", questionText)));
    }

    //метод клика по кнопке «Заказать» сверху страницы
    public void clickSignInTopButton() {
        signInTopButton.click();
    }

    //метод по закрытию сообщения о куках.
    public void clickAppCookieButton() {
        appCookieButton.click();
    }

    //метод клика по кнопке «Заказать» внизу страницы
    public void clickSignInButtonBottom() {
        signInBottomButton.click();
    }

    //метод клика по логотип «Самоката»
    public void clickLogoScooter() {
        logoScooter.click();
    }

    //метод клика по логотип «Yandex»
    public void clickLogoYandex() {
        logoYandex.click();
    }

    //метод клика по кнопки Статус заказа
    public void clickButtonOrderStatus() {
        orderStatusButton.click();
    }

    //метод заполнения поля ввода "Введите номер заказа"
    public void setOrderNumber(String orderNumber) {
        orderNumberField.setValue(orderNumber);
    }

    //метод клика по кнопки "Go!"
    public void clickButtonGo() {
        goButton.click();
    }
}
