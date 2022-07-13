import model.OrderForm;
import org.junit.Test;
import org.junit.runners.Parameterized;
import pageObject.MainPage;
import pageObject.OrderPage;


public class MakeOrderTest extends BaseOfTest {

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {new OrderForm("Варвара", "Мешанина", "Москва, улица Товарная 24",
                "Красносельская", "88005553535", "15.07.2022",
                ".//div[text() = 'трое суток']", "black", "Хочу красивый")},
                {new OrderForm("Машуня", "Калинина", "Москва, улица Беговая 118",
                        ".//input[@value = 'Сокольники']", "89782223333", "15.06.2022",
                        ".//div[text() = 'семеро суток']", "grey", "Могу только после шести")}
        };
    }

    @Test
    public void makeOrderWithTopOrderButtonTest() {
        OrderForm orderForm = new OrderForm("", "", "",
                "", "", "",
                "", "", "");
        driver.get(MainPage.URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookie();
        mainPage.clickOnOrderButtonInTheTop();
        OrderPage orderpage = new OrderPage(driver);
        orderpage.fillNameField(orderForm.getName());
        orderpage.fillSurnameField(orderForm.getSurname());
        orderpage.fillAddressField(orderForm.getAddress());
        orderpage.chooseMetroStationField(orderForm.getMetroStation());



    }
}
