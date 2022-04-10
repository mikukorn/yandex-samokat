package uitest.pageWidgets;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class QuestionWidget {

    private final SelenideElement subHeader = $x("//div[@class='Home_FourPart__1uthg']");

    //Так как элементы отличаются только номером элемента, сделала универсальный метод, который принимает на вход id и возвращает локатор
    public SelenideElement setAccordeonItem(String id) {
        return $x("//div[@id='accordion__heading-" + id + "']");
    }

    public SelenideElement setAccordeonIPanel(String id) {
        return $x("//div[@id='accordion__panel-" + id + "']");
    }

    public void subHeaderCheckQuestion(String question, String answer, String id) {
        subHeader.scrollTo();
        setAccordeonItem(id).click();
        setAccordeonIPanel(id).parent().shouldHave(Condition.text(question));
        setAccordeonIPanel(id).shouldHave(Condition.text(answer));
    }

}