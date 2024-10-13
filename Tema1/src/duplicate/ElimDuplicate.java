package duplicate;

import java.util.Scanner;

public class ElimDuplicate {
	
	public static String eliminareDuplicate(String text) {
		StringBuffer result=new StringBuffer(); // creare constructor de string
		for(int i=0;i<text.length();i++) {
			char letter=text.charAt(i); // parcurgere element cu element
			if(result.length()==0 || result.charAt(result.length()-1)!=letter) // se adauga litera daca este prima sau daca anterioara este diferita
				result.append(letter);
		}
		return result.toString(); // convertire in string 
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String text=scan.nextLine();
		String result=eliminareDuplicate(text); // apel functie
		System.out.println(result);
		scan.close();
	}
}
