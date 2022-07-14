package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage {
    private WebDriver driver;
    private By cookieYes = By.id("rcc-confirm-button");
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    public static final By FIRST_QUESTION = By.id("accordion__heading-0");
    public static final By SECOND_QUESTION = By.id("accordion__heading-1");
    public static final By THIRD_QUESTION = By.id("accordion__heading-2");
    public static final By FOURTH_QUESTION = By.id("accordion__heading-3");
    public static final By FIFTH_QUESTION = By.id("accordion__heading-4");
    public static final By SIXTH_QUESTION = By.id("accordion__heading-5");
    public static final By SEVENTH_QUESTION = By.id("accordion__heading-6");
    public static final By EIGHTH_QUESTION = By.id("accordion__heading-7");
    public static final By FIRST_ANSWER = By.xpath(".//div[@id = 'accordion__panel-0']/p");
    public static final By SECOND_ANSWER = By.xpath(".//div[@id = 'accordion__panel-1']/p");
    public static final By THIRD_ANSWER = By.xpath(".//div[@id = 'accordion__panel-2']/p");
    public static final By FOURTH_ANSWER = By.xpath(".//div[@id = 'accordion__panel-3']/p");
    public static final By FIFTH_ANSWER = By.xpath(".//div[@id = 'accordion__panel-4']/p");
    public static final By SIXTH_ANSWER = By.xpath(".//div[@id = 'accordion__panel-5']/p");
    public static final By SEVENTH_ANSWER = By.xpath(".//div[@id = 'accordion__panel-6']/p");
    public static final By EIGHTH_ANSWER = By.xpath(".//div[@id = 'accordion__panel-7']/p");

    private By orderInTheTopButton = By.xpath(".//button[@class = 'Button_Button__ra12g']");
    private By orderInTheMiddleButton = By.xpath(".//div[@class = 'Home_FinishButton__1_cWm']/button");

    public static final String EXPECTED_TEXT_OF_FIRST_ANSWER = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String EXPECTED_TEXT_OF_SECOND_ANSWER = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String EXPECTED_TEXT_OF_THIRD_ANSWER = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String EXPECTED_TEXT_OF_FOURTH_ANSWER = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String EXPECTED_TEXT_OF_FIFTH_ANSWER = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String EXPECTED_TEXT_OF_SIXTH_ANSWER = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String EXPECTED_TEXT_OF_SEVENTH_ANSWER = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String EXPECTED_TEXT_OF_EIGHTH_ANSWER = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage clickCookie() {
        driver.findElement(cookieYes).click();
        return this;
    }


    public void scrollTillElement(By question) {
        WebElement element = driver.findElement(question);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickQuestion(By question) {
        driver.findElement(question).click();
    }


    public String getTextOfAnswer(By answer) {
        return driver.findElement(answer).getText();
    }

    public OrderPage clickOnBothOrderButtons (String startingOrderButton) {
        driver.findElement(By.xpath(startingOrderButton)).click();
        return new OrderPage(driver);
    }

    public void clickOnOrderButtonInTheTop () {
        driver.findElement(orderInTheTopButton).click();

    }

    public void clickOnOrderButtonInTheMiddle () {
        driver.findElement(orderInTheMiddleButton).click();

    }


}
