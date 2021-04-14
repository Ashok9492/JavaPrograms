package javaInterviewProgrammes;

public class StringManipulation {

	public static void main(String[] args) {
		String s = "Seleniumi";
		System.out.println(s.length());
		System.out.println(s.indexOf("i"));
		System.out.println(s.indexOf("i", s.indexOf("i")+1));
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='m' ) {
				System.out.println(s.charAt(i));
			}
		}
	
		

	

}}
