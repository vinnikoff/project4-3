/**
 * Created by VINNI on 23.11.16.
 */
public class EUBank extends Bank
{


    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrence()==Currence.USD) return 2000;
        else return 2200;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrence()==Currence.USD) return 10000;
        else return 20000;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrence()==Currence.USD) return 0;
        else return 1;
    }

    @Override
    int getCommission(int summ) {

        if (getCurrence()==Currence.USD) {
            if (summ<1000) return 5;
            else return 7;
        }
        else{
            if (summ<1000) return 2;
            else return 4;}
    }

}