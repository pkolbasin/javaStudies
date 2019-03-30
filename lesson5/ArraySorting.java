package lesson5;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {10,15,4,22,17,3,995,84,17};
        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));

    }

    public static int[] sortAscending(int[] array){
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }
    public static int[] sortDescending(int[] array){
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }
}
