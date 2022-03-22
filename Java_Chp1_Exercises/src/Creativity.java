import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Creativity {

	/*
	 * C-1.14
	 * 
	 * This method will reverse an array of n integers
	 * 
	 * method (array[] arr){
	 * 
	 * for loop starting at the end index working backwards{
	 * 		save the last element
	 *  	add to the new array
	 *  }
	 *  
	 *  return new array
	 * }
	 * 
	 * static int[] reverse(int[] arr){
	 * int[] reversedArr = new int[arr.length()];
	 * 
	 * for (int i = arr.length()-1; i>=0; i--;){
	 * 		reversedArr[j] = arr[i];
	 * 		j++;
	 * }
	 * 
	 * return reversedArr;
	 * 
	 */
	
	
	/**
	 * C-1.16
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int[] one = {1,2,3};
		int[] two = {1,1,1};
		System.out.println(Arrays.toString(Creativity.arrayProduct(one, two)));
		
		Creativity.possibleStrings("catdog");

		int[] shuffledArr = {1,2,4,6,7};
		System.out.println(Arrays.toString(Creativity.shuffledArray(shuffledArr)));
		
		int[] arr = {1,2,4,6};
		System.out.println(Creativity.isDistinct(arr));
		
		System.out.println(Creativity.divisbleByTwo(2));
		System.out.println(Creativity.divisbleByTwo(-4));		
		System.out.println(Creativity.divisbleByTwo(3));
		
		int[] arr1 = {4,3};
		System.out.println(Creativity.vectorNorm(arr1, 3));
		
		int[] arr2 = {4,3};
		System.out.println(Creativity.vectorNorm(arr2, 2));
		
		int[] arr3 = {1,2,3,4,5};
		System.out.println(Creativity.evenPairs(arr3));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int a = scanner.nextInt();
		
		System.out.print("Enter an integer: ");
		int b = scanner.nextInt();
		
		System.out.print("Enter an integer: ");
		int c = scanner.nextInt();
		
		if ((a + b) == c) {
			System.out.println("a + b = c");
		}
		
		if ((b - c) == a) {
			System.out.println("b - c = a");
		}
		
		if ((a * b) == c) {
			System.out.println("a * b = c");	
		}	
		
	}
	
	public static boolean isEven(int i) {
		if ((i & 1) == 0) {
			return true;
		} else if (i == 0 ){
			return false;
		} else {	
			return false;
		}
	}
	
	/**
	 * C-1.18
	 *  
	 * 
	 * @param arr
	 * @return boolean if there is an even # in array since an even num * any num = even product
	 */
	public static boolean evenPairs(int[] arr) {
		
		for (int i = arr.length-1; i>=0; i--) {
			if (isEven(arr[i])) {
				return true;
			}	
		}
		return false;
		
	}
	
	/**
	 * C-1.18
	 * 
	 * @param arr
	 * @param p
	 * @return pnorm norm of array
	 */
	public static double vectorNorm(int[] arr, int p) {
		double a = (double) arr[0];
		double b = (double) arr[1];
		
		double inner = Math.pow(a, p) + Math.pow(b, p);
		double pNorm = Math.pow(inner, (1.0/p));
		
		return pNorm;
	}
	
	/**
	 * C-1.18
	 * 
	 * @param arr
	 * @param p
	 * @return Euclidean norm of array
	 */
	public static double vectorNorm(int[] arr) {
		double a = (double) arr[0];
		double b = (double) arr[1];
		
		double inner = Math.pow(a, 2) + Math.pow(b, 2);
		double eNorm = Math.sqrt(inner);
		
		return eNorm;
	}
	
	/**
	 * C-1.19
	 * 
	 * @param num
	 * @return int count for x to be divisible by 2 while x >= 2
	 */
	public static int divisbleByTwo(int num) {
		int count = 0;
		
		if (num > 0) {
			while(num >= 2) {
				num = num/2;
				count++;
			}
		}
		
		return count;
	}
	
	/**
	 * C-1.20
	 * 
	 * @param arr
	 * @return boolean whether arr elements are distinct
	 */
	public static boolean isDistinct(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * C-1.21
	 * 
	 * @param arr
	 * @return shuffled array
	 */
	public static int[] shuffledArray(int[] arr) {
		Random random = new Random();
		
		for (int i = 0; i<arr.length; i++) {
			int randomNum = random.nextInt(arr.length-i); // random num between 0 to length-1
			int randomIndex = randomNum+i; // current index + (equalized random index)
			
			int temp = arr[randomIndex]; // current pointer
			arr[randomIndex] = arr[i]; // assign current index to value of random index
			arr[i] = temp; // assign current index value to random index
		}
		
		return arr;
	}
	
	/**
	 * C-1.22
	 * @param text
	 * prints all possible strings of catdog
	 */
	public static void possibleStrings(String text) {
		StringBuilder str = new StringBuilder(text);
		
		for(int i = 0; i<str.length(); i++) {			
			for(int j = 1; j<str.length(); j++) {
				char currentChar = str.charAt(i);
				char swappingChar = str.charAt(j);
				str.setCharAt(i, swappingChar);
				str.setCharAt(j, currentChar);
				System.out.println(str.toString());
			}
		}
		
	}
	
	public static int[] arrayProduct(int[] a, int[] b) {
		int[] arr = new int[a.length];
		
		for (int i = 0; i<a.length; i++) {
			arr[i] = a[i] * b[i];
		}
		
		return arr;	
	}
	
	
	
	
	
	
	
	
	
}
