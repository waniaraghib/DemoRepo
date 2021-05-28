import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];
		for (int i=0; i < array.length; i++) {
			array[i] = (int) (Math.random()* 100) + 1;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of the array: ");
		int a = sc.nextInt();
		try {
			System.out.println("Value of Index "+a+" is" + array[a]);
			
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bound");
		}
	}

}
