package lesson4;

public class CompareSumsMethod {
    public static void main(String[] args) {

        System.out.println(compareSums(19,99,18,77));
    }

    public static boolean compareSums(int a, int b, int c, int d){
        long sumA = sum(a,b);
        long sumB = sum(c,d);
        if (sumA > sumB){
            return true;
        }
        else
            return false;
    }

    public static long sum(int from, int to){
        long result = 0;
        for(int i = from; i <= to; i++){
            result += i ;
        }
        return result;
    }
}
