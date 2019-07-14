package lesson11.hw;

public class TripAdvisorAPI implements API {
    Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;

        for (Room room : rooms) {
            if (room.getPrice() == price && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                if (room.getPersons() >= persons - 1 && room.getPersons() <= price + 1) {
                    count++;
                }
            }
        }

        Room[] foundRooms = new Room[count];
        count = 0;
        for (Room room : rooms) {
            if (room.getPrice() == price && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                if (room.getPersons() >= persons - 1 && room.getPersons() <= price + 1) {
                    foundRooms[count] = room;
                    count++;
                }
            }
        }
        return foundRooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
