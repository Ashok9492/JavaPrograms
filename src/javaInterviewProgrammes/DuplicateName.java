package javaInterviewProgrammes;

import java.util.HashSet;
import java.util.Set;

public class DuplicateName {

	public static void main(String[] args) {
		String names[] = {"Ashok","Mukesh","Naveen","Ashok"};
		int l = names.length;
		/*
		 * s[1]="Ashok"; s[2]="Naveen"; s[3]="Mukesh"; System.out.println(s[2]); int l =
		 * s.length; System.out.println(l); for(int i=0;i<=l;i++) {
		 * System.out.println(s[i]); }
		 * 
		 * }
		 */
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(store.add(name)==false) {
				System.out.println(name);
			}
			
		}
		
		
		
	}
}
