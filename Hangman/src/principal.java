import java.util.Arrays;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		System.out.println("Bun venit la Hangman");
		
		Scanner input_luat = new Scanner(System.in);
		String input = "0";

		GenerareCuvant cuvant = new GenerareCuvant();
		cuvant.afisare_cuvant();
		System.out.println("");
		
		System.out.println("Aveti "+ cuvant.cuvant_returnat.length() + " incercari");

		String[] arie_creata = new String[cuvant.cuvant_returnat.length()];
		String[] arie_cuvant_returnat = new String[cuvant.cuvant_returnat.length()];
		
		 for (int z=0;z<cuvant.cuvant_returnat.length();z++){
			 arie_creata[z]="_";
			}
		
		 for (int x=0;x<cuvant.cuvant_returnat.length();x++){
			 arie_cuvant_returnat[x]=Character.toString(cuvant.cuvant_returnat.charAt(x));
			}
		 
		 System.out.println(Arrays.toString(arie_creata));
		 System.out.println();
		 
		 outerloop:
		for (int i = 0; i < cuvant.cuvant_returnat.length(); i++) {
			if (input == "0") {

				System.out.println("Introdu litera: ");
				input = input_luat.nextLine();
				cuvant.afisare_linii_litere(input, arie_creata);
				System.out.println(Arrays.toString(cuvant.afisare_linii_litere(input, arie_creata)));
				
				
			} else if (cuvant.cuvant_returnat.contains(input) == false) {
				
				System.out.println("Introdu doar o litera (nu cifra): ");
				input = input_luat.nextLine();
				System.out.println(Arrays.toString(cuvant.afisare_linii_litere(input, arie_creata)));
				if(Arrays.equals(arie_creata, arie_cuvant_returnat)){
					break outerloop;
				}
				
			} else {
				
				System.out.println("Introdu litera: ");
				input = input_luat.nextLine();
				cuvant.afisare_linii_litere(input, arie_creata);
				System.out.println(Arrays.toString(cuvant.afisare_linii_litere(input, arie_creata)));
				if(Arrays.equals(arie_creata, arie_cuvant_returnat)){
					break outerloop;
				}
			}
			
		}
		 if(Arrays.equals(arie_creata, arie_cuvant_returnat)){
			 	System.out.println();
			 	System.out.println();
				System.out.println("FOARTE BINE");
			}else{
				System.out.println();
				System.out.println();
				System.out.println("Incearca alt cuvant");
			}
	}

	// }

	/*
	 * if (cuvant.cuvant_returnat.contains(input.input)){ int index =
	 * cuvant.cuvant_returnat.indexOf(input.input); System.out.println(index);
	 * }else{ input.luat_input(); System.out.println("NU MERGE"); }
	 */
}