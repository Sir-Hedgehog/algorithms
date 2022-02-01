package algorithms.bubble;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 01.02.2022
 */
public class BubbleSortTest {
    @Test
    public void testDifferentElements() {
        var bubbleSort = new BubbleSort();
        int[] array = {5, 19, 10, 60, 46, 89, 98, 101, 76, 11};
        final int[] expect = {5, 10, 11, 19, 46, 60, 76, 89, 98, 101};

        var result = bubbleSort.sort(array);

        assertEquals(Arrays.toString(expect), Arrays.toString(result));
    }

    @Test
    public void testElementsWhereSomeFromTheseAreSame() {
        var bubbleSort = new BubbleSort();
        int[] array = {5, 10, 10, 60, 5};
        final int[] expect = {5, 5, 10, 10, 60};

        var result = bubbleSort.sort(array);

        assertEquals(Arrays.toString(expect), Arrays.toString(result));
    }
}
