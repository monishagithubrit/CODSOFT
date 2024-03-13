import java.util.Scanner;

public class Gradecalculator {
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("-------------------------");
		System.out.println("  STUDENT'S GRADE SHEET  ");
		System.out.println("-------------------------");
		System.out.println();
		
		System.out.print(" Student Name : ");
		sc.nextLine();
		System.out.print(" Roll Number  : ");
		sc.nextInt();	
		System.out.println();
		System.out.println(" Subjects     : ");
		System.out.println(" Marks of the subjects.. (100/100)     ");
		System.out.println();
		System.out.print("1) Heritage of Tamil     : ");
		double tamilmark = sc.nextDouble();
		System.out.print("2) Communicative English : ");
		double engmark = sc.nextDouble();
		System.out.print("3) Mathematics           : ");
		double mathmark = sc.nextDouble();
		System.out.print("4) Aptitude              : ");
		double apt = sc.nextDouble();
		System.out.print("5) Coding papers         : ");
		double coding = sc.nextDouble();
		System.out.println();
		
		System.out.print(" Total Marks             : ");
		double totalmarks = tamilmark + engmark + mathmark + apt + coding; 
		System.out.print(totalmarks);
		System.out.println();
		
		System.out.print(" Percentage              : ");
		float per =(float) totalmarks/5 ;
		System.out.println(per+"%");
		
		System.out.print(" Grade                   : ");
		if(per==100.00) {
			System.out.print("O - Outstanding");
		}
		else if(per<=99.00 && per>=90.00) {
			System.out.print("A+ - Very Excellent");
		}
		else if(per<=89.00 && per>=80.00) {
			System.out.print("A - Excellent");
		}
		else if(per<=79.00 && per>=70.00) {
			System.out.print("B+ - Very Good");
		}
		else if(per<=69.00 && per>=60.00) {
			System.out.print("B - Good");
		}
		else if(per<=50.00 && per>=59.00) {
			System.out.print("C - Better");
		}
		else {
			System.out.print("F - Fail");
		}
	}
	
 }
}
