package lesson12;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD)
            return 100;
        else if (getCurrency() == Currency.EUR)
            return 150;
        else
            kakaCur();
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR)
            return 5000;
        else if (getCurrency() == Currency.USD)
            return 10000;
        else
            kakaCur();
        return 0;
    }

    @Override
    public double getMonthlyRate() {
        if (getCurrency() == Currency.EUR)
            return 0.00;
        else if (getCurrency() == Currency.USD)
            return 0.01;
        else
            kakaCur();
        return 0;
    }

    @Override
    public double getCommission(int amount) {
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000)
                return 0.03;
            else
                return 0.05;
        } else {

            if (amount <= 1000)
                return 0.10;
            else
                return 0.11;
        }
    }

    public void kakaCur() {
        System.err.println("bad Currency");

    }
}