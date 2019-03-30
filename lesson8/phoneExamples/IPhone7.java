package lesson8.phoneExamples;

public class IPhone7 extends IPhone {
    boolean isGold;

    public IPhone7(int price, double weight, String countryProduced, boolean fingerPrint, boolean isGold) {
        super(price, weight, countryProduced, fingerPrint);
        this.isGold = isGold;
    }
}
