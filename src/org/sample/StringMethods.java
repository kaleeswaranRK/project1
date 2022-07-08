package org.sample;

public class StringMethods {

	public static void main(String[] args) {

		String s = "kalees waran";

		int len = s.length();
		System.out.println(len);

		String up = s.toUpperCase();
		System.out.println(up);
		
		String low = s.toLowerCase();
		System.out.println(low);
		
		boolean start = s.startsWith("lk");
		System.out.println(start);
		
		boolean end = s.endsWith("ran");
		System.out.println(end);
		
		boolean con = s.contains("war");
		System.out.println(con);
		
		boolean emp = s.isEmpty();
		System.out.println(emp);
		

	}

}
