package nrComplex;
/**
 * @author Capac Stefan
 */
public class NrComplex {
	/**
	 * Campuri
	 */
	private double re;
	private	double im;
	/**
	 * Constructor implicit
	 */
	public NrComplex() {}
	/**
	 * Constructor parametrizabil
	 * @param r
	 * @param i
	 */
	public NrComplex(double r, double i) {
		re=r;
		im=i;
	}
	/**
	 * Metoda convertire string pt afisare
	 */
	public String toString() {
		 return re+(im<0?" - ":" + ")+Math.abs(im)+"i";
	}
	/**
	 * Metoda modul
	 * @return
	 */
	public double modul() {
		return Math.sqrt(re*re + im*im);
	}
	/**
	 * Metoda suma
	 * @param a
	 * @return
	 */
	public NrComplex suma(NrComplex a) {
		double sumre= this.re+a.re;
		double sumim= this.im+a.im;	
		return new NrComplex(sumre,sumim);
	}
	/**
	 * Metoda produs
	 * @param a
	 * @return
	 */
	public NrComplex produs(NrComplex a) {
		double prodre= this.re*a.re + this.im*a.im*(-1);
		double prodim= this.re*a.im + a.re*this.im;
		return new NrComplex(prodre,prodim);
	}
	
}
