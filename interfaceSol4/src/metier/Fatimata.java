package metier;

import sercice.Imanga;
import sercice.Isport;

public class Fatimata implements Isport, Imanga {
	
	public void courir() {
		System.out.println("Je sais courir");
	}
	
	public void nager() {
		System.out.println("Je ne sais pas trop nager");
	}
	
	public void lireManga() {
		System.out.println("J'aime regarder les mangas");
	}
}
