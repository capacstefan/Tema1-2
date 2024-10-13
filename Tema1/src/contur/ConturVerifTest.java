package contur;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ConturVerifTest {
	
	@Test
	public void testconvertire() {
		
		int[][] a={{100, 100, 100, 100},{100, 150, 100, 100},{100, 100, 200, 100},{100, 100, 100, 100}};
		int[][]	b=ConturVerif.convertire("[[100,100,100,100],[100,150,100,100],[100,100,200,100],[100,100,100,100]]");
		assertArrayEquals(a,b);
	}
	
	@Test
	public void testcontur() {
		int[][] a={{100, 100, 100, 100},{100, 150, 100, 100},{100, 100, 200, 100},{100, 100, 100, 100}};
		assertEquals(1,ConturVerif.verif(a));
	}
}
