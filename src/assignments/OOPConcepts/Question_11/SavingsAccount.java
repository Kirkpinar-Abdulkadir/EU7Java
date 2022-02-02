package assignments.OOPConcepts.Question_11;

import day17_classObjects_Part2.BankAccount;

public class SavingsAccount extends BankAccount {
    double interestRate;
    public double getInterestRate(){
        return interestRate;
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }
}
