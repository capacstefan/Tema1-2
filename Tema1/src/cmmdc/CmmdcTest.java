package cmmdc;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CmmdcTest {

	@Test
	public void testCmmdc() {
		assertEquals(4,Cmmdc.cmmdc(12, 4));
	}
}
