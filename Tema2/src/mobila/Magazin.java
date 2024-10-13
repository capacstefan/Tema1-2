package mobila;
/**
 * @author Capac Stefan
 */
public class Magazin {
	/**
	 * campuri
	 */
	private String nume;
	private String adresa;
	private Mobila[] mobila;
	
	/**
	 * constructor neparametrizabil
	 */
	public Magazin() {
		String nume=null;
		String adresa=null;
		mobila = new Mobila[10];
	}
	/**
	 * constructor parametrizabil
	 * @param n
	 * @param ad
	 * @param nrProd
	 */
	public Magazin(String n, String ad, int nrProd) {
		nume=n;
		adresa=ad;
		mobila = new Mobila[nrProd];
	}
	/**
	 * metoda getter  parametru nume
	 * @return
	 */
	public String getNume() {
		return nume;
	}
	/**
	 * metoda adaugare obiect tip mobila 
	 * @param mob
	 */
	public void addMobila(Mobila mob) {
		int ok=0;
		for(int i=0;i<mobila.length;i++)
			if(mobila[i]==null) {
				mobila[i]=mob;
				ok=1;
				break;
			}
		if(ok==0)
			System.out.println("Magazin plin");
	}
	/**
	 * metoda getter parametru mobila
	 * @return
	 */
	public Mobila[] getMobila() {
		return mobila;
	}
	/**
	 * metoda obtinere numar mobile cu descriere specifica
	 * @param cuvinte
	 * @return
	 */
	public int nrMobilaCuvinte(String[] cuvinte) {
		int nr=0;
		for(int i=0;i<mobila.length;i++)
			if(mobila[i]!=null)
				if(mobila[i].contineCuvinte(cuvinte))
					nr++;
		return nr;
	}
	
	
	
	
}
