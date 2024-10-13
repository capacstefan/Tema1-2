package Produs;
/**
 * @author Capac Stefan
 */
public class Main {
	
	/**
	 * Pret total produse
	 * @param container
	 * @return
	 */
	public static float pretTotal(Container container) {
		Produs[] prod = container.getProduse();
		float pretTotal = 0;
		for(Produs produs : prod)
			if(produs!= null)
				pretTotal+= produs.getPret()*produs.getCantitate();
		return pretTotal;
	}
			
		
	/**
	 * Main	
	 * @param args
	 */
	public static void main(String[] args) {
		Container container1 = new Container(1, 20);
		
		Produs p1 = new Produs("Carte", (float)10.5, 20);
		Produs p2 = new Produs("Pix", 2, 50);
		Produs p3 = new Produs("Suc", (float)4.5, 40);
		container1.addProdus(p1);
		container1.addProdus(p2);
		container1.addProdus(p3);
		
		container1.delProdus("Suc");
		
		String numeProdus = args[0];
		int cantitateProdus = Integer.parseInt(args[1]);
		Container.modifCantProdus(container1, numeProdus, cantitateProdus);
		
		float pretTotal = pretTotal(container1);
		/**
		 * Print pret total
		 */
		System.out.println("Pret total produse din container id " + container1.getId() + ": " + pretTotal + "\n");
		
		Container container2 = new Container(2,20);
		Produs p4 = new Produs("Biscuiti", 4, 40);
		container2.addProdus(p4);
		
		Container[] tablou = new Container[5];
		tablou[0]= container1;
		tablou[1]= container2;
		
		/**
		 * Print tablou containere
		 */
		for(int i=0;i<tablou.length;i++) {
			if(tablou[i] != null)
				System.out.println(tablou[i].toString());
		}
		
		


	}

}
