import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pageObject.MainPage;
import pageObject.OrderPage;
import pageObject.PopUpPage;

import static org.hamcrest.CoreMatchers.containsString;

@RunWith(Parameterized.class)
public class MakeOrderTest extends BaseOfTest {
    private String startingOrderButton;
    private String name;
    private String surname;
    private String address;
    private String metroStation;
    private String telephoneNumber;
    private String orderDate;
    private String rentalPeriod;
    private String scooterColour;
    private String orderComment;

    public MakeOrderTest (String startingOrderButton, String name, String surname, String address,
                     String metroStation, String telephoneNumber, String orderDate,
                     String rentalPeriod, String scooterColour, String orderComment) {
        this.startingOrderButton = startingOrderButton;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.telephoneNumber = telephoneNumber;
        this.orderDate = orderDate;
        this.rentalPeriod = rentalPeriod;
        this.scooterColour = scooterColour;
        this.orderComment = orderComment;
    }
    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {MainPage.ORDER_IN_THE_TOP_BUTTON_SELECTOR, "Варвара", "Мешанина", "Москва, улица Товарная 24",
                OrderPage.STATION_CHERKIZOVSKAYA, "88005553535", "15.07.2022",
                OrderPage.THREE_DAYS_OF_RENT, OrderPage.COLOUR_BLACK_PEARL, "Хочу красивый"},
                {MainPage.ORDER_IN_THE_MIDDLE_BUTTON_SELECTOR, "Машуня", "Калинина", "Москва, улица Беговая 118",
                        OrderPage.STATION_LUBYANKA, "89782223333", "15.06.2022", OrderPage.SEVEN_DAYS_OF_RENT,
                        OrderPage.COLOUR_GREY_HOPELESSNESS, "Могу только после шести"}
        };
    }

    @Test
    public void makeOrderTest() {

        driver.get(MainPage.URL);
        String actualTextOfPlacedOrder = new MainPage(driver)
                .clickCookie()
                .clickOnBothOrderButtons(startingOrderButton)
                .fillNameField(name)
                .fillSurnameField(surname)
                .fillAddressField(address)
                .chooseMetroStationField(metroStation)
                .fillTelephoneNumberField(telephoneNumber)
                .clickNextOrderButton()
                .fillOrderDateField(orderDate)
                .fillRentalPeriodField(rentalPeriod)
                .clickScooterColourCheckbox(scooterColour)
                .fillOrderCommentField(orderComment)
                .clickButtonFinishOrder()
                .clickOnButtonYes()
                .getTextOfPlacedOrder();
        MatcherAssert.assertThat(actualTextOfPlacedOrder, containsString(PopUpPage.EXPECTED_TEXT_OF_PLACED_ORDER));

    }
}
