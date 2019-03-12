import java.util.Stack;

/**
 * Child class of Hospital.java that uses a stack to keep track of patients. 
 * A stack organizes data by LIFO, last in first out.
 * @author skylersprecker
 * @version 2019-03-11
 * @param <PatientType>
 */
public class StackHospital<PatientType> extends Hospital<PatientType> {
	
	// Declares a stack to be used in the object
	private Stack<PatientType> patients;
	
	/**
	 * Constructs a StackHospital object and initializes a stack
	 */
	public StackHospital() {
		patients = new Stack<PatientType>();
	}
	
	/**
	 * Implements addPatient method defined in the Hospital class
	 * 
	 * @param patient	The patient to be added
	 */
	public void addPatient(PatientType patient) {
		patients.push(patient);
	}
	
	/**
	 * Implements nextPatient method defined in Hospital class
	 * 
	 * @return The patient to be treated next
	 */
	public PatientType nextPatient() {
		return patients.get(0);
	}
	
	/**
	 * Implements treatNextPatient method defined in Hospital class
	 * 
	 * @return The patient receiving treatment
	 */
	public PatientType treatNextPatient() {
		return patients.pop();
	}
	
	/**
	 * Implements numPatients method defined in Hospital class
	 * 
	 * @return The number of patients yet to be treated
	 */
	public int numPatients() {
		return patients.size();
	}
	
	/**
	 * Implements hospitalType method defined in Hospital class
	 * 
	 * @return The name of the class/type of hospital
	 */
	public String hospitalType() {
		return "StackHospital";
	}
	
	/**
	 * Implements allPatientInfo method defined in Hospital class
	 * 
	 * @return A string with all of the patients' info
	 */
	public String allPatientInfo() {
		return patients.toString();
	}

}
