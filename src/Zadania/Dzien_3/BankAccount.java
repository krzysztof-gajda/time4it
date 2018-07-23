package Zadania.Dzien_3;

public class BankAccount {
    private int amount=10000;

    public int withdraw(int amount){
        if(amount>this.amount)
            ;
        else
            this.amount-=amount;

        return this.amount;
    }

    public int deposit(int amount){
        this.amount+=amount;
        return this.amount;
    }
}
