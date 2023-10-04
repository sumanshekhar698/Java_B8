package com.java.oops.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		int arr[] = { 32, 32, 3, 43, 4343, 43, 456, 2, 5, 65, 3, 4, 54, 8 };

		ArrayList<Integer> list = new ArrayList<Integer>();

		int x = 9;
		Integer y = x;
		
		for (Integer num : arr) {// auto boxing
			if(!list.contains(num)) {// O(n) = n
				list.add(num);
			}

		}
		
		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<Integer>();// no duplicate are allowed :: hashing
		for (Integer num : arr) {// auto boxing
			set.add(num);

		}
		
		System.out.println(set);
		System.out.println(set.contains(5));// searching is very fast :: 1 single shot
		
		

	}

}
