package lesson11.hw;

public class Controller {
    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int el = 0;
        for (API api : apis) {
            if (api != null) {
                el += api.findRooms(price, persons, city, hotel).length;
            }
        }

        Room[] foundRooms = new Room[el];

        el = 0;
        for (API api : apis) {
            for (Room room : api.findRooms(price, persons, city, hotel)) {
                if (api != null) {
                    foundRooms[el] = room;
                    el++;
                }
            }
        }

        return foundRooms;
    }

    public Room[] check(API api1, API api2) {

        int el = 0;

        for (Room room : api1.getAll()) {
            for (Room room1 : api2.getAll()) {
                if (room.getPrice() == room1.getPrice() && room.getPersons() == room1.getPersons()
                        && room.getHotelName().equals(room1.getHotelName()) && room.getCityName().equals(room1.getCityName())) {
                    el++;
                }
            }
        }

        Room[] sameRooms = new Room[el];

        el = 0;
        for (Room room : api1.getAll()) {
            for (Room room1 : api2.getAll()) {
                if (room.getPrice() == room1.getPrice() && room.getPersons() == room1.getPersons()
                        && room.getHotelName().equals(room1.getHotelName()) && room.getCityName().equals(room1.getCityName())) {
                    sameRooms[el] = room;
                    el++;
                }
            }
        }
        return sameRooms;

    }

}
