import description.pageObject.MainPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import static org.junit.Assert.assertEquals;

public class QuestionsTest {
    private WebDriver driver;
    @Test
    public void clickOnTheFirstQuestionTest() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookie();
        mainPage.clickQuestion(MainPage.FIRST_QUESTION);
        String actual = mainPage.getTextOfAnswer(MainPage.FIRST_ANSWER);
        assertEquals(MainPage.EXPECTED_FIRST_ANSWER, actual);
    }
    @After
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }
}