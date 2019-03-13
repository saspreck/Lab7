import org.junit.Assert;
import org.junit.Test;

public class PatientsTest {
	
	@Test
	public void HealthyPersonTest(){
		HealthyPerson hp1 = new HealthyPerson("Skyler", 18, "Check-up");
		HealthyPerson hp2 = new HealthyPerson("Gracyn", 18, "Check-up");
		HealthyPerson hp3 = new HealthyPerson("Skyler", 18, "Wrist");
		
		Assert.assertEquals("Incorrect toString", "Skyler, a 18-year old. In for Check-up", hp1.toString());
		Assert.assertEquals("Incorrect ordering", 1, hp1.compareToImpl(hp2));
		Assert.assertEquals("Incorrect ordering", 0, hp1.compareToImpl(hp3));
		Assert.assertEquals("Incorrect ordering", -1, hp2.compareToImpl(hp1));
		
		Assert.assertEquals("Incorrect age", 18, hp3.getAge());
		Assert.assertEquals("Incorrect name", "Gracyn", hp2.getName());
	}
	
	@Test
	public void SickPersonTest() {
		SickPerson sp1 = new SickPerson("John", 35, 2);
		SickPerson sp2 = new SickPerson("Jill", 29, 4);
		SickPerson sp3 = new SickPerson("John", 23, 5);
		
		Assert.assertEquals("Incorrect toString", "John, a 35-year old. Severity level 2", sp1.toString());
		Assert.assertEquals("Incorrect ordering", 1, sp1.compareToImpl(sp3));
		Assert.assertEquals("Incorrect ordering", -1, sp3.compareToImpl(sp2));
		Assert.assertEquals("Incorrect ordering", 0, sp1.compareToImpl(sp1));
		
		Assert.assertEquals("Incorrect age", 29, sp2.getAge());
		Assert.assertEquals("Incorrect age", "John", sp3.getName());
	}
	
	@Test
	public void AnimalTest() {
		Animal a1 = new Animal("Golden Retriever", 6);
		Animal a2 = new Animal("Siamese Cat", 4);
		Animal a3 = new Animal("Poodle", 6);
		
		Assert.assertEquals("Incorrect breed", "Golden Retriever", a1.getBreed());
		Assert.assertEquals("Incorrect age", 4, a2.getAge());
		Assert.assertEquals("Incorrect toString", "A 6-year old Golden Retriever.", a1.toString());
		
		Assert.assertEquals("Incorrect ordering", 2, a2.compareTo(a1));
		Assert.assertEquals("Incorrect ordering", -2, a1.compareTo(a2));
		Assert.assertEquals("Incorrect ordering", 0, a1.compareTo(a3));
		
	}
}
