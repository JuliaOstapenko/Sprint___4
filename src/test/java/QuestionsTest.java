import pageObject.MainPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionsTest extends BaseOfTest{
    @Test
    public void clickOnTheFirstQuestionTest() {

        driver.get(MainPage.URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookie();
        mainPage.clickQuestion(MainPage.FIRST_QUESTION);
        String actual = mainPage.getTextOfAnswer(MainPage.FIRST_ANSWER);
        assertEquals(MainPage.EXPECTED_TEXT_OF_FIRST_ANSWER, actual);
    }

    @Test
    public void clickOnTheSecondQuestionTest() {

        driver.get(MainPage.URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookie();
        mainPage.clickQuestion(MainPage.SECOND_QUESTION);
        String actual = mainPage.getTextOfAnswer(MainPage.SECOND_ANSWER);
        assertEquals(MainPage.EXPECTED_TEXT_OF_SECOND_ANSWER, actual);
    }
    @Test
    public void clickOnTheThirdQuestionTest() {

        driver.get(MainPage.URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookie();
        mainPage.clickQuestion(MainPage.THIRD_QUESTION);
        String actual = mainPage.getTextOfAnswer(MainPage.THIRD_ANSWER);
        assertEquals(MainPage.EXPECTED_TEXT_OF_THIRD_ANSWER, actual);
    }
    @Test
    public void clickOnTheFourthQuestionTest() {

        driver.get(MainPage.URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookie();
        mainPage.clickQuestion(MainPage.FOURTH_QUESTION);
        String actual = mainPage.getTextOfAnswer(MainPage.FOURTH_ANSWER);
        assertEquals(MainPage.EXPECTED_TEXT_OF_FOURTH_ANSWER, actual);
    }

    @Test
    public void clickOnTheFifthQuestionTest() {

        driver.get(MainPage.URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookie();
        mainPage.clickQuestion(MainPage.FIFTH_QUESTION);
        String actual = mainPage.getTextOfAnswer(MainPage.FIFTH_ANSWER);
        assertEquals(MainPage.EXPECTED_TEXT_OF_FIFTH_ANSWER, actual);
    }

    @Test
    public void clickOnTheSixthQuestionTest() {

        driver.get(MainPage.URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookie();
        mainPage.clickQuestion(MainPage.SIXTH_QUESTION);
        String actual = mainPage.getTextOfAnswer(MainPage.SIXTH_ANSWER);
        assertEquals(MainPage.EXPECTED_TEXT_OF_SIXTH_ANSWER, actual);
    }

    @Test
    public void clickOnTheSeventhQuestionTest() {

        driver.get(MainPage.URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookie();
        mainPage.clickQuestion(MainPage.SEVENTH_QUESTION);
        String actual = mainPage.getTextOfAnswer(MainPage.SEVENTH_ANSWER);
        assertEquals(MainPage.EXPECTED_TEXT_OF_SEVENTH_ANSWER, actual);
    }

    @Test
    public void clickOnTheEighthQuestionTest() {

        driver.get(MainPage.URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookie();
        mainPage.clickQuestion(MainPage.EIGHTH_QUESTION);
        String actual = mainPage.getTextOfAnswer(MainPage.EIGHTH_ANSWER);
        assertEquals(MainPage.EXPECTED_TEXT_OF_EIGHTH_ANSWER, actual);
    }
}