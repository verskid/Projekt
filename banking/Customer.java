package banking;

public class Customer {

  private Account  account;
  private String   firstName;
  private String   lastName;

  public Customer(String f, String l) {
    firstName = f;
    lastName = l;
  }
  public String getFirstName() {
	    return firstName;
  }
}
