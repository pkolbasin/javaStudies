package lesson8.phoneExamples;

public class IPhone extends Phone {

    boolean fingerPrint;

    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint) {
        super(price, weight, countryProduced);
        System.out.println("IPhone constructor was invoked...");
        this.fingerPrint = fingerPrint;

    }


    public void deleteIPhoneFromDb() {
        System.out.println("deleteIPhoneFromDb invoked...");
    }

}
