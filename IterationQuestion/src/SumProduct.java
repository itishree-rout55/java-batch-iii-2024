import java.util.Scanner;

public class SumProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ten numbers :");
		int sum = 0;
		long product = 1;
		for(int i=1; i<=10; i++) {
			System.out.println("Enter numbers "+i+" :");
			int num = sc.nextInt();
			sum = sum+num;
			product = product*num;
		}
		System.out.println("Sum of numbers "+sum);
		System.out.println("Product of numbers "+product);
	}

}
