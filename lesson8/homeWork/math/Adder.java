package lesson8.homeWork.math;

public class Adder extends Arithmetic {
    int a;
    int b;

    public Adder(int[] array, int a, int b) {
        super(array);
        this.a = a;
        this.b = b;
    }

    public Adder(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public long add(int a, int b) {
        long sum = a + b;
        return sum;
    }
}
