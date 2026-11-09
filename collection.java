package tp7;
public class collection {
	public static void main(String[] args) {
		Utensile[] us = new Utensile[5];
		us[0] = new Assietteronde(1926, 8.4);
		us[1] = new cuillere(1881, 7.3); 
		us[2]= new Assiettecarree(1935, 5.6); 
		us[3]= new cuillere(1917 , 5.6);
		us[4] = new Assietteronde(1837, 5.4);
		afficherCuilleres(us);
		afficherSurfaceAssiettes(us);
		afficherValeurTotale(us);
		}
	static void afficherCuilleres(Utensile[] us) {
		int nbCuilleres = 0;
		for (int i = 0; i<us.length; i++) {
		       if (us[i] instanceof cuillere) {
		    	   nbCuilleres++;
		        }
		    }
		}
		System.out.println("Il y a " + nbCuilleres + " cuillères.");
	
	static void afficherSurfaceAssiettes(Utensile[] us) {
		double somme = 0;
		for (int i = 0; i<us.length; i++) {
	        if (us[i] instanceof Assiette) {
	            somme = somme + ((Assiette) us[i]).calculerSurface();
	        }
	    }
		}
		System.out.println("Surface totale des assiettes :" + somme);
}
	static void afficherValeurTotale(Utensile[] us) {
		double somme = 0;
		for (int i = 0; i<us.length; i++) {
			somme = somme + us[i].calculerValeur();
		}
		System.out.println("Valeur totale de la collection :" + somme);
}
		}
