package mobila;
/**
 * @author Capac Stefan
 */
public class Mobila {
	/**
	 * Campuri
	 */
	private String nume;
	private String descriere;
	private String material;
	float lungime;
	float latime;
	float inaltime;
	float pret;
	/**
	 * constructor neparametrizabil
	 */
	public Mobila() {}
	/**
	 * Constructor parametrizabil
	 * @param n
	 * @param d
	 * @param m
	 * @param lu
	 * @param la
	 * @param in
	 * @param p
	 */
	public Mobila(String n, String d, String m, float lu, float la, float in, float p) {
		nume=n;
		descriere=d;
		material=m;
		lungime=lu;
		latime=la;
		inaltime=in;
		pret=p;
	}
	/**
	 * metoda convertire string a obiectului pentru afisare
	 */
	public String toString() {
		return("Mobila: " + nume + "\n" +
			   "Descriere: " + descriere + "\n" +
			   "Material : " + material + "\n" +
			   "Dimensiuni: " + lungime + "-" + latime + "-" + inaltime + "\n" + 
			   "Pret: " + pret + "\n");
	}
	/** 
	 * metoda getter  parametru pret
	 * @return
	 */
	public float getPret() {
		return pret;
	}
	/**
	 * metoda getter parametru descriere
	 * @return
	 */
	public String getDesc() {
		return descriere;
	}
	/**
	 * metoda verificare continere cuvinte specifice
	 * @param cuvinte
	 * @return
	 */
	public boolean contineCuvinte(String[] cuvinte) {
		for(String cuvant:cuvinte) {
			if(!descriere.toLowerCase().contains(cuvant.toLowerCase()))
				return false;
		}
		return true;
	}
}
