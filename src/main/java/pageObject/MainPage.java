package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;




public class MainPage {

    private WebDriver driver;

    //Куки
    private By cookieYes = By.id("rcc-confirm-button");

    //Адрес главной страницы
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";


//Вопросы о важном. 8 вопросов по порядку
    private List<String> questions = new ArrayList<>();
    public void addQuestions() {
        questions.add("accordion__heading-0");
        questions.add("accordion__heading-1");
        questions.add("accordion__heading-2");
        questions.add("accordion__heading-3");
        questions.add("accordion__heading-4");
        questions.add("accordion__heading-5");
        questions.add("accordion__heading-6");
        questions.add("accordion__heading-7");
    }

    public List<String> getQuestions() {
        return questions;
    }

    //Коллекция ответов на вопросы, по порядку, 8 штук
    private List<String> answers = new ArrayList<>();
    public void addAnswers() {
        answers.add(".//div[@id = 'accordion__panel-0']/p");
        answers.add(".//div[@id = 'accordion__panel-1']/p");
        answers.add(".//div[@id = 'accordion__panel-2']/p");
        answers.add(".//div[@id = 'accordion__panel-3']/p");
        answers.add(".//div[@id = 'accordion__panel-4']/p");
        answers.add(".//div[@id = 'accordion__panel-5']/p");
        answers.add(".//div[@id = 'accordion__panel-6']/p");
        answers.add(".//div[@id = 'accordion__panel-7']/p");
    }

    public List<String> getAnswers() {
        return answers;
    }

    //Кнопка "Заказать" в шапке
    private By orderInTheTopButton = By.xpath(".//button[@class = 'Button_Button__ra12g']");
    public static final String ORDER_IN_THE_TOP_BUTTON_SELECTOR = ".//button[@class = 'Button_Button__ra12g']";

    //Кнопка "Заказать" внизу страницы
    private By orderInTheMiddleButton = By.xpath(".//div[@class = 'Home_FinishButton__1_cWm']/button");
    public static final String ORDER_IN_THE_MIDDLE_BUTTON_SELECTOR = ".//div[@class = 'Home_FinishButton__1_cWm']/button";

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

    public void scrollTillElement(String question) {
        WebElement element = driver.findElement(By.id(question));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickQuestion(String question) {
        driver.findElement(By.id(question)).click();
    }

    public String getTextOfAnswer(String answer) {
        return driver.findElement(By.xpath(answer)).getText();
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
