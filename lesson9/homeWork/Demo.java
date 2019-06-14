package lesson9.homeWork;

public class Demo {
    public static void main(String[] args) {
        User[] users = new User[10];



        User user1 = new User(10, "Jon", "dvi");
        User user2 = new User(0, null, null);
        User user3 = new User(4, "Melissandra", "pass");

        users[0] = user1;
        users[2] = user3;
        users[9] = user2;




    }
}
