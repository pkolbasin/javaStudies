package lesson9.homeWork;

public class UserRepository {


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
}
