
public class CreditCard {
	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;
	
	public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initialBal;
	}
	
	public CreditCard(String cust, String bk, String acnt, int lim) {
		this(cust, bk, acnt, lim, 0.0);
	}
	
	// accessor methods
	public String getCustomer() { return customer; }
	public String getBank() { return bank; }
	public String getAccount() { return account; }
	public int getLimit() { return limit; }
	public double getBalance() { return balance; }
	
	// update methods
	public boolean charge(double price) {
		if(price+balance>limit) {
			return false;
			// charge is successful
		}
		balance += price;
		return true;
	}
	
	public void makePayment(double amount) {
		if (amount > 0) {
			balance -= amount;
		}

	}
	
	public void updateLimit(double amount) {
		limit += amount;
	}
	
	// utility method to print a card's info
	public void printSummary() {
		System.out.println("Customer = " + customer);
		System.out.println("Bank = " + bank);		
		System.out.println("Account = " + account);
		System.out.println("Balance = " + balance);
		System.out.println("Limit = " + limit);
	}
	
	public String toString() {
		return "Customer= "+ customer + '\n'+ "bank=";
	}
	
	public static void main(String[] args) {
		CreditCard[] wallet = new CreditCard[3];
		wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
		wallet[1] = new CreditCard("John Bowman", "California Federal", "3485 0399 3395 1954", 3500);
		wallet[2] = new CreditCard("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);
	
		for (int val=1; val <= 16; val++) {
			wallet[0].charge(3*val);
			wallet[1].charge(2*val);
			wallet[2].charge(val);
		}
		
		wallet[0].updateLimit(500.0);
		System.out.println("Updated Limit: " + wallet[0].getLimit());
		System.out.println("New balance = " + wallet[0].getBalance());
		wallet[0].makePayment(-200);
		System.out.println("New balance = " + wallet[0].getBalance());
		for (CreditCard card : wallet) {
			card.printSummary();
			while(card.getBalance() > 200.0) {
				card.makePayment(200);
				System.out.println("New balance = " + card.getBalance());
			}
		}
		System.out.println(wallet[0].toString());
	
	}
}
