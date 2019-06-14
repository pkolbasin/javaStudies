package lesson10.hw;

import java.util.Date;

public class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        if (getShipFromCity() == "Киев" || getShipFromCity() == "Львов") {
            if (getBasePrice() >= 500) {
                if (getCustomerOwned().getName() != "Тест") {
                    setDateConfirmed(new Date());
                }
            }
        }

    }

    @Override
    public void calculatePrice() {
        double deliveryPrice;
        if (getBasePrice() < 5000) {
            deliveryPrice = getBasePrice() * 0.05;
        } else {
            deliveryPrice = getBasePrice() * 0.02;
        }

        setTotalPrice(getBasePrice() + deliveryPrice);
    }
}
