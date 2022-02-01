package algorithms.bubble;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 01.02.2022
 */
public class BubbleSort {

    /**
     * Метод сортирует массив с помощью алгоритма "Пузырьковой сортировки"
     * @param array - неотсортированный массив
     * @return - отсортированный массив
     */
    public int[] sort(int[] array) {

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int index = 1; index < array.length; index++) {
                if (array[index - 1] > array[index]) {
                    int temp = array[index];
                    array[index] = array[index - 1];
                    array[index - 1] = temp;
                    isSorted = false;
                }
            }
        }

        return array;
    }
}
