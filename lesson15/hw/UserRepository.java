package lesson15.hw;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;

    }

    //  save user
    public User save(User user) {
        if (user != null) {
            for (int el = 0; el < users.length; el++) {
                if (!users[el].equals(user)) {
                    return null;
                }
                if (users[el] == null) {
                    return users[el] = user;
                }
            }
        }

        return null;
    }

    public User update(User user) {
        if (user != null) {
            for (int el = 0; el < users.length; el++) {

                if (users[el].getId() == user.getId() && !user.equals(users[el]) && user.hashCode() != users[el].hashCode()) {
                    return users[el] = user;
                }
            }

        }
        return null;
    }

    public void delete(long id) {
        for (int el = 0; el < users.length; el++) {
            if (users[el] != null && users[el].getId() == id) {
                users[el] = null;
            }
        }
    }

    public User findUser(User user) {
        for (int el = 0; el < users.length; el++) {
            if (users[el] != null && user.equals(users[el]) && users[el].hashCode() == user.hashCode()) {
                return user;
            }
        }
        return null;
    }

}