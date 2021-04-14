package javaInterviewProgrammes;

public class SumofDegits {
	public static void sumof2digits() {
		/*int n=96;
		int r = n%10+n/10;
		System.out.println(r);
		*/
		int n=12;
		int r = n%10+n/10;
		System.out.println("Sum of digits are: " +r);
		
		
		
	}
	public static void sumofdigits(int num) {
		
		int r;
		int sum=0;
		while(num>0) {
			r=num%10;
			num=num/10;
			sum = sum+r;//sum=(sum*10)+r-->for palindrome; and cube=cube+r*r*r-->for armstrong
		}System.out.println(sum);
		
	}
	
	
	
	public static void main(String[] args) {
		sumof2digits();
		sumofdigits(345566666);
		
	}
	
	
	
	
	
	
	

}
