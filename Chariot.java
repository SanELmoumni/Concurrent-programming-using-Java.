import java.util.*;

public class Chariot {	
	int capaciteMax;
	public ArrayList<MdseObjet> marchandise;
	//MdseStock sstock;
	
	
	public Chariot(int n) {
		capaciteMax = n;
		marchandise = new ArrayList<MdseObjet>();

	}
	
	public void charger(MdseStock chargeurStock) {
		int poidsTotal=0;
		
		while(!chargeurStock.estVide()) {
			poidsTotal += chargeurStock.stock.get(0).poids;
			(this.marchandise).add(chargeurStock.extraire());

			if(poidsTotal >= capaciteMax) {
				System.out.println("Poids maximal du chariot atteint ! Attente de déchargement. ");
				throw new NullPointerException("demo"); 
			}
		}
	}
	
	public void decharger(Dechargeur dechargeur) {
		
		while(marchandise.size() != 0) {
			dechargeur.stockDecharge.add(marchandise.get(0));
			marchandise.remove(0);		
		}
		
		
	}
	
	/* Cette methode main est juste pour le test et le débogage manuel pour realiser charger et décharger.
	public static void main(String[] args) {
		MdseStock monStock = new MdseStock();	
		
		
		//Remplissage du stock !
		for(int i=0; i<10; i++) {
			MdseObjet obj = new MdseObjet();
			monStock.remplir(obj);
		}
		
		Chariot monchariot =new Chariot(10000);
		System.out.println("Size du chariot avant chargement "+monchariot.marchandise.size());
		monchariot.charger(monStock);
		System.out.println("Size du chariot apres chargement : "+monchariot.marchandise.size());
		for(int k=0;k<monchariot.marchandise.size(); k++) {

			System.out.println(monchariot.marchandise.get(k).poids);
		}
		Dechargeur decharg = new Dechargeur(monchariot);
		
		monchariot.decharger(decharg);
		System.out.println("Size du chariot apres DEhargement : "+monchariot.marchandise.size());
		for(int k=0;k<monchariot.marchandise.size(); k++) {

			System.out.println(monchariot.marchandise.get(k).poids);
		}
		
	}
	*/
	
	
	
	
	
}
