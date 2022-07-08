package org.sample;

public class ForLoop {
	
	public static void main (String[] args) {
		
		
		String s ="java program starts here";
		
		
		String result = "";
		String rev = "";
		
		
		for (int i = s.length()-1; i >= 0; i--) {
			
			
			result = result+s.charAt(i);
			
							
		}
		
		String[] sp = result.split(" ");
		

		for (int i = sp.length-1; i >= 0; i--) {
			
			
			rev = rev+sp[i]+" ";
							
		}
		System.out.println(rev);
		

		
	}

}
