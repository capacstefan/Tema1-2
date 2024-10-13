package kspecial;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class VerifKSpecialTest {
	@Test
	public void testKspecial1() {
		assertEquals(true,VerifKSpecial.verif("1011000"));
	}
	
	@Test
	public void testKspecial2() {
		assertEquals(true,VerifKSpecial.verif("10"));

	}
	
	@Test
	public void testKspecial3() {
		assertEquals(false,VerifKSpecial.verif("1011001"));
	}
}
