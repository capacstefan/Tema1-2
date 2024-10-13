package nrComplex;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NrComplexTest {
	private NrComplex a;
	private NrComplex b;
	
	@BeforeEach
	 public void setUp() {
		a= new NrComplex(2,6);
		b= new NrComplex(3,2);
	}
	
	@Test
	public void afisareTest() {
		String corect = "2.0 + 6.0i";
		assertEquals(corect,a.toString());
	}
	
	@Test
	public void modultest() {
		assertEquals(6.708203932499369,a.modul());
	}
	
	@Test
	public void sumaTest() {
		NrComplex c = new NrComplex(6,8);
		assertEquals(c,a.suma(b));
	}
	
	@Test
	public void produstest() {
		NrComplex c = new NrComplex(-3,24);
		assertEquals(c,a.produs(b));
	}
}
