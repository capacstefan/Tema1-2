	package Produs;
	/**
	 * @author Capac Stefan
	 */
	public class Container {
		/**
		 * Campuri
		 */
		private Produs[] produse;
		private int id;
		
		/**
		 * Constructor default
		 */
		public Container() {
			id=0;
			produse=new Produs[10];
		}
		/**
		 * Constructor parametrizabil
		 * @param id
		 * @param size
		 */
		public Container(int id, int size) {
			this.id = id;
			produse = new Produs[size];
		}
		/**
		 * Afisare container Id + produse
		 */
		@Override
		public String toString() {
		    StringBuilder prod = new StringBuilder();
		    prod.append("ID: ").append(id).append("\n");
		    for (Produs produs : produse) {
		        if (produs != null) {
		            prod.append(produs.toString()).append("\n");
		        }
		    }
		    if(prod.length()>0)
		    	return prod.toString();
		    return "Nu exista produse";
		    
		}
		/**
		 * stergere produs
		 * @param numeProdus
		 */
		public void delProdus(String numeProdus) {
			int sters = 0;
			for(int i=0; i<produse.length; i++) {
				if(produse[i]!=null && produse[i].getNume().equals(numeProdus)) {
					for(int j=i; j<produse.length-1; j++)
						produse[j] = produse[j+1];
					produse[produse.length -1] = null;
					sters = 1;
					break;
				}
			}
			if (sters==0)
				System.out.println("Produs invalid");
		}
		/**
		 * adaugare produs
		 * @param produs
		 */
		public void addProdus(Produs produs) {
			for(int i=0; i<produse.length; i++)
				if(produse[i]==null) {
					produse[i] = produs;
					return;
				}
			System.out.println("Spatiu epuizat");
		}
		/**
		 * modificare cantitate produs
		 * @param container
		 * @param numeProdus
		 * @param cant
		 */
		 public static void modifCantProdus(Container container, String numeProdus, int cant) {
		        int set = 0;
		        for (Produs produs : container.produse) {
		            if (produs != null && produs.getNume().equals(numeProdus)) {
		                produs.setCantitate(cant);
		                set = 1;
		                break;
		            }
		        }
		        if (set == 0)
		            System.out.println("Produs invalid");
		 }
		 
		 /**
		  * getter produse
		  * @return
		  */
		 public Produs[] getProduse() {
			 return produse;
		 }
		 /**
		  * getter id
		  * @return
		  */
		 public int getId() {
			 return id;
		 }
		
		
		
	}
