/**
 * I was able to complete this program by using professor hints
 * watching videos on youtube
 * going back to lectures
 * spending a lot of times in tutoring
 * 
 * here is the link of the video
 * https://www.dropbox.com/s/g2ksex3lj2enyjm/video1443926581.mp4?dl=0
 */

import java.util.*;
import java.lang.Math;

public class ProjectEliza{

	public static void main(String[] args) {
	    String name;
	    Scanner scan = new Scanner(System.in);
	    String again = "yes";
	    while(again.equalsIgnoreCase("yes")){
	        System.out.println("ELIZA: Hello, my name is Eliza. What is your name?");
    		name = scan.nextLine();
    		System.out.println("ELIZA: Hello, "+name+". Tell me what is on your mind today in 1 sentence.");
    		System.out.print("USER: ");
    		PromptBank prompt = new PromptBank();
    		prompt.generate();
    		System.out.println("ELIZA: Do you want to run the session again?");
            again = scan.nextLine();
           
            
            if(again.equalsIgnoreCase("no")){
                System.out.println("ELIZA: Goodbye, until next time");
              
                
            }
            while(!again.equalsIgnoreCase("no") && !again.equalsIgnoreCase("yes")){
                System.out.println("ELIZA: Invalid answer please enter yes or no..");
                System.out.println("ELIZA: Do you want to run the session again?");
                again = scan.nextLine();
            }
	    }
	}
}

