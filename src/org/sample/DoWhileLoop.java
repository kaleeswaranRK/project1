package org.sample;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		int i =8;
		do {
			i--;
			if (i==6) {
				break;
				
			}
			
			System.out.println(i);
			
			
		} while (i>0);
		
		System.out.println("end");
	}

}
