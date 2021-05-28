import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num1, num2;
double num3;
System.out.println("Enter any Integer");
try {
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = num1/num2;
	System.out.println("Result = " +num3);
}
catch (InputMismatchException e) {
	System.out.println("Enter an integer only");
}
catch (ArithmeticException e) {
	System.out.println("Second number cannot be = 0");
}
	}

}
