package lesson10.hw;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        String[] premCitys = {"Киев", "Одесса", "Днепр", "Харьков"};
        if (getBasePrice() >= 100) {
            if (getCustomerOwned().getName() != null) {
                if (getCustomerOwned().getGender() == "Женский") {
                    if (getShipFromCity() == "Киев" || getShipFromCity() == "Одесса" || getShipFromCity() == "Днепр" || getShipFromCity() == "Харьков") {
                        if (getShipToCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков") {
                            setDateConfirmed(new Date());
                        }

                    }
                }

            }
        }
    }


    @Override
    public void calculatePrice() {
        double deliveryPrice;
        double discount = 0.0;
        if (getShipToCity() == "Киев" || getShipToCity() == "Одесса") {
            deliveryPrice = getBasePrice() * 0.1;
        } else {
            deliveryPrice = getBasePrice() * 0.15;
        }

        if (getBasePrice() > 1000) {
            discount = getBasePrice() + deliveryPrice * 0.05;
        }

        setTotalPrice(getBasePrice() + deliveryPrice - discount);
    }


}
