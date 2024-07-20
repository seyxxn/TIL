package oop.ex;

public class Account {
    int balance; // 잔액

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if (amount > balance){
            System.out.println("잔액 부족");
        }else{
            balance -= amount;
        }
    }
}
