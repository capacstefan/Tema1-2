package Produs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ContainerTest {
    private Container container;

    @BeforeEach
    public void setUp() {
        container = new Container(1, 5);
        container.addProdus(new Produs("Lapte", 3, 20));
        container.addProdus(new Produs("Cereale", 12, 70));
    }

    @Test
    public void addTest() {
        Produs p = new Produs("Lingura", 2, 40);
        container.addProdus(p);
        assertEquals(3, nrProd(container.getProduse())); 
    }

    @Test
    public void delTest() {
        container.delProdus("Lapte");
        assertEquals(1, nrProd(container.getProduse())); 
    }

    @Test
    public void modifTest() {
        Container.modifCantProdus(container, "Lapte", 1);
        assertEquals(1, container.getProduse()[0].getCantitate()); 
    }

    @Test
    public void toStringTest() {
        String correct = "ID: 1\nProdus: Lapte, pret: 3.0, cantitate: 20\nProdus: Cereale, pret: 12.0, cantitate: 70\n";
        assertEquals(correct, container.toString());
    }
    private int nrProd(Produs[] produse) {
        int count = 0;
        for (Produs produs : produse) {
            if (produs != null) {
                count++;
            }
        }
        return count;
    }
}
