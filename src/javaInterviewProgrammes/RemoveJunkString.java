package javaInterviewProgrammes;

public class RemoveJunkString {

	public static void main(String[] args) {
		String s ="ASHOK123";
		
		//regular expression: [^a-zA-Z0-9]
		s= s.replaceAll("[^A-Z]","");
		System.out.println(s);
		/*s.replaceAll("[^a-zA-Z0-9])
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
