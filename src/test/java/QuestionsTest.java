import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pageObject.MainPage;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuestionsTest extends BaseOfTest {
    private int i;
    private String expectedText;

    public QuestionsTest(int i, String expectedText) {
        this.i = i;
        this.expectedText = expectedText;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {0, MainPage.EXPECTED_TEXT_OF_FIRST_ANSWER},
                {1, MainPage.EXPECTED_TEXT_OF_SECOND_ANSWER},
                {2, MainPage.EXPECTED_TEXT_OF_THIRD_ANSWER},
                {3, MainPage.EXPECTED_TEXT_OF_FOURTH_ANSWER},
                {4, MainPage.EXPECTED_TEXT_OF_FIFTH_ANSWER},
                {5, MainPage.EXPECTED_TEXT_OF_SIXTH_ANSWER},
                {6, MainPage.EXPECTED_TEXT_OF_SEVENTH_ANSWER},
                {7, MainPage.EXPECTED_TEXT_OF_EIGHTH_ANSWER},
        };
}

    @Test
    public void clickOnTheFirstQuestionTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.addQuestions();
        mainPage.addAnswers();

        driver.get(MainPage.URL);
        mainPage.clickCookie();
        mainPage.scrollTillElement(mainPage.getQuestions().get(i));
        mainPage.clickQuestion(mainPage.getQuestions().get(i));
        String actual = mainPage.getTextOfAnswer(mainPage.getAnswers().get(i));
        assertEquals(expectedText, actual);
    }

}