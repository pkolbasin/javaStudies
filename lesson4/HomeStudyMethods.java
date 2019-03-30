package lesson4;

public class HomeStudyMethods {
    public static void main(String[] args) {
        System.out.println(concat("Java ", "the ", "best "));
    }

    public static String concat(String first, String second, String third){
        String result = first + second + third;
        return result;
    }
}
