package lesson5;

import java.sql.Array;
import java.util.Arrays;

public class SearchUniqueFromArray {
    public static void main(String[] args) {
        int[] array = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11};
        System.out.println(uniqueCount(array));
    }

    public static int uniqueCount(int[] array) {
        int[] bufarray = boobleSortMethod(array);
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (bufarray[i] != bufarray[i + 1]) {
                count++;
            }
        }

        return count;
    }


    public static int[] boobleSortMethod(int[] array) {
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


}










