package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
private WebDriver driver;

private By nameField = By.xpath(".//input[@placeholder='* Имя']");
private By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
private By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");
private By telephoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
private By nextOrderButton = By.xpath(".//button[@class ='Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Далее']");
private By orderDateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
private By rentalPeriodField = By.xpath(".//span[@class='Dropdown-arrow']");
private By orderCommentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
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
