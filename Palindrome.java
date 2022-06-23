package week2.day1.assignments;


public class Palindrome {
	public static void main(String[] args) {
		String value = "madam";
		String revvalue = "";
		for(int i = value.length()-1; i>=0; i--) {
			revvalue = revvalue + value.charAt(i);	
	}
	System.out.println("Original value: " +value);
	System.out.println("Reversed value: " +revvalue);
	if (value.equals(revvalue)) {
		System.out.println("The Given word is PalinDrome");
		
	} else {
		System.out.println("The Given word is not a PalinDrome");

	}
		}

}
