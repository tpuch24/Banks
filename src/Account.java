import java.util.List;

/**
 * 
 * @author Thierry
 *
 */
public class Account {

	protected int id;
	protected double balance;
	protected Customer customer;
	
	protected RefAccountNumber refAccountNumber ;
	
	
	public Account(double balance, Customer customer) {
		this.account(balance, customer);
	}
	public Account(Customer customer){
		this.account(0.0, customer);	
	}
	
	private void account(double balance, Customer customer) {
		this.refAccountNumber = RefAccountNumber.getInstance();
		this.id = refAccountNumber.getNewId();
		this.balance = balance;
		this.customer = customer;
		
		customer.addAccount(this);
	}
	
	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	protected Customer getCustomer() {
		return customer;
	}

	protected void setCustomer(Customer customer) {
		this.customer = customer;
	}

	//--------------------------
	/**
	 * setBalance for creditl or debit operations
	 * @param amount
	 * @param addAmount - true => credit / false => debit
	 * @return
	 */
	public double setBalance(double amount, boolean addAmount){
		if (amount <0) {
    		throw new IllegalArgumentException("Invalid amount : " +
					amount +" (must be positive)");
    	}
		this.setBalance(this.getBalance() + ((addAmount)? amount : amount*1.0));
		
		return this.getBalance();
	}
	
    public double debitAccount(double amount){
    	return this.setBalance(amount, false);
    }
    public double creditAccount(double amount){
    	return this.setBalance(amount, false);
    }
    
    public String toString(){
    	return "Number :" +this.getId()+" - Balance : "+this.getBalance()
    	+" - Owner :"+ this.getCustomer().toString();
    	
    }
}
