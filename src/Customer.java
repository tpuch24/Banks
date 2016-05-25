
public class Customer {
	
	protected String lastName;
	protected String firstName;

	public Customer() {
		super();
	}

	public Customer(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}

	protected String getLastName() {
		return lastName;
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	protected String getCompletName() {
		return lastName+" "+firstName;
	}

}
