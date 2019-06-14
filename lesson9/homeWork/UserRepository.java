package lesson9.homeWork;

public class UserRepository {


    public static void main(String[] args) {

    }

    private User[] users;


    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        String[] names = new String[users.length];
        for (int el = 0; el < users.length; el++) {
            if (users[el] != null) {
                names[el] = users[el].getName();
            } else
                names[el] = null;
        }
        return names;
    }


    public long[] getUserIds() {
        int counter = 0;
        for (int el = 0; el < users.length; el++) {
            if (users[el] != null)
                counter++;
        }
        long[] ids = new long[counter];
        int idsCount = 0;
        for (int el1 = 0; el1 < users.length; el1++) {
            if (users[el1] != null) {
                ids[idsCount] = users[el1].getId();
                idsCount++;
            } else
                el1++;
        }
        return ids;
    }


    public User getUserByName(String name) {
        for (User user : users) {
            if (user != null && user.getName() == name)
                return user;

        }
        return null;
    }

    private User findById(long id) {
        for (User user : users) {
            if (user != null && user.getId() == id)
                return user;

        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        for (User user : users) {
            if (user != null && user.getSessionId() == sessionId)
                return user;

        }
        return null;
    }

    public String getUserNameById(long id) {
        String nameById = null;
        for (int el = 0; el < users.length; el++) {
            if (users[el] != null) {
                if (id == users[el].getId()) {
                    nameById = users[el].getName();

                } else
                    el++;
            }
        }
        return nameById;
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

                if (users[el].getId() == user.getId()) {
                    return users[el] = user;
                }
            }

        }
        return null;
    }

    public void delete(long id) {
        if (findById(id) != null) {
            for (int el = 0; el < users.length; el++) {
                if (users[el] != null && users[el].getId() == id) {
                    users[el] = null;
                }
            }
        }
    }

}
