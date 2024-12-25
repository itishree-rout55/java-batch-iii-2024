import java.util.Scanner;
class MaximumNo
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x :");
        int x = sc.nextInt();
        System.out.println("Enter the value of y :");
        int y = sc.nextInt();
    
        if(x<y)
        {
           System.out.println(" Maximum Number is Y");
        }else{
           System.out.println("Maximum Number is x");
        }
    }
}