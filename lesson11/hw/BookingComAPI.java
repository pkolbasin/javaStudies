package lesson11.hw;

public class BookingComAPI implements API {
    Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;

        for (Room room : rooms) {
            if (room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                if (room.getPrice() >= price - 100 && room.getPrice() <= price + 100) {
                    count++;
                }
            }
        }

        Room[] foundRooms = new Room[count];
        count = 0;
        for (Room room : rooms) {
            if (room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                if (room.getPrice() >= price - 100 && room.getPrice() <= price + 100) {
                    foundRooms[count] = room;
                    count++;
                }
            }
        }
        return foundRooms;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
