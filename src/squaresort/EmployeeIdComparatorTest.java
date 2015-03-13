package squaresort;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeIdComparatorTest {
	Person p1 = new Person("Lei", "Li", 20);
	Person p2 = new Person("Meimei", "Han", 25);
	Person p3 = new Person("Jim", "Green", 10);
	Person p4 = new Person("Anton","Zaslavski", 23);

	@Test
	public void testCompare() {
		EmployeeIdComparator eCompare = new EmployeeIdComparator();
		assertTrue(eCompare.compare(p1, p2) < 0);
		assertTrue(eCompare.compare(p2, p3) < 0);
		assertTrue(eCompare.compare(p3, p4) < 0);
		assertTrue(eCompare.compare(p4, p1) > 0);
		
	}

}
