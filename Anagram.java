package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int length1 = text1.length();
		int length2 = text2.length();
		
		if(length1==length2) {
			System.out.println("Text equal");
		}
		else {
			System.out.println("Text not equal");
		}	
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("The Given value is Anagram");
			
		} else {
			System.out.println("The Given value is not a Anagram");

		}
		
	}
}
