package squaresort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SquaresortTest {
	int[] nums1 = {2,5,9,1,0};
	int[] nums2 = {4,0,0,4,7,11,-5,107};
	int[] nums3 = {};
	int[] nums1prime = {0,1,2,5,9};
	int[] nums2prime = {-5,0,0,4,4,7,11,107};
	int[] nums3prime = {};
	Person p1 = new Person("Lei", "Li", 20);
	Person p2 = new Person("Meimei", "Han", 25);
	Person p3 = new Person("Han", "Han", 25);
	Person p4 = new Person("Jim", "Green", 10);
	Person p5 = new Person("Anton","Zaslavski", 23);
	Person p6 = new Person("Han", "Han", 2);
    Person[] people = {p1,p2,p3,p4,p5,p6};
    Person[][] people2D = {{p1, p2,p3},{p4, p5, p6}};
    Person[][] secondPeople2D = {{p1, p2,p3},{p4, p5, p6}};
    Person[][] thirdPeople2D = {{p1, p2,p3},{p4, p5, p6}};
    
    EmployeeIdComparator eCompare = new EmployeeIdComparator();
    NameComparator nCompare = new NameComparator();
    PayGradeComparator pCompare = new PayGradeComparator();
    
	@Test
	public void testLinearSortIntArray() {
		Squaresort.linearSort(nums1);
		Squaresort.linearSort(nums2);
		Squaresort.linearSort(nums3);
		assertArrayEquals(nums1,nums1prime);
		assertArrayEquals(nums2,nums2prime);
		assertArrayEquals(nums3,nums3prime);
	}

	@Test
	public void testLinearSortPersonArrayComparatorOfPerson() {
		Squaresort.linearSort(people, eCompare);
		Person[] people1 = {p1, p2, p3, p4, p5, p6};
		assertArrayEquals(people1, people);
		Squaresort.linearSort(people, nCompare);
		Person[] people2 = {p4, p3, p6, p2, p1, p5};
		Person[] people2prime = {p4, p6, p3, p2, p1, p5};
		assertTrue(Arrays.toString(people2).compareTo(Arrays.toString(people)) == 0 
				|| Arrays.toString(people2prime).compareTo(Arrays.toString(people)) == 0);
		Person[] people3 = {};
		Person[] people4 = {};
		assertArrayEquals(people3, people4);
		Squaresort.linearSort(people, pCompare);
		Person[] people5 = {p6, p4, p1, p5, p2, p3};
		Person[] people6 = {p6, p4, p1, p5, p3, p2};
		assertTrue(Arrays.toString(people6).compareTo(Arrays.toString(people)) == 0 
				|| Arrays.toString(people5).compareTo(Arrays.toString(people)) == 0);
	}

	@Test
	public void testSquaresort() {
		Squaresort.squaresort(people2D, eCompare);
		Person[][] people2D1 = {{p1, p2,p3},{p4, p5, p6}};
		assertArrayEquals(people2D1, people2D);
		Squaresort.squaresort(secondPeople2D, nCompare);
		Person[][] people2D2 = {{p4, p6, p1},{ p3, p2, p5}};
		assertArrayEquals(people2D2, secondPeople2D);
		Squaresort.squaresort(thirdPeople2D, pCompare);
		Person[][] people2D3 = {{p6, p4, p5}, {p1, p2, p3}};
		assertArrayEquals(people2D3, thirdPeople2D);
		
	}

}
