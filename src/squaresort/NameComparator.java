package squaresort;

import java.util.Comparator;

public class NameComparator implements Comparator<Person>{


	@Override
	public int compare(Person p1, Person p2) {
        if(p1.surname == p2.surname) return p1.givenName.compareTo(p2.givenName);
        return p1.surname.compareTo(p2.surname);
	}

}


