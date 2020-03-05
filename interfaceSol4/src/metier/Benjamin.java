package metier;

import sercice.Ijeu;
import sercice.Isport;

public class Benjamin implements Isport, Ijeu {
	
	public void courir() {
		System.out.println("Je sais courir");
	}
	
	public void nager() {
		System.out.println("Je sais bien nager");
	}
	
	public void jouer() {
		System.out.println("J'aime jouer");
	}

}
