package week2.day1.classroom;


public class ReverseString {
	public static void main (String[] args) {
		String test = "feeling good";
		int length = test.length();
		System.out.println("Length of "+test+" is "+length+"");
				char[] array = test.toCharArray();
		
		for (int i = array.length - 1; i >= 0; i--) {
			
		
			System.out.println(array[i]);
			
		}
		
		
	}

}
