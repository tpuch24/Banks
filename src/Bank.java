import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Thierry
 *
 */
public class Bank {

	protected String name;
	protected int upperAccountNumber;
	protected List<Account> accounts;
	protected List<Customer> customers;
	
	
	public Bank(String bankName) {
		super();
		
		if (bankName.length() <= 2) {
			throw new IllegalArgumentException("Invalid bank name : " +
					bankName+" (At least 3 digits");
			}
		this.name = bankName;
		this.upperAccountNumber = 0;
		this.accounts = new ArrayList<Account>();
		this.customers = new ArrayList<Customer>();
	}


	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected int getUpperAccountNumber() {
		return upperAccountNumber;
	}


	protected void setUpperAccountNumber(int upperAccountNumber) {
		this.upperAccountNumber = upperAccountNumber;
	}


	protected List<Account> getAccounts() {
		return accounts;
	}


	protected void setAccounts(List<Account> bankAccounts) {
		this.accounts = bankAccounts;
	}


	protected List<Customer> getCustomers() {
		return customers;
	}


	protected void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	//-----------------------------------
	public Customer getCustomer(String firstName, String lasttName){
		
	}
	


}
