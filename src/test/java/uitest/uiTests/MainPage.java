package uitest.uiTests;

import org.junit.Test;
import uitest.BaseTest;
import uitest.pageWidgets.QuestionWidget;


public class MainPage extends BaseTest {

    private final QuestionWidget questionWidget = new QuestionWidget();

    @Test
    // @DisplayName("Проверка вопроса в аккордеоне")
    public void checkQuestionsAccordeon0() {
        questionWidget.subHeaderCheckQuestion("Сколько это стоит? И как оплатить?",
                "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                "0");
    }

    @Test
    // @DisplayName("Проверка вопроса в аккордеоне")
    public void checkQuestionsAccordeon1() {
        questionWidget.subHeaderCheckQuestion("Хочу сразу несколько самокатов! Так можно?",
                "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                "1");
    }

    @Test
    //  @ParameterizedTest(name = "{question}")
    //  @DisplayName("Проверка вопроса в аккордеоне")
    public void checkQuestionsAccordeon2() {
        questionWidget.subHeaderCheckQuestion(
                "Как рассчитывается время аренды?",
                "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                "2");

    }

    @Test
    //  @ParameterizedTest(name = "{question}")
    //  @DisplayName("Проверка вопроса в аккордеоне")
    public void checkQuestionsAccordeon3() {
        questionWidget.subHeaderCheckQuestion("Можно ли заказать самокат прямо на сегодня?",
                "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                "3");
    }

    @Test
    //  @ParameterizedTest(name = "{question}")
    // @DisplayName("Проверка вопроса в аккордеоне")
    public void checkQuestionsAccordeon4() {
        questionWidget.subHeaderCheckQuestion("Можно ли продлить заказ или вернуть самокат раньше?",
                "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                "4");
    }
    @Test
    //  @ParameterizedTest(name = "{question}")
    //  @DisplayName("Проверка вопроса в аккордеоне")
    public void checkQuestionsAccordeon5() {
        questionWidget.subHeaderCheckQuestion("Вы привозите зарядку вместе с самокатом?",
                "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                "5");

    }

    @Test
    // @ParameterizedTest(name = "{question}")
    // @DisplayName("Проверка вопроса в аккордеоне")
    public void checkQuestionsAccordeon6() {
        questionWidget.subHeaderCheckQuestion("Можно ли отменить заказ?",
                "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
                "6");
    }

    @Test
    // @ParameterizedTest(name = "{question}")
    // @DisplayName("Проверка вопроса в аккордеоне")
    public void checkQuestionsAccordeon7() {
        questionWidget.subHeaderCheckQuestion("Я жизу за МКАДом, привезёте?",
                "Да, обязательно. Всем самокатов! И Москве, и Московской области.",
                "7");
    }

}
