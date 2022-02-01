package algorithms.quick;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 01.02.2022
 */
public class QuickSort {

    /**
     * Метод сортирует массив с помощью алгоритма быстрой сортировки
     * @param inputArray - неотсортированный массив
     * @param start - индекс начала массива
     * @param end - индекс конца массива
     * @return - отсортированный массив
     */
    public int[] sort(int[] inputArray, int start, int end) {

        if (start < end) {
            var borderIndex = divide(inputArray, start, end);
            sort(inputArray, start, borderIndex - 1);
            sort(inputArray, borderIndex, end);
        }

        return inputArray;
    }

    /**
     * Метод делит массив на отсортированные подмассивы
     * @param inputArray - массив
     * @param start - индекс начала массива
     * @param end - индекс конца массива
     * @return - граница между отсортированными подмассивами
     */
    private int divide(int[] inputArray, int start, int end) {
        var leftIndex = start;
        var rightIndex = end;
        var currentElement = inputArray[(start + end) / 2];

        while (leftIndex <= rightIndex) {
            while (inputArray[leftIndex] < currentElement) {
                leftIndex++;
            }

            while (inputArray[rightIndex] > currentElement) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                change(inputArray, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }

    /**
     * Метод меняет элементы массива местами
     * @param array - массив
     * @param start - индекс первого массива
     * @param end - индекс второго массива
     */
    private void change(int[] array, int start, int end) {
        var temp = array[end];
        array[end] = array[start];
        array[start] = temp;
    }
}
