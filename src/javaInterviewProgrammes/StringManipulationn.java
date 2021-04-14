package javaInterviewProgrammes;

import java.util.Scanner;

public class StringManipulationn {

	public static void main(String[] args) {
		//String s = "I maDe Developers cry        " ;
		/*System.out.println(s.toUpperCase());
		System.out.println(s.equalsIgnoreCase(s));
		System.out.println("Character at 10 place: "+s.charAt(10));
		System.out.println(s.contains("Z"));
		System.out.println(s.trim());*/
		int count=0;
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine(); 
		for(char a : s.toCharArray()) {
			if(a=='s') {
				count++;
			}
		}System.out.println(count);
		
		
		
		
		
	}

}
