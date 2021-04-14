package javaInterviewProgrammes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySum {

	public static void arraysum() {
		int i;
		int sum = 0;
		int n[] = { 1, 2, 3, 4, 5, 6 };
		for (i = 0; i < n.length; i++) {
			sum = sum + n[i];

		}
		System.out.println(sum);

	}

	public static void dupicatefind() {
		int numbers[] = { 1, 2, 2, 3, 4, 5, 5, 6 };
		Set<Integer> store = new HashSet<Integer>();
		for (Integer num : numbers) {
			if (store.add(num) == false) {
				System.out.println(num);
			}
		}

	}

	public static void wordcount() {
		String s= "Ashok Ashok is goodboy";
		Map<String,Integer> hm= new HashMap<String,Integer>();
		String t[]=s.split(" ");
		int len = t.length;
		for(int i=0;i<len;i++) {
			if(hm.containsKey(t[i]))
			 {
				int count = hm.get(t[i]);
				//System.out.println(count);
				hm.put(t[i], count+1);
			}else {
				hm.put(t[i], 1);
			}
		}System.out.println(hm);
		
	}
	public static void wordcount2() {
		String s ="Ashokisgreat";
		System.out.println(s.length());
		String a[]=s.split("");
		
		Map<String,Integer> hm = new HashMap<String,Integer>();
		for(int i=0;i<s.length();i++) {
			if(hm.containsKey(a[i])) {
				int count = hm.get(a[i]);
				hm.put(s, count+1);
			}else {
				hm.put(s, 1);
			}
		}System.out.println(hm);
	}

	public static void main(String[] args) {
		wordcount2();

	}

}
