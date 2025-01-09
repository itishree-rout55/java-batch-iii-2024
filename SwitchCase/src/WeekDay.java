import java.util.Scanner;
public class WeekDay {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("There is a menu to choose your option :");
		
		System.out.println("select 1 : Sunday"); 
		System.out.println("select 2 : Monday");
		System.out.println("select 3 : Tuesday");
		System.out.println("select 4 : Wednesday");
		System.out.println("select 5 : Thursday");
		System.out.println("select 6 : Friday");
		System.out.println("select 7 : Saturday");
		
		System.out.println("Please select a number in your choice :");
	    int  choice = sc.nextInt();
		
		
		switch(choice) 
		{
		case 1:
			System.out.println("  Holiday !");
			break;
		case 2:
			System.out.println(" Start with a positive thought and a grateful heart !");
			break;
		case 3:
			System.out.println(" Start your day with a smile and good vibes !");
			break;
		case 4:
			System.out.println(" Halfway to the weekend !");
			break;
		case 5:
			System.out.println(" Have a beautiful day !");
			break;
		case 6:
			System.out.println(" Wishing you a blessed good friday !");
			break;
		case 7:
			System.out.println(" A wonderful day filled with joy !");
			break;
		default:
			System.out.println(" please select a valid number !");
			
		
		}
		
		
	}

}
