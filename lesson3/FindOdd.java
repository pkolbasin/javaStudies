package lesson3;

public class FindOdd {
    public static void main(String[] args) {
        int stCount = 1;
        int sumCounts = 0;
        long result;
        while (stCount <= 1000){
            System.out.println("Found");
            sumCounts = sumCounts + stCount;
            stCount =stCount + 2;
        }
        result = sumCounts * 5;
        if(result > 5000)
            System.out.println("Bigger");
        else if(result == 5000)
            System.out.println("equal");
        else
            System.out.println("Smaller");
    }
}
