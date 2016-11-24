/**
 * Created by VINNI on 23.11.16.
 */
public class EUBank extends Bank{

    @Override
    void printCommission()
    {

        System.out.println("Валюта операции:"+Currence.USD);
        System.out.println("Лимит снятия:2000");
        System.out.println("Лимит пополнения:10 000");
        System.out.println("Месячная ставка: 0%");
        System.out.println("комиссия: 5% до 1000 USD и 7% больше 1000 USD");
        System.out.println("\n");


        System.out.println("Валюта операции:"+Currence.EUR);
        System.out.println("Лимит снятия:2200");
        System.out.println("Лимит пополнения:20 000");
        System.out.println("Месячная ставка: 1%");
        System.out.println("комиссия: 2% до 1000 USD и 4% больше 1000 USD");

    }
}