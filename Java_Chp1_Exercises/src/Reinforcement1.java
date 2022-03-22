import java.util.Scanner;

public class Reinforcement1 {

	public static void inputAllBaseTypes(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// byte
		// -2^7 2^7 -128 - 128
		byte byteValue = scanner.nextByte();
		System.out.println(byteValue);
		
		// short
		// -+2^15 = 32768
		short shortValue = scanner.nextShort();
		System.out.println(shortValue);
		
		// int
		// -+2^31 - 2147483648
		int intValue = scanner.nextInt();
		System.out.println(intValue);
		
		// long
		// -+ 2^63 = 
		long longValue = scanner.nextLong();
		System.out.println(longValue);
		
		// double
		// 64 bit signed
		double doubleValue = scanner.nextDouble();
		System.out.println(doubleValue);
		
		// float
		// 32 bit signed
		float floatValue = scanner.nextFloat();
		System.out.println(floatValue);
		
		// boolean
		boolean booleanValue = scanner.nextBoolean();
		System.out.println(booleanValue);
		
		// char
		char charValue = scanner.next().charAt(0);
		System.out.println(charValue);
	}

}
