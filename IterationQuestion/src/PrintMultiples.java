import java.util.Scanner;

public class PrintMultiples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		System.out.println("The first ten multiples of "+num+" are :");
		for(int i=1; i<=10; i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}

	}

}
