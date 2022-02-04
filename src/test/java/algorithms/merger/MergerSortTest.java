package algorithms.merger;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.02.2022
 */
public class MergerSortTest {
    @Test
    public void testTenDifferentElements() {
        var mergerSort = new MergerSort();
        int[] array = {5, 19, 10, 60, 46, 99, 98, 101, 76, 11, 74};
        final int[] expect = {5, 10, 11, 19, 46, 60, 74, 76, 98, 99, 101};

        var result = mergerSort.sort(array);

        assertEquals(Arrays.toString(expect), Arrays.toString(result));
    }
}
