import java.util.ArrayList;
import java.util.Arrays;

public class Circulator extends ListManager{
	ArrayList<String> LISTOFLINES = new ArrayList<String>();
	ArrayList<String> CIRCULATEDLIST = new ArrayList<String>();
	
	public Circulator(ArrayList<String> LISTOFLINES){
		this.LISTOFLINES = LISTOFLINES;
	}
	
	public void circulatedList(){
		for(int i = 0; i < LISTOFLINES.size(); i++){
			String[] seperatedList = LISTOFLINES.get(i).split(" ");
			String wordHolder;
			for(int j = 0; j < seperatedList.length; j++){
				CIRCULATEDLIST.add(Arrays.toString(seperatedList));
				wordHolder = seperatedList[0];
				for(int k = 0; k < seperatedList.length-1; k++){
					seperatedList[k] = seperatedList[k+1];
				}
				seperatedList[seperatedList.length-1] = wordHolder;
			}
		}
		
		for(int l = 0; l < CIRCULATEDLIST.size(); l++){
			String oldString = CIRCULATEDLIST.get(l);
			String newString = oldString.substring(1, oldString.length()-1).replaceAll(",", "");
			CIRCULATEDLIST.set(l, newString);
		}
	}
	
	public ArrayList<String> getFileArray(){
		return CIRCULATEDLIST;
	}
	
	public void printList(){
		for(int i = 0; i < CIRCULATEDLIST.size(); i++){
			System.out.println(CIRCULATEDLIST.get(i));
		}
	}
}