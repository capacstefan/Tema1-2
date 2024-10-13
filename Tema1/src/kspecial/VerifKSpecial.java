package kspecial;

import java.util.Scanner;

public class VerifKSpecial {
	
	public static boolean verif(String sir) { 
		if(sir.charAt(0)=='0') // prima cifra 0 => nu este k-special
			return false;
		for(int i=1;i<sir.length()-1;i++) 
			if(sir.charAt(i)=='0'&&sir.charAt(i+1)=='0') // din parcurgere se verifica daca se gasesc mai mult de un 0 
				for(int j=i+2;j<sir.length();j++)
					if(sir.charAt(j)=='1') // verificare daca sirul de 0 este urmat de 1
						return false;
		return true;	
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String sir=scan.nextLine();
		if(verif(sir))
			System.out.println("Yes"); // interpretare rezultat boolean
		else
			System.out.println("No");
		
	}
}
