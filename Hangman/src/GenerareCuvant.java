import java.util.*;
public class GenerareCuvant {

		private String cuvinte[]={"masina","televizor","autobuz","mancare","neutru","versace"};
		public String cuvant_returnat;
		private Random rn = new Random();
		public String[] matrice_linii;
		public String cuvant_modificat;
		public String cuvant_afisat= "";
		public String newName="";
		
		public String afisare_cuvant(){
			 int random = rn.nextInt(cuvinte.length);
			cuvant_returnat = cuvinte[random];
			return cuvant_returnat;	
		}
		
		public String[] afisare_linii_litere(String input, String[] arie_trebuie_creata){
			
			 String[] arie_cuvant_returnat = new String [cuvant_returnat.length()];
			 
				for (int j=0;j<cuvant_returnat.length();j++){
					arie_cuvant_returnat[j]=Character.toString(cuvant_returnat.charAt(j));
				}
				for (int k=0;k<cuvant_returnat.length();k++){
					
					if (arie_cuvant_returnat[k].equals(input)){	
						arie_trebuie_creata[k]=input;
					}
		}	
			return arie_trebuie_creata;
	}
		

}

/*	public void aflare_index(String a){

int index = cuvant_returnat.indexOf(a);
while (index >= 0) {
    System.out.print(index + " ");
    index = cuvant_returnat.indexOf(a, index + 1); 
}*/


/*		int index = cuvant_returnat.indexOf(input);
char c = cuvant_returnat.charAt(i);
char litera_index = cuvant_returnat.charAt(index); //litera din cuvant returnat



String ac = Character.toString(c); // litera din iteratie
String ad = Character.toString(litera_index); // convertire la string cuvant returnat
String litera = Character.toString(ad);



//		index = cuvant_returnat.indexOf(input, index +1);
System.out.print(index + " ");

System.out.println(cuvant_returnat.charAt(index));  


//    StringBuilder myName = new StringBuilder(cuvant_returnat);
// myName.setCharAt(index,c);

//    String myName = cuvant_afisat;
//  String newName = myName.substring(0,index)+a+myName.substring(index+); */