import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Alphabetizer extends ListManager{
	private ArrayList<String> ALPHABETIZEDLIST = new ArrayList<String>();
	
	public Alphabetizer(ArrayList<String> ALPHABETIZEDLIST){
		this.ALPHABETIZEDLIST = ALPHABETIZEDLIST;
	}
	
	public void sortList(){
		Collections.sort(ALPHABETIZEDLIST, new Comparator<String>() {
		    @Override
		    public int compare(String o1, String o2) {              
		        return o1.compareToIgnoreCase(o2);
		    }
		});
	}
	
	public void printToFile(){
		Scanner scan = new Scanner(System.in);
		String userResponse;
		
		System.out.println("Enter the name of the file to write to:");
		userResponse = scan.nextLine();
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userResponse))) {
			String content = "This is the content to write into file\n";
			
			for(int i = 0; i < ALPHABETIZEDLIST.size(); i++){
				bufferedWriter.write(ALPHABETIZEDLIST.get(i) + "\n");
			}
		} catch (IOException e) {

			e.printStackTrace();

		}
	}
	
	public void printList(){
		for(int i = 0; i < ALPHABETIZEDLIST.size(); i++){
			System.out.println(ALPHABETIZEDLIST.get(i));
		}
	}
}
