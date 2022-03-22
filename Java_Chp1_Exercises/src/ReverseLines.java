import java.util.Scanner;

/**
 * P-1.26
 * @author yena
 *
 */

public class ReverseLines {
	
	public static String reverseStr(String text) {
		StringBuilder str = new StringBuilder(text);
		int lengthHalf = str.length()/2;
		
		for(int i = 0; i<lengthHalf; i++) {			
			char currentIndex = str.charAt(i);
			char swappingIndex = str.charAt(str.length()-1-i);
			str.setCharAt(i, swappingIndex);
			str.setCharAt((str.length()-1-i), currentIndex);
		}
		
		return str.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a line of text:");
		String input = scanner.nextLine();
		
		System.out.println(reverseStr(input));
	}

}
