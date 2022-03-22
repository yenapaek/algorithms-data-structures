
public class Reinforcement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("R-1.3");
		System.out.println(Reinforcement.isMultiple(100,10000));
	
		System.out.println("R-1.4");
		System.out.println(Reinforcement.isEven(0));
		System.out.println(Reinforcement.isEven(1));
		System.out.println(Reinforcement.isEven(2));
		System.out.println(Reinforcement.isEven(3));
		System.out.println(Reinforcement.isEven(5));
		System.out.println(Reinforcement.isEven(-5));
		
		System.out.println("R-1.5");
		System.out.println(Reinforcement.sumOfN(3));
		System.out.println(Reinforcement.sumOfN(5));
		System.out.println(Reinforcement.sumOfN(8));
		
		System.out.println("R-1.6");
		System.out.println(Reinforcement.sumOfOddN(3));
		System.out.println(Reinforcement.sumOfOddN(5));
		System.out.println(Reinforcement.sumOfOddN(8));
		System.out.println(Reinforcement.sumOfOddN(-3));
		
		System.out.println("R-1.7");
		System.out.println(Reinforcement.sumOfSquares(2));
		System.out.println(Reinforcement.sumOfSquares(3));
		System.out.println(Reinforcement.sumOfSquares(-2));
		
		System.out.println("R-1.8");
		System.out.println(Reinforcement.getVowelCount("hello"));
		System.out.println(Reinforcement.getVowelCount("breeze"));
		System.out.println(Reinforcement.getVowelCount("bbbbb"));

		
		System.out.println("R-1.9");
		System.out.println(Reinforcement.removePunctuations("hellod..."));
		System.out.println(Reinforcement.removePunctuations("hello's"));
		System.out.println(Reinforcement.removePunctuations("hell o!!"));
		
	}

	/**
	 * R-1.3
	 * 
	 * @param m
	 * @param n
	 * @return true or false if n is a multiple m
	 */
	public static boolean isMultiple(long n, long m) {
		return m % n == 0;
	}
	
	/**
	 * R-1.4
	 * 
	 * @param i
	 * @return true or false if i is even
	 */
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
	 * R-1.5
	 * 
	 * @param n
	 * @return int sum of all int >= n
	 */
	public static int sumOfN(int n) {
		int m = 0;
	
		if (n>0) {
			for (int i=n; i>0; i--) {
				m = m+i;
			}
			return m;
		} else {
			return 0;
		}

	}
	
	
	/**
	 * R-1.6
	 * 
	 * @param n
	 * @return int sum of all odd int >= n
	 */
	public static int sumOfOddN(int n) {
		int m = 0;
		
		if (n>0) {
			for (int i = n; i > 0; i--) {
				if(!isEven(i)) {
					m = m + i;
				}	
			}
			return m;	
		} else {
			return 0;
		}
	}
	/**
	 * R-1.7
	 * 
	 * @param n
	 * @return int the sum of squares of positive ints n and lower
	 */
	public static int sumOfSquares(int n) {
		double m = 0;
		
		if (n>0) {
			for (int i = n; i > 0; i--) {
				m = m + Math.pow(i, 2);
			}
			return (int) m;	
		} else {
			return 0;
		}
	}
	
	/**
	 * R-1.8
	 * 
	 * @param s
	 * @return int the num of vowels in a string
	 */
	public static int getVowelCount(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * R-1.9
	 * 
	 * @param s
	 * @return String removed punctuations
	 */
	public static String removePunctuations(String s) {
		StringBuilder str = new StringBuilder(s);
		
		for (int i = s.length()-1; i>=0; i--) {
			if(s.charAt(i)=='!' || s.charAt(i)=='.' || s.charAt(i)==',' ||  s.charAt(i)=='?' ||  s.charAt(i)=='\'') {
				str.deleteCharAt(i);
			} 
		}
		
		return str.toString();
	}
	
}
