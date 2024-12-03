import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.util.*;


class CategoryChoseTest {

    @Test
    void testDogCategory() {
        String select = "perro";
        System.setIn(new ByteArrayInputStream(select.getBytes()));

        String[][] dogCategory = GameMecanics.categoryChose();
        assertArrayEquals(QuestionAnswerList.arrayQuestionsDog(), dogCategory);

        boolean isDog = Arrays.deepEquals(QuestionAnswerList.arrayQuestionsDog(), dogCategory);
        assertTrue(isDog, "Not a Dog Quiz");

    }

    @Test
    void testCatCategory() {
        String select = "gato";
        System.setIn(new ByteArrayInputStream(select.getBytes()));

        String[][] catCategory = GameMecanics.categoryChose();
        assertArrayEquals(QuestionAnswerList.arrayQuestionsCat(), catCategory);

        boolean isCat = Arrays.deepEquals(QuestionAnswerList.arrayQuestionsCat(), catCategory);
        assertTrue(isCat, "Not a Cat Quiz");
    }

    @Test
    void testFallo() {
        String select = "bird";
        System.setIn(new ByteArrayInputStream(select.getBytes()));

        assertThrows(IllegalArgumentException.class, () -> {
            GameMecanics.categoryChose();
        });

    }
}