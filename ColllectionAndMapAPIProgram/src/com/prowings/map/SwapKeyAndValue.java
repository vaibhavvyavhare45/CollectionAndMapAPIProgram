package com.prowings.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SwapKeyAndValue {
	public static void main(String[] args) {
		HashMap<String, Integer> h1=new HashMap<>();
		HashMap<Integer, String> h2=new HashMap<>();
		h1.put("vaibhav", 1);
		h1.put("marish", 2);
		h1.put("pranav", 3);
		h1.put("vishwajit", 4);
		System.out.println(h1);
		Set<Entry<String,Integer>> entry=h1.entrySet();
		for (Entry<String, Integer> entry2 : entry) {
			//System.out.println(entry2.getValue()+"="+entry2.getKey());
			h2.put(entry2.getValue(), entry2.getKey());
			
		}
		System.out.println(h2);
		
		
	}

}
