import java.util.Scanner;
public class EmpSalaryCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic salary of the employee :");
		double basicSalary = sc.nextDouble();
		double HRA = 0 , DA = 0; 
		
		if(basicSalary <= 10000) {
			HRA = 0.20*basicSalary;
			DA = 0.80*basicSalary;
		}else if(basicSalary <= 20000) {
			HRA = 0.25*basicSalary;
			DA = 0.90*basicSalary;
		}else{
			HRA = 0.30*basicSalary;
			DA = 0.95*basicSalary;
		}
		
		double grossSalary = basicSalary + HRA + DA;
		
		System.out.println("Basis Salary :"+basicSalary);
		System.out.println("HRA :"+HRA);
		System.out.println("DA :"+DA);
		System.out.println("Gross Salary :"+grossSalary);
		
	}

}
