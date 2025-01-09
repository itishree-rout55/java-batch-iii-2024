import java.util.Scanner;
public class MultipleOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		System.out.println("press 1 -> Find Factorial :");
		System.out.println("press 2 -> Check perfect :");
		System.out.println("press 3 -> Check armstrong :");
		System.out.println("press 4 -> print multiplication table :");
		System.out.println("press 5 -> Check even/odd :");
		
		System.out.println("Enter your choice :");
		int choice = sc.nextInt();
		
		switch(choice) 
		{
		case 1:
			int temp = num;
			int fact = 1;
			while(temp>0) 
			{
				  fact = fact*temp;
				  temp = temp-1;
			}
			System.out.println("Factorial of"+num+" is :"+fact);
			break;
			
		
		case 2:
			int i = 1;
			int sum = 0;
			while(i<num)
			{
				if(num%i == 0) {
					sum = sum + i;
				}
				i++;
			}
			if (sum == num) {
	            System.out.println(num + " is a perfect number.");
	        } else {
	            System.out.println(num + " is not a perfect number.");
	        }
			break;
		case 3:
			temp = num;
			int digit;
		    sum = 0;
		    while(num>0)
		    {
		      digit=num%10;
		      sum=sum+digit*digit*digit;
		      num=num/10;
		    }
		    if(temp==sum){
		       System.out.println(temp + "is Armstrong");
		    }else{
		       System.out.println(temp + "is not Armstrong");
		    }
			
			break;
		case 4:

		        i=1;
		       while(i<=10){
		          System.out.println(num+"x"+i+"="+(num*i));
		          i++;
		       }
			break;
		case 5:
			if (num%2 == 0) {
				System.out.println(num+ "is even");
			}else {
				System.out.println(num+ "is odd");
			}
			break;
		
		}
		
		
	}

}
