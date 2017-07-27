import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String userResponse;
		
		System.out.println("Welcome to JAVA KWIC");
		System.out.println("Would you like to read from a file (Y/N)?");
		userResponse = scan.nextLine();
		
		if(userResponse.equals("Y")){
			System.out.println("Enter the name of the file to read in:");
			userResponse = scan.nextLine();
			
			OpenFile openFile = new OpenFile("ExampleInput.txt");
			System.out.println("Reading file...");
			openFile.readFile();
			Circulator circulator = new Circulator(openFile.getFileArray());
			System.out.println("Circulating list...");
			circulator.circulatedList();
			Alphabetizer alphabetizer = new Alphabetizer(circulator.getFileArray());
			System.out.println("Alphabetizing list...");
			alphabetizer.sortList();
			
			System.out.println("Would you like to write the output to a file (Y/N?)");
			userResponse = scan.nextLine();
			
			if(userResponse.equals("Y")){
				alphabetizer.printToFile();
				System.out.println("Printing list to file...");
			}else{
				System.out.println("Printing list...");
				alphabetizer.printList();
			}
		}else{
			ConsoleInput consoleInput = new ConsoleInput();
			Circulator circulator = new Circulator(consoleInput.userInput());
			System.out.println("Circulating list...");
			circulator.circulatedList();
			Alphabetizer alphabetizer = new Alphabetizer(circulator.getFileArray());
			System.out.println("Alphabetizing list...");
			alphabetizer.sortList();
			
			System.out.println("Would you like to write the output to a file (Y/N?)");
			userResponse = scan.nextLine();
			
			if(userResponse.equals("Y")){
				alphabetizer.printToFile();
				System.out.println("Printing list to file...");
			}else{
				System.out.println("Printing list...");
				alphabetizer.printList();
			}
		}
		System.out.println("Thank you for using JAVA KWIC.");
	}
}
