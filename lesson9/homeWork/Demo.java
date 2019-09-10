package lesson9.homeWork;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        User user1 = new User(1, "Senja", "ping");
        User user2 = new User(777777777, "Ann", "pong");
        User user3 = new User(5000, "Luis", "3445");
        User user4 = new User(1000, "Rachel", "qwerty");
        User user5 = new User(12345, null, null);
        User user6 = new User(666, "Slava", "123");
        User user7 = new User(666, "Slava", "123");
        User user8 = new User(2, "Sasha", "ghgb");
        User[] users = {user1, user2, user3, user4};
        User[] usersEmpty = {};

        UserRepository userRepository = new UserRepository(users);
        UserRepository empty = new UserRepository(usersEmpty);

        //getUserNames()
        System.out.println("getUserNames()");

        //works?
        System.out.println(Arrays.toString(userRepository.getUserNames()));

        //noname student
        User[] users1 = {user1, user2, user3, user4, user5, null};
        UserRepository userRepository1 = new UserRepository(users1);
        System.out.println(Arrays.toString(userRepository1.getUserNames()));

        // doubled names
        User[] users2 = {user1, user2, user3, user6, user7};
        UserRepository userRepository2 = new UserRepository(users2);
        System.out.println(Arrays.toString(userRepository2.getUserNames()));

        //empty array
        System.out.println(Arrays.toString(empty.getUserNames()));


        //getUserIds()
        System.out.println("getUserIds()");
        //works?
        System.out.println(Arrays.toString(userRepository.getUserIds()));

        //empty array
        System.out.println(Arrays.toString(empty.getUserIds()));

        //doubled  ids
        System.out.println(Arrays.toString(userRepository2.getUserIds()));


        //getUserNameById()

        System.out.println("getUserNameById()");
        //works?
        System.out.println(userRepository.getUserNameById(1));

        //incorrect id
        System.out.println(userRepository.getUserNameById(888));

        //doubled  ids
        System.out.println(userRepository2.getUserNameById(666));

        //empty array
        System.out.println(empty.getUserNameById(1));


        //getUserByName()
        System.out.println("getUserByName()");
        //works?
        System.out.println(userRepository.getUserByName("Senja"));

        //wrong name
        System.out.println(userRepository.getUserByName("Toljan"));

        //doubled name
        System.out.println(userRepository2.getUserByName("Slava"));

        //empty array
        System.out.println(empty.getUserByName("Jon"));


        //findById()
        System.out.println("findById()");

        //works?
        System.out.println(userRepository.findById(1));

        //incorrect id
        System.out.println(userRepository.findById(777));

        //doubled id
        System.out.println(userRepository2.findById(666));

        //empty array
        System.out.println(empty.findById(1));

        //getUserBySessionId()
        System.out.println("getUserBySessionId()");

        //works?
        System.out.println(userRepository.getUserBySessionId("ping"));

        //incorrect sessionId
        System.out.println(userRepository.getUserBySessionId("ololo"));

        //doubled sessionId
        System.out.println(userRepository2.getUserBySessionId("123"));

        //empty array
        System.out.println(empty.getUserBySessionId("123"));

        //save()
        System.out.println("save");

        //save new user
        System.out.println(userRepository1.save(user7));

        //user is in array
        System.out.println(userRepository2.save(user7));

        //array is full
        System.out.println(userRepository2.save(user6));


        //update()
        System.out.println("update");

        //update user +
        System.out.println(userRepository.update(user1));

        //incorrect user +
        System.out.println(userRepository.update(user8));

        // user is null
        System.out.println(userRepository.update(null));


        //delete()
        System.out.println("delete");
        //delete user
        userRepository.delete(1);
        System.out.println(Arrays.toString(users));


        //incorrect user
        userRepository.delete(999999);
        System.out.println(Arrays.toString(users));

        //doubled user
        userRepository2.delete(666);
        System.out.println(Arrays.toString(users2));


    }
}
