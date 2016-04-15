import java.util.Scanner;
public class UserData {
	
	public void aflare_index(String a, String b){
		
		int index = b.indexOf(a);
		while (index >= 0) {
		    System.out.print(index + " ");
		    index = b.indexOf(a, index + 1);
		}
		
	}	
}