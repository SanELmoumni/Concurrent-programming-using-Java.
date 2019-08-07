
public class Chargeur extends Thread {
	
	/* Comme réponse à la question 4, pour réaliser 
	 * une opération d'attente, il s'uffit d'appeler 
	 * la primitif wait() en fixant un temps ou sleep()
	 * Les plus convenable dans ce cas c'est le wait, 
	 * c'est la primitif que j'ai utilisé, voir la classe Chariot.
	 */
	
	MdseStock chargeurStock;
	Chariot chariot;

	public Chargeur(MdseStock st, Chariot c) {
		chargeurStock = st;
		chariot = c;
	}
	
	public void run() {
		try{
			chariot.charger(chargeurStock);
			wait();
		}
		catch(Exception e) {System.out.println("Exception apres le wait de chargement du chariot !");	}
	}

}
	
	
