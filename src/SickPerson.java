
/**
 * Child class of Person that stores their name and age as well as the severity of their condition
 * @author skylersprecker
 * @version 2019-03-12
 */
public class SickPerson extends Person{
	
	// declares a private int to store the severity of the patient
	private int severity;
	
	/**
	 * Constructor for the SickPerson class
	 * Calls the super constructor for name and age but stores severity in a private variable
	 * 
	 * @param name
	 * @param age
	 * @param severity
	 */
	public SickPerson(String name, int age, int severity){
		super(name, age);
		this.severity = severity;
	}
	
	/**
	 * Method to compare the severity of two different patients condition's
	 * 
	 * @param p
	 */
	protected int compareToImpl(Person p) {
		if(!(p instanceof SickPerson)) {
			return 0;
		}
		if(this.severity < ((SickPerson)p).getSeverity()) {
			return 1;
		}
		else if(this.severity > ((SickPerson)p).getSeverity()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	//protected method to get the severity of the patient's condition
	protected int getSeverity() {
		return severity;
	}
}
