package javaInterviewProgrammes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {
	/*
	 * hasmap:contains only unique keys conatains duplicate values
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */


	public static void main(String[] args) {
		Map<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("Ashok", 2);
		hm.put("Ab dv", 3);
		hm.put("gayle", 4);
		hm.put("Rock", 8);
		hm.put("gayle", 77);
		hm.put("ram", 4);
		hm.put("gayle", 4);
		hm.put("gayle", 4);
		for(Entry<String, Integer> map:hm.entrySet()) {
			System.out.println(map.getKey()+"="+map.getValue());
					
			
		}
		Map<String,Integer> sm = Collections.synchronizedMap(hm);
		System.out.println(sm);
		List<String> keys = new ArrayList<String>(hm.keySet());
		System.out.println(keys);
		List<Integer> Values = new ArrayList<Integer>(hm.values());
		System.out.println(Values);
		 
		
		
		

	}
}
