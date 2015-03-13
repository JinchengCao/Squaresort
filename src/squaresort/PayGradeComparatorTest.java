package squaresort;

import static org.junit.Assert.*;

import org.junit.Test;

public class PayGradeComparatorTest {
	Person p1 = new Person("Lei", "Li", 20);
	Person p2 = new Person("Meimei", "Han", 25);
	Person p3 = new Person("Jim", "Green", 10);
	Person p4 = new Person("Anton","Zaslavski", 23);

	@Test
	public void testCompare() {
		PayGradeComparator pCompare = new PayGradeComparator();
		assertTrue(pCompare.compare(p1, p2) < 0);
		assertTrue(pCompare.compare(p2, p3) > 0);
		assertTrue(pCompare.compare(p3, p4) < 0);
		assertTrue(pCompare.compare(p4, p1) > 0);
		
	}

}
