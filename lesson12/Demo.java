package lesson12;

public class Demo {
    public static void main(String[] args) {
        ChinaBank chinaBank = new ChinaBank(300, "China", null, 100, 10000, 10, 100500);
        ChinaBank chinaBank1 = new ChinaBank(300, "China", Currency.EUR, 100, 10000, 10, 100500);
        ChinaBank chinaBank2 = new ChinaBank(300, "China", Currency.USD, 100, 10000, 10, 100500);
        System.out.println(chinaBank.getLimitOfWithdrawal());  // а что оно должно выдавать , если енам пустой?
        System.out.println(chinaBank1.getLimitOfWithdrawal());  // а что оно должно выдавать , если енам евро?
        System.out.println(chinaBank2.getLimitOfWithdrawal());  // а что оно должно выдавать , если енам доллар?


        System.out.println(chinaBank.getLimitOfFunding());  // а что оно должно выдавать , если енам пустой?
        System.out.println(chinaBank1.getLimitOfFunding());  // а что оно должно выдавать , если енам евро?
        System.out.println(chinaBank2.getLimitOfFunding());  // а что оно должно выдавать , если енам доллар?


    }
}
