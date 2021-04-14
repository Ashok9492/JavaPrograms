package javaInterviewProgrammes;

public class StringReverse {

	public static void main(String[] args) {
		String s= "Selenium";
		int len = s.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}System.out.println(rev);

		StringBuffer sb = new StringBuffer("Ashok");
		System.out.println(sb.reverse());
		
		
		
		
	}
	
	

}
