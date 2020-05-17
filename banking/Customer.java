package banking;

public class Customer {

  private Account  account;
  private String   firstName;
  private String   lastName;

  public Account getAccount() {
	    return account;
  }
  public void setAccount(Account acct) {
	    account = acct;
  }
}
