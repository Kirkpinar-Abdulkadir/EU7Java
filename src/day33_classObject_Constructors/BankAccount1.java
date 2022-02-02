package day33_classObject_Constructors;

public class BankAccount1 {

    double balance;

    //This constructor sets the starting balance to 0.0
    public BankAccount1(){
        balance = 0.0;
    }

    //This constructor sets the starting balance to the value passes as an argument
    public BankAccount1(double startBalance){
        balance = startBalance;
    }

    //This constructor sets the starting balance to the value in the string argument
    public  BankAccount1(String str){
        balance = Double.parseDouble(str);
    }

    //Deposit method makes a deposit into account
    public void deposit(String str){
        balance = balance + Double.parseDouble(str);
    }

    public double getBalance1(){
        return balance;
    }




}
