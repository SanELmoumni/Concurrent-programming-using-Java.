
public class Main {

	public static void main(String[] args) {
		MdseStock monStock = new MdseStock();	
		//Remplissage du stock !
		for(int i=0; i<10; i++) {
			MdseObjet obj = new MdseObjet();
			monStock.remplir(obj);
		}
		
		//Affichage du stock rempli !
		System.out.println("Mon Stock et ses objets : ");
		monStock.afficher();		
		Chariot monchariot =new Chariot(1000);
		Chargeur monChargeur = new Chargeur(monStock, monchariot);
		System.out.println();System.out.println();
		System.out.println("Taille du chariot avant chargement : "+monchariot.marchandise.size());
		
		monChargeur.start();
		try {
			monChargeur.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();System.out.println();
		System.out.println("Taille du chariot apres chargement : "+monchariot.marchandise.size());
		System.out.println("Mon chariot contient : ");
		
		for(int k=0;k<monchariot.marchandise.size();k++)
			System.out.println("Objet : "+k+ " Poids : "+monchariot.marchandise.get(k).getPoids());
		
		System.out.println(); System.out.println();
		System.out.println("Mon Stock de taille : "+monStock.stock.size() +" après chargement et ses objets : ");
		monStock.afficher();
		
		
		System.out.println("Dechargement en cours ...");
		Dechargeur monDechargeur = new Dechargeur(monchariot);
		
		monDechargeur.start();
		try {
			monDechargeur.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println();System.out.println();
		System.out.println("Taille du chariot apres Déchargement : "+monchariot.marchandise.size());
		System.out.println("Mon chariot contient : ");
		
		for(int k=0;k<monchariot.marchandise.size();k++)
			System.out.println("Objet : "+k+ " Poids : "+monchariot.marchandise.get(k).getPoids());

		
	}

}
