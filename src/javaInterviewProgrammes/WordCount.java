package javaInterviewProgrammes;

public class WordCount {

	public static void main(String[] args) {
		String a = "i am ashok";
		int count =1;
		for(int i=1;i<a.length();i++) {
			if(a.charAt(i)==' ' && a.charAt(i+1)!=' ') {
				count++;
			}
		}System.out.println("word count is: "+count);

	}
}
