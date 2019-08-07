import java.util.Random;

public class MdseObjet {
	
	int poids;
	
	public MdseObjet() {
		Random r = new Random(); 
		poids = r.nextInt(30)+1; //Poids entre 1 et 31
	}
	
	public int getPoids() {
		return poids;
	}
	public void setPoids(int p) {
		poids = p;
	}
	

}
