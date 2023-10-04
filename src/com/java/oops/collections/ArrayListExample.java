package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		int arr[] = { 32, 32, 3, 43, 4343 };

		ArrayList list = new ArrayList();
		list.add(43);
		list.add(34.54);
		list.add(true);
		list.add('c');

		System.out.println(list);

		ArrayList<Integer> intList = new ArrayList<Integer>();// colections and map only hold objects
		intList.add(4);
		intList.add(423);
//		intList.add("suman");
		intList.add(423);

		intList.add(423);

		intList.add(23);
		intList.add(5);

		intList.add(34);

		System.out.println(intList.size());
		System.out.println(intList);
		System.out.println(intList.isEmpty());// false
		System.out.println(intList.indexOf(23));

//		for (int i = 0; i < intList.size(); i++) {//VERY BAD
////			intList.add(i);
//			System.out.print(intList.get(i)+", ");
//		}

		// 2.
		for (Integer num : intList) {
//		intList.add(5);
			System.out.print(num + ", ");
		}

		System.out.println();

		// 3.
		Iterator<Integer> iterator = intList.iterator();
//		[4, 423, 423, 423, 23, 5, 34]
		while (iterator.hasNext()) {// TODO to iterate in reverse order using iterator
			Integer num = (Integer) iterator.next();
			System.out.print(num + ", ");
		}
		System.out.println();

//		4. 
//		[4, 423, 423, 423, 23, 5, 34]
		intList.stream().forEach(System.out::println);// :: double colon operator, method reference opertaor

//		Collections.sort(intList);
//		System.out.println(intList);

		Collections.sort(intList, Collections.reverseOrder());
		System.out.println(intList);
		
		
		Collections.shuffle(intList);
		System.out.println(intList);

		intList.clear();
		System.out.println(intList);

	}

}
