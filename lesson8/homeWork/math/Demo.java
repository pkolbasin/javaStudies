package lesson8.homeWork.math;

public class Demo {
    public static void main(String[] args) {
        int a = 17;
        int b = 4;
        int[] array = {10, 58, 43, 22, 14, 158, 54};

        Adder adder = new Adder(array, a, b);
        adder.check(array);
        adder.add(a, b);
    }
}
