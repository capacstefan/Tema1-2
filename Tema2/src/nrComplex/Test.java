package nrComplex;
/**
 * @author Capac Stefan
 */
public class Test {
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Creare nr complex;
		 */
		NrComplex a = new NrComplex(3,6);
		NrComplex b = new NrComplex(3,2);
		/**
		 * Afisare nr complex
		 */
		System.out.println("a: " + a.toString());
		System.out.println("b: " + b.toString());
		/**
		 * Afisare Modul nr complex
		 */
		System.out.println("Modul a: " + a.modul());
		/**
		 * Afisare Suma nr complexe
		 */
		System.out.println("Suma a+b: " + a.suma(b).toString());
		/** 
		 * Afisare Produs nr complexe 
		 */
		System.out.println("Produs a*b: " + a.produs(b).toString());
		
	}

}
