import java.util.Scanner;
public class NumberGame{
   public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		boolean status=false;
		
		System.out.println("      ----------------------------    ");
		System.out.println("          NUMBER GUESSING GAME        ");
		System.out.println("      ----------------------------     ");
		System.out.println("    Welcome to the Number Guessing Game   ");
		System.out.println();
		System.out.println("      Instructions :");
		System.out.println("      ------------  ");
		System.out.println("      1) A random number can be created by the System that should be in hide.\n      2) You are asked to enter the number from 1 to 100.\n "+    
				           "     3) If you entered number or guess is correct your score will be displayed with the number of attempts.\n      4) If you guessed wrong either it will show Too high or Too low.\n "+
				           "     5) Initial score will be given.\n      6) For every high and low answer -5 points and -3 points will be reduced form your initial score.\n"+"      7) You have 7 attempts to guess the number");
		System.out.println();
		System.out.println("    Lets Start!");
		System.out.println();
		boolean exit = false;
		boolean enter=true;
		while(!exit) {
			System.out.println("   1) Guess");
			System.out.println("   2) Exit");
			System.out.println();
			System.out.print("   Enter your choice : ");
			int choice = sc.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:
			    while(enter){
			        int secretNumber = (int)(Math.random()*100)+1;
		int option=0;
		int guess = 0;
		int attempts = 0;
		int initialScore = 100;
		     System.out.println("    Try to guess the number between 1 and 100.   ");
		     System.out.println("    Initial Score : "+initialScore);
		     System.out.println();
		     while(attempts<7){
		         System.out.print("    Guess the number :   ");
			     guess=sc.nextInt();
			     attempts++;
			    if(0>guess||100<guess){
			        System.out.println("Invalid guess");
			        continue;
			    }
			    
			     if(guess>secretNumber) {
				  System.out.println("    **Too High! Try again.   ");
				  initialScore -= 5;
				  System.out.println("    Updated score : "+initialScore+" points");
			      System.out.println();
			      }   
			     else if(secretNumber<guess){
				  System.out.println("    **Little Low! Try again.    ");
				  initialScore -= 3;
				  System.out.println("    Updated score : "+initialScore+" points");
				  System.out.println();
			      }
			      else{
			       System.out.println("   Congratulations! You guessed the number. ");
			          status=true;
		           System.out.println("   Attempts = "+attempts);
		           System.out.println("   Your Overall Score = "+initialScore+" points");
		           System.out.println();
		           break;
			      }
			      
		     }
		     if(attempts==7||status==true){
		         
		         if(attempts==7){
		             System.out.println("\n The secret number is "+ secretNumber);
		         
		              System.out.println(" You  are failed!\n");
		         }
		         attempts=0;
		         System.out.println("1.Play Again\n"+"2.Exit\n");
		         option=sc.nextInt();
		         if(option==1){
		             break;
		         }
		       if(option==2) {
		    	   
		        }
		       }
		  
		     if(option==2){
		         exit=true;
		         break;
		     }
			        
			    }
			    break;
		     		case 2:
				exit = true;
				break;
			default:
				System.out.println(" Invalid choice. Please enter the correct choice!");
				System.out.println();
			}
		}
	}
	
	System.out.println("     GAME OVER!");
  }
}
