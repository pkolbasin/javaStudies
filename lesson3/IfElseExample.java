package lesson3;

public class IfElseExample {
    public static void main(String[] args) {
        int test = 1000;
        if (test > 100) {
            System.out.println("Good");
            System.out.println("....");
        } else {
            System.out.println("Bad");
            System.out.println("....");
        }

        int test1 = 1000;
        boolean result = false;
        if (test1 > 1000) {
            result = true;
        }
        if (result)
            System.out.println("Nise");
        else
            System.out.println("Not nise");

        if (result && test1 > 100 || test > 500) {
            System.out.println("!");
        } else
            System.out.println("?");

        if (!(test1 > 0)) {
            System.out.println("!!!!!");
        }
    }
}
