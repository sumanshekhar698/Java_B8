package com.java.basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EY {

	public static void main(String[] args) {

		ArrayList<SKU> skuList = new ArrayList();
		skuList.add(new SKU("iPhone", 32));
		skuList.add(new SKU("Pixel", 21));
		skuList.add(new SKU("Samsung", 45));
		skuList.add(new SKU("Pixel 4A", 21));

		skuList.add(new SKU("Xiaomi", 24));
		skuList.add(new SKU("1+", 34));

//	     // Store the list of SKUs in a sorted way in a LinkedHashMap

		List<SKU> collect = skuList.stream().sorted(Comparator.comparingInt(SKU::getId)).collect(Collectors.toList());
		System.out.println(collect);

		LinkedHashMap<Integer, String> sortedSkuMap = skuList.stream().sorted(Comparator.comparingInt(SKU::getId).reversed())
				.collect(Collectors.toMap(SKU::getId, SKU::getName, (e1, e2) -> e2, LinkedHashMap::new));
//        // Print the sorted SKU map
		sortedSkuMap.forEach((k, v) -> System.out.println(k + " -> " + v));

	}

	static class SKU {
		private String name;
		private int id;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public SKU(String name, int id) {
			super();
			this.name = name;
			this.id = id;
		}

		@Override
		public String toString() {
			return "SKU [name=" + name + ", id=" + id + "]";
		}

	}

}
