package algorithms.quick;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 01.02.2022
 */
public class QuickSortTest {
    @Test
    public void testTenDifferentElements() {
        var quickSort = new QuickSort();
        int[] array = {5, 19, 10, 60, 46, 89, 98, 101, 76, 11, 74, 32};
        final int[] expect = {5, 10, 11, 19, 32, 46, 60, 74, 76, 89, 98, 101};

        var result = quickSort.sort(array, 0, array.length - 1);

        assertEquals(Arrays.toString(expect), Arrays.toString(result));
    }
}
