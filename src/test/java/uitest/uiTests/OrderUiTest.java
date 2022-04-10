package uitest.uiTests;
import org.junit.Before;
import org.junit.Test;
import uitest.BaseTest;
import uitest.pageWidgets.MainWidget;
import uitest.pageWidgets.OrderWidget;

public class OrderUiTest  extends BaseTest {

    private final OrderWidget orderWidget = new OrderWidget();
    private final MainWidget mainWidget = new MainWidget();

    @Test
    // @DisplayName("Успешное оформление заказа с хедер кнопки")
    public void setOrderHeaderButtonSuccess(){
        mainWidget.clickSignInTopButton();
        orderWidget.fillDeliveryFormContact();
        orderWidget.fillDeliveryFormAddress();
        orderWidget.checkOrderModulePopup();
        orderWidget.orderSucces();
    }

    @Test
    // @DisplayName("Успешное оформление заказа с миддл кнопки")
    public void setOrderMiddleButtonSuccess(){
        mainWidget.clickSignInButtonBottom();
        orderWidget.fillDeliveryFormContact();
        orderWidget.fillDeliveryFormAddress();
        orderWidget.checkOrderModulePopup();
        orderWidget.orderSucces();
    }

}
