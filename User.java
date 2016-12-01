/**
 * Created by VINNI on 23.11.16.
 */
public class User {

    private static void out (Bank bank){

        bank.getLimitOfWithdrawal();
        bank.getLimitOfFunding();
        bank.getMonthlyRate();
        bank.getCommission(500);
    }

    public static void main(String[] args){
        //bankCountry="usbank";//вносим название банка

        Bank usbank = new USBank();
        Bank eubank = new EUBank();
        Bank chinabank = new ChinaBank();

        int id=0; // вносим id банка

        Bank[] bankCountry={usbank, eubank, chinabank};

        out(bankCountry[id]);
    }
}
