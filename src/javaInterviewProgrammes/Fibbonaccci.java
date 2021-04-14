package javaInterviewProgrammes;

public class Fibbonaccci {

	public static void fibonacci() {
		int n = 10;
		int sum;
		int t1 = 0;
		int t2 = 1;
		for (int i = 0; i <= 10; i++) {
			System.out.print(t1 + " ");
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

	}
	
	public static void piramid() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}System.out.println();
		}
	
	
	}
	public static void piramid1() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("");
			}for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
			
		}
		
		
		for(int i=5;i>0;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
			
		}
	}
	
	
	

	public static void main(String[] args) {
		//piramid();
		//fibonacci();
		piramid1();
	}

}
