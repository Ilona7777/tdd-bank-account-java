package org.xpdojo.bank;

public class Account {
    public int balance=0;
    public int getBalance(){
        return balance;
    }

    public int putAmountBalance(int amount ){

        return getBalance()+amount;
    }
}
