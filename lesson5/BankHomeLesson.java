package lesson5;

import java.util.Arrays;

public class BankHomeLesson {
    public static void main(String[] args) {
    String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
    int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(withdraw(names, balances, "John", 100));
}

    public static int withdraw(String[] clients, int[] balances, String client, int amount){

        int clientIndex = findClientIndexByName(clients, client);
        int result = 0;
        if (balances[clientIndex] >= amount)
        return result = balances[clientIndex] - amount;
        else
            return -1;
    }




    public static   int findClientIndexByName(String[] clients, String client){
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }


}
