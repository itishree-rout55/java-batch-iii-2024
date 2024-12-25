import java.util.Scanner;
class ProfitLoss
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter cost price :");
         int cost = sc.nextInt();
         System.out.println("Enter selling price :");
         int selling = sc.nextInt();

         int profit = selling - cost;
         int loss = cost - selling ;

        if(cost < selling)
        {
              System.out.println("profit amount is :"+profit);
        }
        else if(cost == selling)
        {
              System.out.println(" No profit and Loss:");
        }
        else{
            System.out.println("Loss amount is :"+loss);
        }
     }
}
            

         