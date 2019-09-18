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
            for (User userInBase : users) {
                if (userInBase == null) {
                    userInBase = user;
                    return user;
                }
            }
        }


        return null;
    }


    public User update(User user) {
        if (user != null && findById(user.getId()) != null) {
            for (User userInBase : users) {

                if (userInBase.getId() == user.getId() && user.equals(userInBase) && user.hashCode() != userInBase.hashCode()) {
                    return userInBase = user;
                }
            }

        }
        return null;
    }

    public void delete(long id) {
        if (findById(id) != null) {
            for (User userInBase : users) {
                if (userInBase.equals(findById(id)) && userInBase.hashCode() == findById(id).hashCode()) {
                    userInBase = null;
                }
            }
        }
    }


    public User findUser(User user) {
        if (user != null) {
            for (User userInBase : users) {
                if (userInBase != null && userInBase.equals(user) && userInBase.hashCode() == user.hashCode())
                    return user;
            }
        }
        return null;

    }
}