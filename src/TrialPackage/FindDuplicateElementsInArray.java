package TrialPackage;

import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		//we can found this by 3 methods
		/*
		 * 1. Brute force 2. HashSet 3. HashMap<K,V> 4.Streams
		 */
		
		String infra[]= {"Amazon","Azure","GCP","AliBaba","Amazon","SauceLabs","GCP","Azure","Amazon"};
		
		System.out.println("********Brute Force***************");
		for(int i=0;i<infra.length;i++) {
			for(int j=i+1;j<infra.length;j++) {
				if(infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}
			}
		}
		
		System.out.println("********HashSet***************");
		/*
		 * Set is an interface and HashSet is a class one feature of hashset is it-->Extar info
		 * cannot store duplicate values The logic is if the element get added in set it
		 * will return true if it returns false means there is already a value present
		 * and we cannot add the elements into set
		 */
		
		HashSet<String> data=new HashSet<>();
		for(String s:infra) {
			if(data.add(s)== false) {
				System.out.println(s);
			}
		}
		
	}

}
