import model.OrderForm;
import org.junit.Test;
import org.junit.runners.Parameterized;
import pageObject.MainPage;
import pageObject.OrderPage;


public class MakeOrderTest extends BaseOfTest {
    OrderForm orderForm = new OrderForm("", "", "",
            "", "", "",
            "", "", "");
    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {new OrderForm("Варвара", "Мешанина", "Москва, улица Товарная 24",
                ".//ul/li[@data-value = '2']", "88005553535", "15.07.2022",
                ".//div[text() = 'трое суток']", "black", "Хочу красивый")},
                {new OrderForm("Машуня", "Калинина", "Москва, улица Беговая 118",
                        ".//ul/li[@data-value = '9']", "89782223333", "15.06.2022",
                        ".//div[text() = 'семеро суток']", "grey", "Могу только после шести")}
        };
    }

    @Test
    public void makeOrderWithTopOrderButtonTest() {

        driver.get(MainPage.URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookie();
        mainPage.clickOnOrderButtonInTheTop();
        OrderPage orderpage = new OrderPage(driver);
        orderpage.fillNameField(orderForm.getName());
        orderpage.fillSurnameField(orderForm.getSurname());
        orderpage.fillAddressField(orderForm.getAddress());
        orderpage.chooseMetroStationField(orderForm.getMetroStation());
        orderpage.fillTelephoneNumberField(orderForm.getTelephoneNumber());

    }
}
