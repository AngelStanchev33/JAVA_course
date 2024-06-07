package _03_JavaAdvanced._09_DefiningClasses._2_BankAccount;

public class BankAccount {

    private int id;
    private double balance;
    private static double interestRate = 0.2;
    private static int idCounter = 1;

    public BankAccount() {
        this.id = idCounter;
        idCounter++;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterestRate(int years) {
        return interestRate * years * balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public int getId() {
        return id;
    }
}
