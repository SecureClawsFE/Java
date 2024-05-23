
/**
 * I was able to complete this program by using professor's hint which was very helpful
 * I also spent plenty of time in tutoring. I liked going to tutoring
 * because the game hints, and after couples of minutes I was be able to understand and type the right code or key word
 * Also I watched couple of videos in Youtube to see how could do it
 * Furthermore, looking for more information in google to complete the program(mostly with trigonometric functions). 
 */



import java.util.Scanner;

public class Calculator2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	
	int entries;
	
	char operator;
	
	
	String userChoice = "";
	boolean isMathOperatorValid = false; 
	boolean startOverYN = true;
	double Result = 0.0;
	
	
	do {
		System.out.println("Enter the calculator mode: Standard/Scientific?");
		
		
		String mode = sc.next();
	if(mode.equalsIgnoreCase("Standard")) {	
	
		System.out.println("The calculator will operate in standard mode.");
		
	do {
	
        System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division:");
        operator = sc.next().charAt(0);
        double numbers;
        
        switch(operator) {
        
        case '+':
            Result = 0;
            System.out.println("How many numbers do you want to add?");
            entries = sc.nextInt(); 
            System.out.println("Enter " + entries + " numbers: ");
            for (int i = 0; i < entries; i++){
                numbers = sc.nextDouble();
                Result += numbers;
            }
            
            break;
        
        case '-':
            Result = 0;
            System.out.println("How many numbers do you want to substract?");
            entries = sc.nextInt();
            System.out.println("Enter " + entries + " numbers: ");
            numbers = sc.nextDouble();
            Result = numbers;
            for (int i = 0; i < entries-1; i++){
                numbers = sc.nextDouble();
                Result -= numbers;
            }
            break;
            
        case '*':
            Result = 1;
            System.out.println("How many numbers do you want to multiply?");
            entries = sc.nextInt();
            System.out.println("Enter " + entries + " numbers: ");
            for (int i = 0; i < entries; i++){
                numbers = sc.nextDouble();
                Result *= numbers;
            }
            break;
        
        case '/':
            Result = 1;
            System.out.println("How many numbers do you want to divide?");
            entries = sc.nextInt();
            System.out.println("Enter " + entries + " numbers: ");
            for (int i = 0; i < entries; i++){
                numbers = sc.nextDouble();
                Result /= numbers;
            }
            break;
        
        default:
        
            System.out.println("Ivanlid operator " + operator);
        
        
        }//end switch
        
        isMathOperatorValid = false;
        
        

		}//do2
		
	while (isMathOperatorValid);
	}//end if
	
	else {
		
		
	if(mode.equalsIgnoreCase("Scientific")) {
		System.out.println("The calculator will operate in scientific mode.");
		
		System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");	
		String radianorDegree = sc.nextLine();
		operator = sc.next().charAt(0);
        double numbers;
        
        switch(operator) {
        
        case '+':
            Result = 0;
            System.out.println("How many numbers do you want to add?");
            entries = sc.nextInt(); 
            System.out.println("Enter " + entries + " numbers: ");
            for (int i = 0; i < entries; i++){
                numbers = sc.nextDouble();
                Result += numbers;
            }
            
            break;
        
        case '-':
            Result = 0;
            System.out.println("How many numbers do you want to substract?");
            entries = sc.nextInt();
            System.out.println("Enter " + entries + " numbers: ");
            numbers = sc.nextDouble();
            Result = numbers;
            for (int i = 0; i < entries-1; i++){
                numbers = sc.nextDouble();
                Result -= numbers;
            }
            break;
            
        case '*':
            Result = 1;
            System.out.println("How many numbers do you want to multiply?");
            entries = sc.nextInt();
            System.out.println("Enter " + entries + " numbers: ");
            for (int i = 0; i < entries; i++){
                numbers = sc.nextDouble();
                Result *= numbers;
            }
            break;
        
        case '/':
            Result = 1;
            System.out.println("How many numbers do you want to divide?");
            entries = sc.nextInt();
            System.out.println("Enter " + entries + " numbers: ");
            for (int i = 0; i < entries; i++){
                numbers = sc.nextDouble();
                Result /= numbers;
            }
            break;
        
          case 's':                                                                    
			System.out.println("Enter a number in radians to find the sine");
			entries = sc.nextInt();
			Result = Math.sin( entries);
			break;
	
          case 't':                                                                     
  			System.out.println("Enter a number in radians to find the tangent");
  			entries = sc.nextInt();
  			Result = Math.tan(entries);
  			break;
  			
          case 'c':                                                                      
  			System.out.println("Enter a number in radians to find the cosine");
  			entries = sc.nextInt();
  			Result = Math.cos(entries);
  			break;
        
        
        
        
        default:
        
            System.out.println("Ivanlid operator " + operator);
        
		
		
		
		
		
		
		
		
		
		
		
		}//end switch
	
	
	
	
	
	
	
	
	}//end if
	}//end else
		System.out.println("Result: " + Result);
		System.out.println("Do you want to start over?");
		System.out.println("Type Y for yes or N for No");
		userChoice = sc.next();
	
	
		
		if(userChoice.equalsIgnoreCase("Y")) {
		
			startOverYN = true;
		}//end if
		else if (userChoice.equalsIgnoreCase("N")){
		
			startOverYN = false;
			}//end else if	
		
		
		
		
	}//do1
	while(startOverYN);
		
		
		
		System.out.println("Goodbye");
		
		sc.close();

	
	
	}//end main
}//end class
