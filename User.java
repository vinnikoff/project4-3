/**
 * Created by VINNI on 23.11.16.
 */
public class User {
    static void out (Bank bank){
        bank.printCommission();
    }
    public static void main(String[] args){
        String nameBankIn="usbank";//вносим название банка
        int idBank=0;

        Bank usbank = new USBank();
        Bank eubank = new EUBank();
        Bank chinabank = new ChinaBank();

        if ( nameBankIn=="usbank") idBank=idBank;
        if ( nameBankIn=="eubank") idBank=1;
        if ( nameBankIn=="chinabank") idBank=2;


        Bank[] nameBank={usbank, eubank, chinabank};
        out(nameBank[idBank]);

    }

}
