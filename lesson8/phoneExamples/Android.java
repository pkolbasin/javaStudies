package lesson8.phoneExamples;

public class Android extends Phone {
    //int price;
    //double weight;
    //String countryProduced;
    String ahdroidVersion;
    int screenSize;
    String secretDeviceCode;

    public Android(int price, double weight, String countryProduced, String ahdroidVersion, int screenSize, String secretDeviceCode) {
        //  this.price = price;
        //  this.weight = weight;
        //  this.countryProduced = countryProduced;
        super(price, weight, countryProduced);
        //super - reference to the parent class object
        // this -  to the current
        this.ahdroidVersion = ahdroidVersion;
        this.screenSize = screenSize;
        this.secretDeviceCode = secretDeviceCode;
    }

    void installNewAndroidVersion() {
        System.out.println("installNewAndroidVersion invoked...");
    }
}
