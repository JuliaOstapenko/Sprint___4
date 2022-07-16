package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpPage {
    WebDriver driver;
    public PopUpPage(WebDriver driver) {
        this.driver = driver;
    }

    //Кнопка Да
    private By buttonYes = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Да']");

    //Текст "Заказ оформлен"
    private By textOfPlacedOrder = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");

    public PopUpPage clickOnButtonYes() {
        driver.findElement(buttonYes).click();
        return this;
    }

    public String getTextOfPlacedOrder() {
        return driver.findElement(textOfPlacedOrder).getText();
    }

    public static final String EXPECTED_TEXT_OF_PLACED_ORDER = "Заказ оформлен";



}
