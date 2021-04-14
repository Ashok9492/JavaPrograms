package javaInterviewProgrammes;

public class WordCount2 {
	
	public static  void word() {
		
		
		String b = "Naveen sdhi s";
		int count =1;
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)==' ' && b.charAt(i+1)!=' ') {
				count++;
			}
		}System.out.println("Word count is: "+count);
		
		
	}
	


	public static void main(String[] args) {
		word();
		String a = "hello a d dear";
		int count = 1;
		for(int i=0;i<a.length()-1;i++) {
			if(a.charAt(i)==' '&& a.charAt(i+1)!=' ') {
				count++;
			}
		}System.out.println("Word count is :"+count);

	}

}
