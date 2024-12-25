import java.util.Scanner;
class MaxThreeNo
{
     public static void main(String[] args)
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of x :");
       int x = sc.nextInt();
       System.out.println("Enter the value of y:");
       int y = sc.nextInt();
       System.out.println("Enter the value of z :");
       int z = sc.nextInt();

       if(x>y&& x>z)
       {
          System.out.println(" x is Maximum Number");
       }else if(y>z && y>x){
          System.out.println(" y is Maximum Number");
       }else{
          System.out.println(" z is Maximum Number");
       }
     }
}