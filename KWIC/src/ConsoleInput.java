import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleInput {
	ArrayList<String> USERINPUT = new ArrayList<String>();
	
	public ConsoleInput(){}
	
	public ArrayList<String> userInput(){
		Scanner scan = new Scanner(System.in);
		String input = " ";
		
		System.out.println("Enter each line for the array.");
		System.out.println("To stop, leave the line blank and press [Enter].");
		
		while(!input.equals("")){
			input = scan.nextLine();
			if(!input.equals("")){
				USERINPUT.add(input);
			}
		}
		
		return USERINPUT;
	}
}
