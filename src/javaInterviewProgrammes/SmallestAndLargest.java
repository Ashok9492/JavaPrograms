package javaInterviewProgrammes;

public class SmallestAndLargest {

	public static void main(String[] args) {
		int n[] = { 1, 5, 3, 6, 7, 9, -1 };
		int largest = n[0];
		int smallest = n[0];
		for(int i=1;i<n.length;i++) {
			if(n[i]>largest) {
				largest=n[i];
			}else if(n[i]<smallest) {
				smallest=n[i];
			}
		}
		System.out.println("largest num is:"+largest);
		
		System.out.println("smallest num is: "+smallest);
		
		
		
		
		
		
		
	}
}
