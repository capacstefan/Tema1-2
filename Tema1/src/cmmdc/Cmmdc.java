package cmmdc;

public class Cmmdc {

	public static int cmmdc(int a,int b) {
		while(b!=0) { // Euclid
			int temp=b%a;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
	public static void main(String[] args) {

		int a= Integer.parseInt(args[0]); 
		int b= Integer.parseInt(args[1]);
		int rez= cmmdc(a,b); // apel functie
		
		System.out.println(rez); // print la rez
	}

}
