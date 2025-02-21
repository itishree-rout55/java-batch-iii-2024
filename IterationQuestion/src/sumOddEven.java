import java.util.Scanner;

public class sumOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumEven =0;
		int sumOdd=0; 
		System.out.println("Enter 10 numbers :");
		for(int i=1; i<=10; i++) {
			System.out.println("Enter number "+i+" :");
			int n = sc.nextInt();
			
			if(n%2==0) {
				sumEven = sumEven + n; 
			}else {
				sumOdd = sumOdd + n;
			}
		}
		System.out.println("Sum of even numbers "+sumEven);
		System.out.println("Sum of odd numbers "+sumOdd);
	}

}
