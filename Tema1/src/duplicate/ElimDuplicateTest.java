package duplicate;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ElimDuplicateTest {
	
	@Test
	public void testDuplicate1(){
		assertEquals("aba.metalica",ElimDuplicate.eliminareDuplicate("abba...metallica"));
	}

	@Test
	public void testDuplicate2(){
		assertEquals("misisipi",ElimDuplicate.eliminareDuplicate("mississippi"));
	}
	
	@Test
	public void testDuplicate3(){
		assertEquals("abcd",ElimDuplicate.eliminareDuplicate("abcd"));
	}
}
