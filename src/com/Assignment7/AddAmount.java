package com.Assignment7;

public class AddAmount {
    double balance =50;
    double amount ;


   public AddAmount() {
        double balance;

    }   /* public AddAmount(double initialBalance) {
            balance =initialBalance;
        }*/

        public  AddAmount(double Amount){
        double newBalance = balance+ Amount;
        balance = newBalance;
        }


    public double getAmount() {
            amount =  balance + amount;
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}





