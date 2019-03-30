package lesson8.homeWork.math;

public class Arithmetic {
    int[] array;

    public Arithmetic(int[] array) {
        this.array = array;
    }

    public Arithmetic() {
    }

    public int minIntOfArray(int[] array) {
        int min = array[0];
        for (int el : array) {
            if (el < min)
                min = el;
        }
        return min;
    }

    public int maxIntOfArray(int[] array) {
        int max = array[0];
        for (int el : array) {
            if (el > max)
                max = el;
        }
        return max;
    }

    public boolean check(int[] array) {
        if (maxIntOfArray(array) + minIntOfArray(array) > 100)
            return true;
        else
            return false;
    }
}
