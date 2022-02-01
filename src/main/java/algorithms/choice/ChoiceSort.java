package algorithms.choice;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 01.02.2022
 */
public class ChoiceSort {

    /**
     * Метод сортирует массив выбором
     * @param array - исходный массив
     * @return - отсортированный массив
     */
    public int[] sort(int[] array) {

        for (int start = 0; start < array.length; start++) {
            var index = findMin(array, start);

            var temp = array[index];
            array[index] = array[start];
            array[start] = temp;
        }

        return array;
    }

    /**
     * Метод находит индекс минимального значения в массиве
     * @param array - массив
     * @return - индекс минимального значения
     */
    private int findMin(int[] array, int start) {
        var value = array[start];
        var minIndex = start;

        for (int index = start; index < array.length; index++) {
            if (array[index] < value) {
                value = array[index];
                minIndex = index;
            }
        }

        return minIndex;
    }
}
