import java.util.Scanner;

   class NaturalNum {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int i = 1;

        while (i <= n)
            {
            if (i >= 1) {
                System.out.println(i);
            } else {
                System.out.println("Not a natural number.");
            }
            i++;  
         }

      }
   }
