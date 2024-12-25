import java.util.Scanner;
public class CharacterCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch = sc.nextLine().charAt(0);
		
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) 
		{
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u')
			{
			    System.out.println("Given character is Vowel !");	
			}else {
				System.out.println("Given character is consonant !");
			}
			
		}else {
			System.out.println("Given character is not an alphabet !");
		}
	}

}
