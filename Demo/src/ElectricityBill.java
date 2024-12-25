
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Consumer Name :");
		String Name = sc.nextLine();
		System.out.println("Enter Consumer ID :"); 
		String ID = sc.nextLine();
		System.out.println("Enter Bill Month :");
		String Month= sc.nextLine();
		System.out.println("Enter Previous Reading :");
		int PR = sc.nextInt();
		System.out.println("Enter Current Reading :");
		int CR = sc.nextInt();
		
		int unit = CR-PR;
		double price = 0;
		 if(unit>1 && unit<100) {
			 price = unit *5;
		 }else if(unit>100 && unit<300) {
			 price = 500 +(unit-100)* 7;
		 }else if(unit<300) {
			 price = 500+1400+(unit-300)*8;
		 }
		 
		 System.out.println("Consumer Name :"+Name);
		 System.out.println("Consumer ID :"+ID);
		 System.out.println("Bill month :"+Month);
		 System.out.println("Previous Reading :"+PR);
		 System.out.println("Current Reading :"+CR);
		 System.out.println("Unit :"+unit);
		 System.out.println("Price :"+price);
			 
		 
		
		

	}

}
