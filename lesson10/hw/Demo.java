package lesson10.hw;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Ivan", "London", "Мужской");
        Customer customer2 = new Customer("Olga", "Pripjat", "Женский");

        ElectronicsOrder order1 = new ElectronicsOrder("Lenovo", new Date(), "Киев", "Львов", 5000, customer1, 10);
        ElectronicsOrder order2 = new ElectronicsOrder("Makentosh", new Date(), "Бобруйск", "Пятихатки", 100500, customer2, 4);
        FurnitureOrder order3 = new FurnitureOrder("RezinovajaZina", new Date(), "Крыжополь", "Кобеляки", 999, customer1, "11111!!!!");
        FurnitureOrder order4 = new FurnitureOrder("ДвернаяРучка", new Date(), "Васильков", "Одесса", 1877, customer2, "аааа!!");

        order1.validateOrder();
        order1.calculatePrice();
        order1.confirmShipping();

        order2.validateOrder();
        order2.calculatePrice();
        order2.confirmShipping();

        order3.validateOrder();
        order3.calculatePrice();
        order3.confirmShipping();

        order4.validateOrder();
        order4.calculatePrice();
        order4.confirmShipping();

    }
}
