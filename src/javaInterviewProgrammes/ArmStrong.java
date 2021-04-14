package javaInterviewProgrammes;

import java.util.HashSet;
import java.util.Set;

public class ArmStrong {
	
	/*Armstrong number means by adding cube of each digit will be equal to given number
	153=1*1*1+5*5*5+3*3*3
	1+125+27=153
	
	*/
	public static void secondLargest() {
		int n[]= {1,4,2,8,9,0};
		int largest = n[0];
		for(int i=1;i<n.length;i++) {
			if(largest<n[i]) {
				largest=n[i];
			}
		}System.out.println("Largest number in the array is: "+largest);
	}
	
	
	public static void duplicatename() {
		String names[]= {"Abd","naveen","mukesh","Abd","kohli","sachin","sachin","lara"};
		Set<String> store = new HashSet<String>();
		for(String name: names) {
			if(store.add(name)==false) {
				System.out.println(name);
			}
			
			
			
			
		}
	}
	
	
	
	
	
	
	public static void palindrome(int num) {
		int r;
		int sum=0;
		int t=num;
		
		
		
		while(num>0) {
			r=num%10;
			num=num/10;
			sum = (sum*10)+r;
			
		}if(t==sum) {
			System.out.println("given number is palindrome");
		}else {
			System.out.println("given number is not palindrome");
		}
	}
	
	
	
	
	public static void armstrong(int num) {
		
		int cube=0;
		int remainder;
		int t=num;
		while(num>0) {
			remainder = num%10;
			num=num/10;
			cube=cube+(remainder*remainder*remainder);
			
		}if(t==cube) {
			System.out.println("given number is armstrong");
		}else {
			System.out.println("given number is not armstrong number");
		}
			
		
	}
	

	public static void main(String[] args) {
		//armstrong(153);
		//palindrome(123214);
		//secondLargest();
		duplicatename();
		

	}

}
