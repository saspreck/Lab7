
/**
 * Child class of Person for a healthy person that stores their name and age
 * 
 * @author skylersprecker
 * @version 2019-03-12
 */
public class HealthyPerson extends Person{
	
	//private variable to store the reason for visiting
	private String reason;
	
	/**
	 * Constructor for HealthyPerson class
	 * Calls super constructor for name and age but stores reason in private variable
	 * @param name
	 * @param age
	 * @param reason
	 */
	public HealthyPerson(String name, int age, String reason) {
		 super(name, age);
		 this.reason = reason;
	 }
	
	/**
	 * Method to compare the names of two different patients
	 * 
	 * @param p		The person being compared to
	 */
	protected int compareToImpl(Person p) {
		return this.getName().compareToIgnoreCase(p.getName());
	}
	
	/**
	 * Method to print out patient's information
	 */
	@Override
	public String toString() {
		return super.toString();
	}

}
