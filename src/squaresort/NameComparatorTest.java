package squaresort;

import static org.junit.Assert.*;

import org.junit.Test;

public class NameComparatorTest {
	Person p1 = new Person("Lei", "Li", 20);
	Person p2 = new Person("Meimei", "Han", 25);
	Person p3 = new Person("Han", "Han", 25);
	Person p4 = new Person("Jim", "Green", 10);
	Person p5 = new Person("Anton","Zaslavski", 23);

	@Test
	public void testCompare() {
		NameComparator nCompare = new NameComparator();
		assertTrue(nCompare.compare(p1, p2) > 0);
		assertTrue(nCompare.compare(p2, p3) > 0);
		assertTrue(nCompare.compare(p3, p4) > 0);
		assertTrue(nCompare.compare(p4, p5) < 0);
		assertTrue(nCompare.compare(p5, p1) > 0);
	}

}
