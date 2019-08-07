import java.util.*;

public class MdseStock {
	
	ArrayList<MdseObjet> stock;
	
	public MdseStock () {
		stock = new ArrayList<MdseObjet>();
	}

	public boolean estVide() {
		return stock.size() == 0;
	}
	
	public void remplir(MdseObjet e) {
		stock.add(e);
	}
	
	public MdseObjet extraire() {
		try {
			if(!estVide()) {
				MdseObjet vretour = stock.get(0);
				stock.remove(0);
				return vretour;
			}
			else {
				throw new Exception("Stock vide !");
				}
		}
		catch(Exception e) {
			System.out.println("STOCK VIDE !");
			return null;
		}
						
	}
	
	public void afficher() {
		for(int i=0;i<stock.size();i++) {
			System.out.println("Objet " +i+ " Poids : "+stock.get(i).poids );
		}
	}
	
									//TEEESSTTT
	
	public static void main(String[] args) {
		MdseStock mds = new MdseStock();		
		
		for(int i=0; i<10; i++) {
			MdseObjet obj = new MdseObjet();
			mds.remplir(obj);
		}
		
		mds.afficher();
		MdseObjet o = mds.extraire();
		mds.afficher();
		System.out.println("l'element extrait : "+o.poids);
		
	}
	
	
}
