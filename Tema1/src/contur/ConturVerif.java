package contur;

import java.util.Scanner;

public class ConturVerif {
	
	
	public static int[][] convertire(String img) {
		img=img.replace("[[","").replace("]]","").replace("],[",".");
		String lines[]=img.split("\\.");// se obtin liniile matricii pastrand doar valorile si eliminand caracterele in plus
		int[][] imgg=new int[lines.length][];// nr de linii din matrice este nr de seturi de valori obtinute dupa split
		for(int i=0;i<lines.length;i++) {
			String[] vals=lines[i].split(",");
			imgg[i]=new int[vals.length];// nr de coloane este nr de valori din fiecare set
			for(int j=0;j<vals.length;j++)
				imgg[i][j]=Integer.parseInt(vals[j]);// se convertesc valorile la int si se adauga succesiv
		}
		return imgg;	
	}
	
	public static int verif(int[][] img) {
		int dim=0;
		int l=img.length;
		int c=img[0].length;
		int color= img[0][0]; // daca exista contur trb sa aibe aceasi culoare peste tot ca in colt
		while(dim<l/2 && dim<c/2) { // conturul poate fi maxim jumate din nr de randuri si coloane
			for(int i=0+dim;i<l-dim;i++)
				if(img[i][0]!=color || img[i][c-dim-1]!=color)// verificare coresp culoare pt fiec coloana pe rand
					return dim;
			for(int j=0+dim;j<c-dim;j++)
				if(img[0][j]!=color || img[l-dim-1][j]!=color)// verificare coresp culoare pt fiec linie pe rand
					return dim;
			dim++; // daca se ajunge aici conturul creste pt ca nu a fost identif discrepanta in culori
		}
		return dim;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);// scanner pt input de forma [[x,x,x],[x,o,x],[x,x,x]]
		String img=scan.nextLine();
		int[][] imgg= convertire(img);
		int result = verif(imgg);
		System.out.println(result);
	}
	
}
