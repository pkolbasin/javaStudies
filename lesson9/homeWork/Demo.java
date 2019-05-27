package lesson9.homeWork;

public class Demo {
    public static void main(String[] args) {

        User user1 = new User(10, "Jon", "dvi");
        User user2 = new User(0, null, null);
        User user3 = new User();

        System.out.println(UserRepository.users(user1, user2, user3).getUsersIds);
    }
}
