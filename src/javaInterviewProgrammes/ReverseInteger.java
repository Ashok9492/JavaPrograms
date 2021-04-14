package javaInterviewProgrammes;

public class ReverseInteger {

	public static void armstrong() {
		System.out.println("**************");
		int cube=0;
		int r;
		int n=153;
		int t = n;
		while(n>0) {
			r=n%10;
			n=n/10;
			cube=(r*r*r)+cube;//sum=(sum*10)+r
		}if(t==cube) {
			System.out.println("armstrong num");
		}else {
			System.out.println("is not armstron num");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		armstrong();
		int n = 12345;
		int rev =0;
		while(n!=0) {
			rev = rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);

	}

}
