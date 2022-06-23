package week2.day1.classroom;



public class CharOccurance {
	public static void main(String[] args) {
		String str = "Welcome to Chennai";
		char text = 'e';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == text)
				count++;
			
		}
		System.out.println("The character "+text+" appears "+count+" times");
		
	}

}
