import org.junit.Assert;
import org.junit.Test;

public class HospitalTest {
	
	@Test
	public void PersonHospitalTest() {
		
		// create hospitals of each type
		StackHospital<Person> h1 = new StackHospital<Person>();
		QueueHospital<Person> h2 = new QueueHospital<Person>();
		PriorityQueueHospital<Person> h3 = new PriorityQueueHospital<Person>();
		
		// create people to add to hospitals
		Person p1 = new HealthyPerson("John", 15, "Check-up");
		Person p2 = new SickPerson("Jack", 28, 4);
		Person p3 = new HealthyPerson("Jane", 46, "Screening");
		
		// add patients to stack hospital
		h1.addPatient(p1);
		h1.addPatient(p2);
		h1.addPatient(p3);
		
		// add patients to queue hospital
		h2.addPatient(p1);
		h2.addPatient(p2);
		h2.addPatient(p3);
		
		// add patients to priority queue hospital
		h3.addPatient(p1);
		h3.addPatient(p2);
		h3.addPatient(p3);
		
		// test to see if hospitals are correct size
		Assert.assertEquals("Incorrect size", 3, h1.numPatients());
		Assert.assertEquals("Incorrect size", 3, h2.numPatients());
		Assert.assertEquals("Incorrect size", 3, h3.numPatients());
		
		// test to see if the correct patient is next
		Assert.assertEquals("Incorrect patient next", "Jane", h1.nextPatient().getName());
		Assert.assertEquals("Incorrect patient next", "John", h2.nextPatient().getName());
		Assert.assertEquals("Incorrect patient next", "Jane", h3.nextPatient().getName());
		
		// test to see if the correct patient is treated next
		Assert.assertEquals("Incorrect patient treated", "Jane", h1.treatNextPatient().getName());
		Assert.assertEquals("Incorrect patient treated", "John", h2.treatNextPatient().getName());
		Assert.assertEquals("Incorrect patient treated", "Jane", h3.treatNextPatient().getName());
		
		// test to see if correct hospital type is returned 
		Assert.assertEquals("Incorrect hospital type", "StackHospital", h1.hospitalType());
		Assert.assertEquals("Incorrect hospital type", "QueueHospital", h2.hospitalType());
		Assert.assertEquals("Incorrect hospital type", "PriorityQueueHospital", h3.hospitalType());
		
		// test to see if toString is correct
		Assert.assertEquals("Incorrect toString", "[John, a 15-year old. In for Check-up, Jack, a 28-year old. Severity level 4]", h1.allPatientInfo());
		Assert.assertEquals("Incorrect toString", "[Jack, a 28-year old. Severity level 4, Jane, a 46-year old. In for Screening]", h2.allPatientInfo());
		Assert.assertEquals("Incorrect toString", "[John, a 15-year old. In for Check-up, Jack, a 28-year old. Severity level 4]", h3.allPatientInfo());
		
		// test to see if hospital toString is correct
		Assert.assertEquals("Incorrect toString", "A StackHospital-type hospital with 2 patients.", h1.toString());
		Assert.assertEquals("Incorrect toString", "A QueueHospital-type hospital with 2 patients.", h2.toString());
		Assert.assertEquals("Incorrect toString", "A PriorityQueueHospital-type hospital with 2 patients.", h3.toString());
		
	}
	
	@Test
	public void AnimalHospitalTest() {
		// create hospitals of each type
				StackHospital<Animal> h1 = new StackHospital<Animal>();
				QueueHospital<Animal> h2 = new QueueHospital<Animal>();
				PriorityQueueHospital<Animal> h3 = new PriorityQueueHospital<Animal>();
				
				// create animals to add to hospitals
				Animal a1 = new Animal("Golden Retriever", 6);
				Animal a2 = new Animal("Siamese Cat", 4);
				Animal a3 = new Animal("Poodle", 6);
				
				// add patients to stack hospital
				h1.addPatient(a1);
				h1.addPatient(a2);
				h1.addPatient(a3);
				
				// add patients to queue hospital
				h2.addPatient(a1);
				h2.addPatient(a2);
				h2.addPatient(a3);
				
				// add patients to priority queue hospital
				h3.addPatient(a1);
				h3.addPatient(a2);
				h3.addPatient(a3);
				
				// test to see if hospitals are correct size
				Assert.assertEquals("Incorrect size", 3, h1.numPatients());
				Assert.assertEquals("Incorrect size", 3, h2.numPatients());
				Assert.assertEquals("Incorrect size", 3, h3.numPatients());
				
				// test to see if the correct patient is next
				Assert.assertEquals("Incorrect patient next", "Poodle", h1.nextPatient().getBreed());
				Assert.assertEquals("Incorrect patient next", "Golden Retriever", h2.nextPatient().getBreed());
				Assert.assertEquals("Incorrect patient next", "Golden Retriever", h3.nextPatient().getBreed());
				
				// test to see if the correct patient is treated next
				Assert.assertEquals("Incorrect patient treated", "Poodle", h1.treatNextPatient().getBreed());
				Assert.assertEquals("Incorrect patient treated", "Golden Retriever", h2.treatNextPatient().getBreed());
				Assert.assertEquals("Incorrect patient treated", "Golden Retriever", h3.treatNextPatient().getBreed());
				
				// test to see if correct hospital type is returned 
				Assert.assertEquals("Incorrect hospital type", "StackHospital", h1.hospitalType());
				Assert.assertEquals("Incorrect hospital type", "QueueHospital", h2.hospitalType());
				Assert.assertEquals("Incorrct hospital type", "PriorityQueueHospital", h3.hospitalType());
				
				// test to see if toString is correct
				Assert.assertEquals("Incorrect toString", "[A 6-year old Golden Retriever., A 4-year old Siamese Cat.]", h1.allPatientInfo());
				Assert.assertEquals("Incorrect toString", "[A 4-year old Siamese Cat., A 6-year old Poodle.]", h2.allPatientInfo());
				Assert.assertEquals("Incorrect toString", "[A 6-year old Poodle., A 4-year old Siamese Cat.]", h3.allPatientInfo());
	}
	

}
