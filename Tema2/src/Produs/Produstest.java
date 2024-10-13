package Produs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Produstest {
	private Produs produs;
	
	@BeforeEach
    public void setUp() {
        produs = new Produs("Mere", 2.5f, 10);
    }

    @Test
    public void testGetNume() {
        assertEquals("Mere", produs.getNume());
    }

    @Test
    public void testGetPret() {
        assertEquals(2.5f, produs.getPret());
    }

    @Test
    public void testGetCantitate() {
        assertEquals(10, produs.getCantitate());
    }

    @Test
    public void testSetCantitate() {
        produs.setCantitate(15);
        assertEquals(15, produs.getCantitate());
    }

    @Test
    public void testToString() {
        String corect = "Produs: Mere, pret: 2.5, cantitate: 10";
        assertEquals(corect, produs.toString());
    }

}
