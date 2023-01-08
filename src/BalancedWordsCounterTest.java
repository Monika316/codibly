import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedWordsCounterTest {
    @Test
    public void testCount_balancedWords() {
        String input = "aabbabcccba";
        int expected = 28;
        assertEquals(expected, BalancedWordsCounter.count(input));
    }

    @Test
    public void testCount_emptyString() {
        String input = "";
        int expected = 0;
        assertEquals(expected, BalancedWordsCounter.count(input));
    }

    @Test(expected = RuntimeException.class)
    public void testCount_nonLetterCharacters() {
        String input = "abababa1";
        BalancedWordsCounter.count(input);
    }

    @Test(expected = RuntimeException.class)
    public void testCount_nullInput() {
        BalancedWordsCounter.count(null);
    }
}