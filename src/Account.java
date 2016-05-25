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
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int id, double solde, Customer customer) {
		super();
		this.id = id;
		this.balance = solde;
		this.customer = customer;
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
	
	public void account(Customer customer){
		
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
