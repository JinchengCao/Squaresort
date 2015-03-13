package squaresort;

import java.util.Arrays;
import java.util.Comparator;

public class Squaresort {
	
	public static void linearSort(int[] nums){
		int N = nums.length;
		int i = 0;
		while(i < N){
			for(int m = 0; m < i - 1; m++) assert nums[m] <= nums[m+1];
			for(int j = i + 1; j < N; j++){
				if(nums[j] < nums[i]){
					int t = nums[i];
					nums[i] = nums[j];
					nums[j] = t;
				}
			}
			i +=1;
		}
		assert i >= N;
		for(int m = 0; m < N - 1; m++) assert nums[m] <= nums[m+1];		
	}
	

	
	public static void linearSort(Person[] people, Comparator<Person> comp){
		int N = people.length;
		int i = 0;
		while(i < N){
			for(int m = 0; m < i-1; m++) assert comp.compare(people[m], people[m + 1]) <= 0;
			for(int j = i + 1; j < N; j++){
				if(comp.compare(people[j], people[i]) < 0){
					Person p = people[i];
					people[i] = people[j];
					people[j] = p;
				}
			}
			i +=1;
		}
		assert i >= N;
		for(int m = 0; m < N - 1; m++) assert comp.compare(people[m], people[m + 1]) <= 0;
		
	}
	public static void squaresort(Person[][] people, Comparator<Person> comp){
		for(int t = 0; t < people.length; t++){
			int N = people[t].length;
			int i = 0;
		while(i < N){
			for(int m = 0; m < i - 1; m++) assert comp.compare(people[t][m],people[t][m+1]) <= 0;
			for(int j = i + 1; j < N; j++){
				if(comp.compare(people[t][j], people[t][i]) < 0){
					Person a = people[t][i];
					people[t][i] = people[t][j];
					people[t][j] = a;
				}
			}
			i +=1;
		}
		assert i >= N;
		for(int m = 0; m < N - 1; m++) assert comp.compare(people[t][m], people[t][m+1]) <= 0;	
		}
		
		for(int t = 0; t < people[0].length; t++){
			int N = people.length;
			int k = 0;
		while(k < N){
			for(int m = 0; m < k - 1; m++) assert comp.compare(people[m][t], people[m+1][t]) <= 0;
			for(int l = k + 1; l < N; l++){
				if(comp.compare(people[l][t], people[k][t]) < 0){
					Person a = people[k][t];
					people[k][t] = people[l][t];
					people[l][t] = a;
				}
			}
			k +=1;
		}
		assert k >= N;
		for(int m = 0; m < N - 1; m++) assert comp.compare(people[m][t], people[m+1][t]) <= 0;	
		}
		
		for(int i = 0; i < people.length - 1; i++){
				for(int k = 0; k < people[0].length - 1; k++){
					   if(people.length >= 2 && people[0].length >= 2)
						assert (comp.compare(people[i][k], people[i+1][k]) <= 0)&& (comp.compare(people[i][k], people[i][k+1]) <= 0);
				}
		}
		
		
	}
	public static void main(String[] args){
		
		Person[][] people = {{new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person()},
				{new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person()},
				{new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person()},
				{new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person()},
				{new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person()},
				{new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person(),new Person()}};
		NameComparator ncomp = new NameComparator();
		PayGradeComparator pcomp = new PayGradeComparator();
		EmployeeIdComparator ecomp = new EmployeeIdComparator();
		
     	System.gc();
		long startTime = System.nanoTime();
		//squaresort(people, ncomp);
		squaresort(people, pcomp);
		//squaresort(people, ecomp);
		long elapsedTime = System.nanoTime() - startTime;
		System.out.println("squaresort elapsedTime: " + elapsedTime);
		System.out.println(Arrays.deepToString(people));
	
	}
}
