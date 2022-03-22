import java.util.Scanner;

public class Calculator {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double num1, num2, ans = 0;
		char operator = ' ';
		
		System.out.println("Enter a number: ");
		num1 = scanner.nextDouble();	
		

		System.out.println("Enter a number: ");
		num2 = scanner.nextDouble();	
		
		
		System.out.println("+, -, *, or = : ");
		operator = scanner.next().charAt(0);	
		
		switch(operator) {
			case '+':
				ans = num1+num2;
				break;
			case '-':
				ans = num1-num2;
				break;
			case '*':
				ans = num1*num2;
				break;
			case '/':
				ans = num1/num2;
				break;
			default:
				System.out.println("Please select a valid operator");
		}
		
		System.out.println("Answer: "+ ans);
		
		
	}

}
