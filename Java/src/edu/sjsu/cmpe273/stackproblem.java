	package edu.sjsu.cmpe273;
//Check if a sting is palindrome or not!

import java.util.Scanner;
import java.util.Stack;

import org.junit.Test;

public class stackproblem {
	
	 public boolean palindorme(String s){

//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();

		char[] reverse = new char [s.length()];
		int j=0;
		Stack st = new Stack();
		
		for (int i = 0; i < s.length(); i++) {
			st.push(s.charAt(i));
		}	
		while (!st.isEmpty()) {
			reverse[j++] = (char) st.pop();
		}
		String out = new String(reverse);
		
		if(out.equalsIgnoreCase(s)){
			System.out.println("Given string is palindrome!");
			return true;
		}else{
			System.out.println("Given string is not palindrome!");
			return false;
		}
	}	
	
	public static void main(String[] args) {
		stackproblem sp = new stackproblem();
		sp.palindorme("wow");
		sp.palindorme("how are you?");		
	}		
}


