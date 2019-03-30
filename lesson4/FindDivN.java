package lesson4;

public class FindDivN {
    public static void main(String[] args) {
        short a = 1;
        short b = 5;
        int n = 1;
        System.out.println(findDivCount(a, b, n));
    }

    public static int findDivCount(short a, short b, int n) {
      int result = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                result++;
            }
        }
        return result;
    }
}
