package lesson15.hw;

public class UserRepository {
    private User[] users;


    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }


    public User findById(long id) {
        for (User user : users) {
            if (user != null && user.getId() == id)
                return user;
        }
        return null;
    }


    public User save(User user) {
        if (user != null && findById(user.getId()) == null) {
            for (int el = 0; el < users.length; el++) {

                if (users[el] == null) {
                    return users[el] = user;
                }
            }

        }

        return null;
    }


    public User update(User user) {
        if (user != null && findById(user.getId()) != null) {
            for (int el = 0; el < users.length; el++) {

                if (user.getId() == users[el].getId() && !user.equals(users[el]) && user.hashCode() != users[el].hashCode()) {
                    return users[el] = user;
                }
            }

        }
        return null;
    }

    public void delete(long id) {
        if (findById(id) != null) {
            for (int el = 0; el < users.length; el++) {
                if (findById(id).equals(users[el]) && findById(id).hashCode() == users[el].hashCode()) {
                    users[el] = null;
                }
            }
        }
    }


    public User findUser(User user) {
        if (user != null) {
            for (int el = 0; el < users.length; el++) {
                if (users[el] != null && users[el].equals(user) && users[el].hashCode() == user.hashCode())
                    return user;
            }
        }
        return null;

    }
}