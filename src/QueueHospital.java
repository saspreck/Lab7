import java.util.*;


/**
 * Child class of Hospital that uses a queue to keep track of patients
 * A queue organizes data by FIFO, first in first out.
 * @author skylersprecker
 * @version 2019-03-11
 * @param <PatientType>
 */
public class QueueHospital<PatientType> extends Hospital<PatientType> {
	
	// Declares a queue to be used in the object
		private Queue<PatientType> patients;
		
		/**
		 * Constructs a QueueHospital object and initializes a queue
		 */
		public QueueHospital() {
			patients = new LinkedList<PatientType>();
		}
		
		/**
		 * Implements addPatient method defined in the Hospital class
		 * 
		 * @param patient	The patient to be added
		 */
		public void addPatient(PatientType patient) {
			patients.add(patient);
		}
		
		/**
		 * Implements nextPatient method defined in Hospital class
		 * 
		 * @return The patient to be treated next
		 */
		public PatientType nextPatient() {
			return patients.peek();
		}
		
		/**
		 * Implements treatNextPatient method defined in Hospital class
		 * 
		 * @return The patient receiving treatment
		 */
		public PatientType treatNextPatient() {
			return patients.poll();
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
			return "QueueHospital";
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
