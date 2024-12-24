//To check wheather a number is Armstrong or not .

import java.util.Scanner;
class ArmstrongNumber
{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      
     
     System.out.println("Enter a number");
     int num = sc.nextInt();
     int temp=num;
     int digit;
     int sum=0;

    while(num>0)
    {
      digit=num%10;
      sum=sum+digit*digit*digit;
      num=num/10;
    }
    if(temp==sum){
       System.out.println("Number is Armstrong");
    }else{
       System.out.println("Number is not Armstrong");
    }
  }
}
      
     