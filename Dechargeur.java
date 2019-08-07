import java.util.ArrayList;

public class Dechargeur extends Thread{
	
	ArrayList<MdseObjet> stockDecharge;
	Chariot chariot;
	
	public Dechargeur(Chariot c) {
		stockDecharge = new ArrayList<MdseObjet>();
		chariot = c;
	}
	
	public void run() {
		synchronized(this) {
			chariot.decharger(this);		
			notify();
		}

	}

}
