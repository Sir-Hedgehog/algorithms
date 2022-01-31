package algorithms.max;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 31.01.2022
 */
public class ArrayMax {

    /**
     * Метод находит максимальное значение в массиве
     * @param array - массив
     * @return - максимальное значение
     */
    public String findMax(int[] array) {
        var value = array[0];
        String pattern = "The max value is ";

        for (int current = 1; current < array.length; current++) {
            if (array[current] > value) {
                value = array[current];
            }
            if (array[current] == array[array.length - 1] && value == array[current]) {
                return pattern + "absent";
            }
        }

        return "The max value is " + value;
    }
}
