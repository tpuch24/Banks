import java.util.List;

/**
 * 
 * @author Thierry
 *
 */
public class Account {

	protected int id;
	protected double solde;
	protected Customer customer;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int id, double solde, Customer customer) {
		super();
		this.id = id;
		this.solde = solde;
		this.customer = customer;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected double getSolde() {
		return solde;
	}

	protected void setSolde(double solde) {
		this.solde = solde;
	}

	protected Customer getCustomer() {
		return customer;
	}

	protected void setCustomer(Customer customer) {
		this.customer = customer;
	}

	//--------------------------
	
}
