package javaInterviewProgrammes;

public class OccurenceofChar {

	public static void main(String[] args) {
		String s = "Ashok is a good boy";
		int count = 0;
		for (char a : s.toCharArray()) {

			if (a == ' ') {
				count++;

			}

		}System.out.println(count);

	}
}
