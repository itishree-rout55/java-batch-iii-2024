import java.util.Scanner;
public class ArithmaticOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		  

		System.out.println("press 1 -> Addition");
		System.out.println("press 2 -> Subtraction");
		System.out.println("press 3 -> Multiplication");
		System.out.println("press 4 -> Division");
		
		System.out.println("Enter your choice :");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		 case 1:
			 System.out.println(x+"+"+y+"="+(x+y));
			 break;
		 case 2:
			 System.out.println(x+"-"+y+"="+(x-y));
			 break;
		 case 3:
			 System.out.println(x+"*"+y+"="+(x*y));
			 break;
		 case 4:
			 System.out.println(x+"/"+y+"="+(x/y));
			 break;
		 default:
			 System.out.println("Invalid choice");
			
		
		}
		
		

	}

}
