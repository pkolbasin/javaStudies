package lesson9.utils;

public class Cheker {
    int companyNamesValidatedCount =4;

    boolean checkCompanyName(String companyName){
        return companyName != "Google" && companyName != "Amazon";
    }
}
