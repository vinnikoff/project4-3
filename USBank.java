/**
 * Created by VINNI on 23.11.16.
 */
 class USBank extends Bank
{

    @Override
public int getLimitOfWithdrawal() {
    if (getCurrence()==Currence.USD) return 1000;
        else return 1200;
}

    @Override
    int getLimitOfFunding() {
        if (getCurrence()==Currence.USD) return 0;
        else return 10000;
    }

    @Override
int getMonthlyRate() {
        if (getCurrence()==Currence.USD) return 1;
        else return 2;
}

    @Override
    int getCommission(int summ) {

        if (getCurrence()==Currence.USD) {
            if (summ<1000) return 5;
            else return 7;
        }
        else{
        if (summ<1000) return 6;
        else return 8;}
    }

    }

