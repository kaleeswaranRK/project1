package org.sample;

public class CountEven {

	public static void main(String[] args) {
		
		int j = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			if (i %2 ==0) {
				j = j+1;
				
			}
			
		}
		System.out.println(j);
	}
	
		
	}