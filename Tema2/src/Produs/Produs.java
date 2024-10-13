package Produs;
/**
 * @author Capac Stefan
 */
public class Produs {
	/**
	 * Campuri
	 */
	private String nume;
	private float pret;
	private int cantitate;
	
	/**
	 * Constructor implicit
	 */
	public Produs() {}
	
	/**
	 * Constructor parametrizabil
	 * @param n
	 * @param p
	 * @param c
	 */
	public Produs(String n, float p, int c) {
		this.nume=n;
		this.pret=p;
		this.cantitate=c;
	}
	/**
	 * Afisare produs
	 */
	@Override
	public String toString() {
		return "Produs: " + nume + ", pret: " + pret + ", cantitate: " + cantitate;
	}
	
	/**
	 * getter nume
	 * @return
	 */
	public String getNume() {
		return this.nume;
	}
	/**
	 * getter cantitate
	 * @return
	 */
	public int getCantitate() {
		return cantitate;
	}
	/** 
	 * getter pret
	 * @return
	 */
	public float getPret() {
		return pret;
	}
	/**
	 * setter cantitate
	 * @param cant
	 */
	public void setCantitate(int cant) {
		this.cantitate = cant;
	}



	
}
