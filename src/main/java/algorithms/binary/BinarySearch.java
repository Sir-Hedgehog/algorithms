package algorithms.binary;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 08.02.2022
 */
public class BinarySearch {

    /**
     * Метод осуществляет бинарный поиск элемента в отсортированном массиве
     * @param sortedArray - отсортированный массив
     * @param target - искомый элемент
     * @return - индекс искомого элемента в массиве
     */
    public int search(int[] sortedArray, int target) {
        var start = 0;
        var end = sortedArray.length - 1;

        while (start <= end) {
            var middle = (start + end) / 2;

            if (sortedArray[middle] == target) {
                return middle;
            }

            if (sortedArray[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }
}