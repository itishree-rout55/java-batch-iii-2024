import java.util.Scanner;
class PrintTable{
      public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
       
        while(i<10)
        {
           System.out.println(num +" X "+ i +" = "+(num*i);
        }
      }