package lesson12;

public class UkrainianBankSystem implements BankSystem {


    @Override
    public void withdraw(User user, int amount) {
        //проверить, можно ли снять - проверить лимит и достаточно ли денег
        //снять
 /*     int limitOFWithdrawal = amount + user.getBank().getCommission(amount);
      if(amount + user.getBank().getCommission(amount)> limitOFWithdrawal){
         prinWithdrawalErrorMsg(amount, user);
          return;
      }
        if(amount + user.getBank().getCommission(amount)> user.getBalance()){
            prinWithdrawalErrorMsg(amount, user);
            return;
        }*/


        if (!checkWithdraw(user, amount))
            return;
        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));
    }

    @Override
    public void fund(User user, int amount) {
//todo at home
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        // снимаем деньги
        //пополняем
        if (!checkWithdraw(fromUser, amount))
            return;
        //todo check fund rules

        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));
        //todo fund


    }

    @Override
    public void paySalary(User user) {
//todo at home
    }

    private boolean checkWithdraw(User user, int amount) {
        return (!checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal())) &&
                !checkWithdrawLimits(user, amount, user.getBalance());
    }


    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private void printWithdrawalErrorMsg(int amount, User user) {
        System.err.println("Can't withdraw money" + amount + "from user" + user.toString());
    }
}
