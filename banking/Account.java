package banking;

public class Account {

  private double balance;

  public Account(double bal) {
    balance = bal;
  }
public double getBalance() {
    return balance;
  }
  public boolean deposit(double amount) {
    balance = balance + amount;
    return true;
}
