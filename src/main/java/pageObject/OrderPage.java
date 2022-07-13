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
private By rentalPeriodField = By.xpath(".//div[@class='Dropdown-placeholder' and text() = '* Срок аренды']");
private By orderCommentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
private By buttonFinishOrder = By.xpath(".//button[@class ='Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
public void fillNameField(String name) {
    driver.findElement(nameField).sendKeys(name);
}

public void fillSurnameField(String surname) {
    driver.findElement(surnameField).sendKeys(surname);
}

public void fillAddressField(String address) {
    driver.findElement(addressField).sendKeys(address);
}

    public void chooseMetroStationField(String metroStation) {
        driver.findElement(metroStationField).click();
        driver.findElement(By.xpath(metroStation)).click();
    }
    public void fillTelephoneNumberField(String telephoneNumber) {
        driver.findElement(telephoneNumberField).sendKeys(telephoneNumber);
    }

    public void clickNextOrderButton() {
    driver.findElement(nextOrderButton).click();
    }

    public void fillOrderDateField(String orderDate) {
    driver.findElement(orderDateField).sendKeys(orderDate);
    }
    public void fillRentalPeriodField(String rentalPeriod) {
    driver.findElement(rentalPeriodField).click();
        driver.findElement(By.xpath(rentalPeriod)).click();
    }

    public void clickScooterColourCheckbox(String scooterColour) {
    driver.findElement(By.id(scooterColour)).click();
    }

    public void fillOrderCommentField(String orderComment) {
    driver.findElement(orderCommentField).sendKeys(orderComment);
    }
    public void clickButtonFinishOrder() {
    driver.findElement(buttonFinishOrder).click();
    }

}
