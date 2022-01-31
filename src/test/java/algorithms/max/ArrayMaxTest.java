package algorithms.max;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 31.01.2022
 */
public class ArrayMaxTest {
    @Test
    public void testTenDifferentElements() {
        var arrayMax = new ArrayMax();
        int[] array = {5, 19, 10, 60, 46, 89, 98, 101, 76, 11};
        final var expect = "The max value is 101";

        var result = arrayMax.findMax(array);

        assertEquals(expect, result);
    }

    @Test
    public void testThreeSameElements() {
        var arrayMax = new ArrayMax();
        int[] array = {1, 1, 1};
        final var expect = "The max value is absent";

        var result = arrayMax.findMax(array);

        assertEquals(expect, result);
    }
}
