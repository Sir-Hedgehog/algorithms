package algorithms.binary;

import algorithms.bubble.BubbleSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 08.02.2022
 */
public class BinarySearchTest {
    private int[] sortedArray;

    @Before
    public void initBubbleSort() {
        int[] array = {5, 19, 10, 60, 46, 99, 98, 101, 76, 11, 74};
        var bubbleSort = new BubbleSort();
        sortedArray = bubbleSort.sort(array);
    }

    @Test
    public void testBinarySearchOf76WithSortedArray() {
        var binarySearch = new BinarySearch();

        var result = binarySearch.search(sortedArray, 76);
        final var expect = 7;

        assertEquals(expect, result);
    }

    @Test
    public void testBinarySearchOf19WithSortedArray() {
        var binarySearch = new BinarySearch();

        var result = binarySearch.search(sortedArray, 19);
        final var expect = 3;

        assertEquals(expect, result);
    }

    @Test
    public void testBinarySearchWithSortedArrayIfNumberIsAbsent() {
        var binarySearch = new BinarySearch();

        var result = binarySearch.search(sortedArray, 333);
        final var expect = -1;

        assertEquals(expect, result);
    }
}