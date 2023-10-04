package com.java.oops.map;

import java.util.HashMap;

public class FrequencyTable {


	public static void main(String[] args) {
		int arr[] = { 32, 32, 3, 43, 4343, 43, 456, 2, 5, 65, 3, 4, 54, 8 };
//		v:freq
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if(hashMap.containsKey(num)) {//hashing
				Integer freq = hashMap.get(num);
				hashMap.put(num, ++freq);

			}else {
				hashMap.put(num, 1);
			}
		}
		
		System.out.println(hashMap);


	}

}
