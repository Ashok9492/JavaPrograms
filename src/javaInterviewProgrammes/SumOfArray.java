package javaInterviewProgrammes;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		//int i[]=new int[4];
		int a[]= {10,20,30};
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}System.out.println(sum);
		SumOfArray s = new SumOfArray();
		s.sum();
		s.scan();
	}
	void sum() {
		System.out.println("********************");
		int sum=0;
		for(int j=1;j<=10;j++) {
			sum =sum+j;
		}System.out.println("sum of first natural numbers is: "+sum);
	} 
	void scan() {
		Scanner scan = new Scanner(System.in);
		int length=scan.nextInt();
		int n[]=new int[length];
		for(int i=0;i<length;i++) {
			n[i]=scan.nextInt();
		}System.out.println(n);
	}

}
