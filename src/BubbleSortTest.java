import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {
    @Test
    public void testSort_numbers() {
        List<Integer> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Integer> expected = Arrays.asList(1, 3, 4, 5, 6, 8, 8);
        assertEquals(expected, BubbleSort.sort(input));
    }

    @Test
    public void testSort_decimals() {
        List<Double> input = Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0);
        List<Double> expected = Arrays.asList(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0);
        assertEquals(expected, BubbleSort.sort(input));
    }

    @Test
    public void testSort_emptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, BubbleSort.sort(input));
    }

    @Test
    public void testSort_nullValue() {
        List<Double> input = Arrays.asList(null, 5.0001);
        List<Double> expected = Arrays.asList(5.0001);
        assertEquals(expected, BubbleSort.sort(input));
    }

    @Test(expected = RuntimeException.class)
    public void testSort_nullInput() {
        BubbleSort.sort(null);
    }
}

