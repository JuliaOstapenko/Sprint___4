package description.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
    private WebDriver driver;
    public static final By FIRST_QUESTION = By.id("accordion__heading-0");
    public static final By SECOND_QUESTION = By.id("accordion__heading-1");
    public static final By THIRD_QUESTION = By.id("accordion__heading-2");
    public static final By FOURTH_QUESTION = By.id("accordion__heading-3");
    public static final By FIFTH_QUESTION = By.id("accordion__heading-4");
    public static final By SIXTH_QUESTION = By.id("accordion__heading-5");
    public static final By SEVENTH_QUESTION = By.id("accordion__heading-6");
    public static final By EIGHTH_QUESTION = By.id("accordion__heading-7");
    public static final By FIRST_ANSWER = By.id("accordion__panel-0");
    public static final By SECOND_ANSWER = By.id("accordion__panel-1");
    public static final By THIRD_ANSWER = By.id("accordion__panel-2");
    public static final By FOURTH_ANSWER = By.id("accordion__panel-3");
    public static final By FIFTH_ANSWER = By.id("accordion__panel-4");
    public static final By SIXTH_ANSWER = By.id("accordion__panel-5");
    public static final By SEVENTH_ANSWER = By.id("accordion__panel-6");
    public static final By EIGHTH_ANSWER = By.id("accordion__panel-7");

    private By orderInTheTopButton = By.xpath(".//button[@class = 'Button_Button__ra12g']");
    private By orderInTheMiddleButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_UltraBig__UU3Lp']");

    private By cookieYes = By.id("rcc-confirm-button");

    public static final String EXPECTED_FIRST_ANSWER = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickQuestion(By question) {
        driver.findElement(question).click();
    }

    public void clickCookie() {
        driver.findElement(cookieYes).click();
    }
    public String getTextOfAnswer(By answer) {
        return driver.findElement(answer).getText();
    }




}
