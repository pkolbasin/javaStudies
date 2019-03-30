package lesson2;

public class SumAndDivision {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        while (a <= 1000) {
            b += a;
            a++;
        }
        int c = b / 1234;


        int d = b % 1234;

        boolean bul = d > c;
        System.out.println(bul);
    }


}
