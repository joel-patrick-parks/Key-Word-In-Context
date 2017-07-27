import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OpenFile extends ListManager{
	private String FILENAME;
	ArrayList<String> FILELINES = new ArrayList<String>();;
	
	public OpenFile(String FILENAME){
		this.FILENAME = FILENAME;
	}
	
	public void readFile(){
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILENAME))){
			String currentLine;
			while((currentLine = bufferedReader.readLine()) != null){
				FILELINES.add(currentLine);
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getFileArray(){
		return FILELINES;
	}
	
	public void printList(){
		for(int i = 0; i < FILELINES.size(); i++){
			System.out.println(FILELINES.get(i));
		}
	}
}
