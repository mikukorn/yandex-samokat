package uitest.pageWidgets;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.ownText;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;
import static uitest.data.Constants.*;


public class OrderWidget {

    public final String orderModuleText = "Хотите оформить заказ?";
    public final String orderSuccesText = "Заказ оформлен";
    public final String orderNumberText = "Номер заказа: ";


    private final SelenideElement buttonOrderDeliveryText = $x(".//button[contains(text(),'Далее')]");

    private final SelenideElement firstname = $x("//input[@placeholder = '* Имя']");
    private final SelenideElement lastname = $x("//input[@placeholder = '* Фамилия']");
    private final SelenideElement address = $x(".//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    private final SelenideElement metroStation = $x("//input[@placeholder = '* Станция метро']");
    private final SelenideElement metroStationInput = $x(".//div[contains(text(),'Сокольники')]");
    private final SelenideElement telephone = $x(".//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");

    private final SelenideElement dateDelivery = $x("//input[@placeholder = '* Когда привезти самокат']");
    private final SelenideElement chooseDateDelivery = $x(".//div[@class='react-datepicker__week']/div[text()='1']");
    private final SelenideElement periodLease = $(byClassName("Dropdown-placeholder"));
    private final SelenideElement periodLeaseDropDown = $x(".//div[@class='Dropdown-menu']/div[text()='двое суток']");
    private final SelenideElement cooseColor = $(byId("black"));
    private final SelenideElement buttonOrderEnd = $x(".//button[contains(text(),'Заказать')]");

    private final SelenideElement orderModulePopup = $(byClassName("Order_ModalHeader__3FDaJ"));
    private final SelenideElement buttonYes = $x(".//button[contains(text(),'Да')]");

    private final SelenideElement checkOrderNumber = $(byClassName("Order_Text__2broi"));
    private final SelenideElement getStatusOrder = $x(".//button[contains(text(),'Посмотреть статус')]");


    //Форма заполнения контакнтых данных и адреса
    public void fillDeliveryFormContact() {
        firstname.setValue(GOODNAME);
        lastname.setValue(GOODLNAME);
        address.setValue(ADDRESS);
        metroStation.click();
        metroStationInput.click();
        telephone.setValue(TELEPHONE);
        buttonOrderDeliveryText.click();
    }

    //Форма заполнения деталей заказа
    public void fillDeliveryFormAddress() {
        dateDelivery.click();
        chooseDateDelivery.click();
        periodLease.click();
        periodLeaseDropDown.click();
        cooseColor.click();
        buttonOrderEnd.click();
    }

    public void checkOrderModulePopup() {
        orderModulePopup.find(String.valueOf(ownText(orderModuleText)));
        buttonYes.click();
    }

    public void orderSucces() {
        orderModulePopup.find(String.valueOf(ownText(orderSuccesText)));
       String orderNumber = checkOrderNumber.find(String.valueOf(ownText(orderNumberText)))
                .getText();
        getStatusOrder.exists();
    }

}
