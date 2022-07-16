package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
private WebDriver driver;

//Поле Имя
private By nameField = By.xpath(".//input[@placeholder='* Имя']");

//Поле Фамилия
private By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");

//Поле Адрес
private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

//Поле "Станция метро"
private By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");

//Станция метро "Черкизовская"
public static final String STATION_CHERKIZOVSKAYA = ".//ul/li[@data-value = '2']";

//Станция метро "Лубянка"
public static final String STATION_LUBYANKA = ".//ul/li[@data-value = '9']";

//Поле Телефон
private By telephoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

//Кнопка Далее
private By nextOrderButton = By.xpath(".//button[@class ='Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Далее']");

//Поле "Когда привезти самокат"
private By orderDateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

//Поле Срок аренды
private By rentalPeriodField = By.xpath(".//span[@class='Dropdown-arrow']");

//Срок трое суток
public static final String THREE_DAYS_OF_RENT = ".//div[text() = 'трое суток']";

//Срок семеро суток
public static final String SEVEN_DAYS_OF_RENT = ".//div[text() = 'семеро суток']";

//Цвет: Чекбокс "Черный жемчуг"
public static final String COLOUR_BLACK_PEARL = "black";

//Цвет: Чекбокс "Серая безысходность"
public static final String COLOUR_GREY_HOPELESSNESS = "grey";

//Поле "Комментарий"
private By orderCommentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");

//Кнопка Заказать
private By buttonFinishOrder = By.xpath(".//button[@class ='Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
public OrderPage fillNameField(String name) {
    driver.findElement(nameField).sendKeys(name);
    return this;
}

public OrderPage fillSurnameField(String surname) {
    driver.findElement(surnameField).sendKeys(surname);
    return this;
}

public OrderPage fillAddressField(String address) {
    driver.findElement(addressField).sendKeys(address);
    return this;
}

    public OrderPage chooseMetroStationField(String metroStation) {
        driver.findElement(metroStationField).click();
        driver.findElement(By.xpath(metroStation)).click();
        return this;
    }
    public OrderPage fillTelephoneNumberField(String telephoneNumber) {
        driver.findElement(telephoneNumberField).sendKeys(telephoneNumber);
        return this;
    }

    public OrderPage clickNextOrderButton() {
    driver.findElement(nextOrderButton).click();
    return this;
    }

    public OrderPage fillOrderDateField(String orderDate) {
    driver.findElement(orderDateField).sendKeys(orderDate);
    return this;
    }
    public OrderPage fillRentalPeriodField(String rentalPeriod) {
    driver.findElement(rentalPeriodField).click();
        driver.findElement(By.xpath(rentalPeriod)).click();
        return this;
    }

    public OrderPage clickScooterColourCheckbox(String scooterColour) {
    driver.findElement(By.id(scooterColour)).click();
    return this;
    }

    public OrderPage fillOrderCommentField(String orderComment) {
    driver.findElement(orderCommentField).sendKeys(orderComment);
    return this;
    }
    public PopUpPage clickButtonFinishOrder() {
    driver.findElement(buttonFinishOrder).click();
    return new PopUpPage(driver);
    }

}
