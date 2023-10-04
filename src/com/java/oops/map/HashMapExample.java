package com.java.oops.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

//		k:v
//		rolNo:Name

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(2,"John");
		hashMap.put(4,"Jane");
		hashMap.put(5,"Tim");
		hashMap.put(2,"Taylor");
		System.out.println(hashMap);//keys are unique <Entry>
		
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " -> "+entry.getValue());
		}
		
		

		

	}

}
