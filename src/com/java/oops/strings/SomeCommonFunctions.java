package com.java.oops.strings;

public class SomeCommonFunctions {

	public static void main(String[] args) {

//		Using String Literal
//		String nameOfMovie1 = "   pushpa2 is COMING    ";// Strings are objects in Java AND they are immutable
//		String nameOfMovie2 = "  pushpa2 is ComIng  ";// Strings are objects in Java AND they are immutable
//
//		if (nameOfMovie1.equalsIgnoreCase(nameOfMovie2))
//			System.out.println(true);

		String apple = " APPLe are healthy  ";
		apple = apple.toLowerCase();
		System.out.println(apple);

		System.out.println(apple.toUpperCase());
		System.out.println(apple.trim());

		apple = apple.trim();
		System.out.println(apple);
		System.out.println(apple.length());

		char charAt = apple.charAt(4);
		System.out.println(charAt);

		apple = "";
		System.out.println(apple.length());
//		if(apple.length() == 0)
		if (apple.isEmpty())
			System.out.println("EMPTY");

		String x = "";
		String x_ = null;

		System.out.println(x.length());
//		System.out.println(x_.length());

		apple = "Apple a day keeps a doctor away";
		System.out.println(apple.substring(8,11));//starting indx is inclusing
		//ending index is exclusive
		System.out.println(apple.substring(27));
		
		int indexOf = apple.indexOf('e');
		System.out.println(indexOf);
		System.out.println(apple.lastIndexOf('e'));
		
		String m = "tom";
		m = m.concat(" and");
		m = m + " jerry";
		System.out.println(m);

	}
}
