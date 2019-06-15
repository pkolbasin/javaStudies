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
        double deliveryPrice = getShipToCity() != null && (getShipToCity() == "Киев" || getShipToCity() == "Одесса") ?
                getBasePrice() * 0.1 : getBasePrice() * 0.15;
        double discount = getBasePrice() > 1000 ? (getBasePrice() + deliveryPrice) * 0.05 : 0;

        setTotalPrice(getBasePrice() + deliveryPrice - discount);
    }


}
