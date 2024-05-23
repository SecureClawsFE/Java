import java.util.*;
import java.lang.Math;

public class PromptBank{
    String[] sentences = {"ELIZA: BLANK1 seems important to you, so does BLANK2. Please tell me more",
                          "ELIZA: BLANK1 and BLANK2 seem to be on your mind. Lets's talk about it.",
                          "I want a BLANK1, but I'm a BLANK2 eating waffles.",
                          "ELIZA: Today is the BLANK1 I'll finally know what BLANK2 tastes like.",
                          "ELIZA: BLANK1..Can you say anything else not just BLANK2.",
                          "ELIZA: That's great that you are talking about BLANK1 and BLANK2"};
    
    String[] questions = {"ELIZA: Does BLANK1 bother you? How about BLANK2",
                          "ELIZA: BLANK1 and BLANK2? Really! you are talking about that?",
                          "ELIZA: Do you have any other question about BLANK1 or BLANK2",
                          "ELIZA: BLANK1? Can you think again about BLANK2",
                          "ELIZA: Okay. lets talk more about BLANK1 and BLANK2 , Shall we?",
                          "ELIZA: Can you give me more information about BLANK1 and BLANK2"};    
                          
    public void generate(){
        String userInput;
        String last;
        String current = "";
        Scanner scan = new Scanner(System.in);
	    Random r = new Random();
	    int low = 0;
        int high = sentences.length;
        userInput = scan.nextLine();
        while(!userInput.equalsIgnoreCase("EXIT")){
            int rand = r.nextInt(high-low) + low;
            last = userInput.substring(userInput.length() - 1);
            if(last.equals("?")){
                current = questions[rand];
                String arr[] = userInput.split(" ", userInput.length());
                String firstWord = arr[0];   
                String lastWord = arr[arr.length - 1]; 
                current = current.replaceAll( "BLANK1" , firstWord );
                current = current.replaceAll( "BLANK2" , lastWord );
                System.out.println(current);
            }
            else if(last.equals("!")){
                current = sentences[rand];
                String arr[] = userInput.split(" ", userInput.length());
                String firstWord = arr[0];   
                String lastWord = arr[arr.length - 1]; 
                current = current.replaceAll( "BLANK1" , firstWord );
                current = current.replaceAll( "BLANK2" , lastWord );
                System.out.println("ELIZA: WOW! Dramatic! "+current);
            }
            else{
                current = sentences[rand];
                String arr[] = userInput.split(" ", userInput.length());
                String firstWord = arr[0];   
                String lastWord = arr[arr.length - 1]; 
                current = current.replaceAll( "BLANK1" , firstWord );
                current = current.replaceAll( "BLANK2" , lastWord );
                System.out.println(current);
            }
            
            System.out.print("USER: ");
            userInput = scan.nextLine();
        }

	    
	}                      
                          
    
}