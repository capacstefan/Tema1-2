package mobila;
/**
 * @author Capac Stefan
 */
public class Main {
	
	/**
	 * Metoda pt cel mai ieftin magazin
	 * @param tablou
	 * @return
	 */
	public static String magazinIeftin(Magazin[] tablou) {
		
		String magIeftin=null;
		float pretIeftin=Float.MAX_VALUE;
		/**
		 * parcurgere tablou obiecte magazin
		 */
		for(int i=0;i<tablou.length;i++) 
			if(tablou[i]!=null) {
				float pretTotal = 0;
				int mobile=tablou[i].getMobila().length;
				/**
				 * parcurgere mobile aferente magazin pentru calcularea pretului total
				 */
				for(int j=0;j<mobile;j++) 
					if(tablou[i].getMobila()[j] != null)
						pretTotal+= tablou[i].getMobila()[j].getPret();
				/**
				 * update pret minim si nume magazin aferent
				 */
				if( mobile>0 && pretTotal/mobile < pretIeftin) {
					pretIeftin = pretTotal/mobile;
					magIeftin = tablou[i].getNume();
				}
			}
		/**
		 * returnare nume magazin cu pret minim
		 */
		return magIeftin;
			
	}
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * intializare tablou obiecte Magazin
		 */
		Magazin[] tablou = new Magazin[5];
		
		/**
		 * construire obiecte in tablou
		 */
		tablou[0] = new Magazin("m1","Str Florilor nr1",20);
		tablou[1] = new Magazin("m2","Str Frunzelor nr2",20);
		tablou[2] = new Magazin("m3","Str Merelor nr3",20);
		
		/**
		 * adaugare obiecte tip mobila in fiecare obiect magazin
		 */
		tablou[0].addMobila(new Mobila("Scaun","Rezistent","Lemn",30,30,60,60));
		tablou[0].addMobila(new Mobila("Masa","Solida","Lemn",70,60,60,120));
		
		tablou[1].addMobila(new Mobila("Scaun","Rezistent","Lemn",30,30,60,39));
		tablou[1].addMobila(new Mobila("Masa","Solida si robusta","Lemn",70,60,60,105));
		
		tablou[2].addMobila(new Mobila("Scaun","Rezistent si lucios","Lemn",30,30,60,80));
		tablou[2].addMobila(new Mobila("Sifonier","Incapatoar si si rezistent lacuit si lucios","Lemn",70,100,200,340));
		
		/**
		 * Print nume cel mai ieftin magazin
		 */
		System.out.println(magazinIeftin(tablou));
		
		/**
		 * Print nr magazine ce contin cuvinte specifice
		 */
		String[] cuvinte= {"rezistent","lucios"};
		System.out.println(tablou[2].nrMobilaCuvinte(cuvinte));
		
		
	}
	
	
	
	
}
