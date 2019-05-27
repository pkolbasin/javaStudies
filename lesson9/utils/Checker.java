package lesson9.utils;

public class Checker {
    int companyNamesValidatedCount = 0;

    //public - видим в любой точке проэкта
    //private - доступно только внутри класса , где создан.
    //default (package-private) - доступно внутри пакета (папки) . инициируется если ни чего не заполнять.
    //protected - внутри класса, пакета, и у всех классов- наследников.
    public boolean checkCompanyName(String companyName) {
        if (companyNamesValidatedCount > 10)
            return false;

        companyNamesValidatedCount++;
        if (companyName == "Google" || companyName == "Amazon")
            return false;
        return true;

    }
}
