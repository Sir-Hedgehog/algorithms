package algorithms.merger;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 04.02.2022
 */
public class MergerSort {

    /**
     * Метод сортирует массив с помощью алгоритма "сортировки слиянием"
     * @param array - неотсортированный массив
     * @return - отсортированный массив
     */
    public int[] sort(int[] array) {
        int[] temp;
        int[] currentSrc = array;
        int[] currentDest = new int[array.length];

        int size = 1;
        while (size < array.length) {
            for (int index = 0; index < array.length; index += size * 2) {
                merge(currentSrc, index, currentSrc, index + size, currentDest, index, size);
            }

            temp = currentSrc;
            currentSrc = currentDest;
            currentDest = temp;

            size = size * 2;
        }

        return array;
    }

    /**
     * Метод соединяет отсортированные промежуточные массивы
     * @param firstArray - первый отсортированный массив
     * @param firstArrayStart  - начало первого отсортированного массива
     * @param secondArray - второй отсортированный массив
     * @param secondArrayStart - начало первого отсортированного массива
     * @param destination - массив-получатель двух отсортированных массивов
     * @param destinationStart - начало массива-получателя
     * @param size - размер промежуточного массива
     */
    private void merge(int[] firstArray, int firstArrayStart, int[] secondArray, int secondArrayStart,
                       int[] destination, int destinationStart, int size) {
        int firstIndex = firstArrayStart;
        int secondIndex = secondArrayStart;

        int firstArrayEnd = Math.min(firstIndex + size, firstArray.length);
        int secondArrayEnd = Math.min(secondIndex + size, secondArray.length);

        if (firstArrayStart + size > firstArray.length && firstArrayEnd - firstArrayStart >= 0) {
            System.arraycopy(firstArray, firstArrayStart, destination, firstArrayStart, firstArrayEnd - firstArrayStart);
        }

        int iteration = firstArrayEnd - firstArrayStart + secondArrayEnd - secondArrayStart;

        for (int current = destinationStart; current < destinationStart + iteration; current++) {
            if (firstIndex < firstArrayEnd && (secondIndex >= secondArrayEnd || firstArray[firstIndex] < secondArray[secondIndex])) {
                destination[current] = firstArray[firstIndex];
                firstIndex++;
            } else {
                destination[current] = secondArray[secondIndex];
                secondIndex++;
            }
        }
    }
}
