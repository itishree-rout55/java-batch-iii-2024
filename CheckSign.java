import java.util.Scanner;
class CheckSign
{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter a number");
         int num = sc.nextInt();
         
         if(num<0){
              System.out.println("The number must have negative sign :");
         }else if(num>0)
         {
              System.out.println("The number must have positive sign :"); 
         }else{
              System.out.println("The number have no sign that is zero:");
         }
      }
}
              
