package metier;

import service.Isport;

public class Personne implements Isport {
	
	public void nager() {
		System.out.println("Je suis dans l'eau");
	}
	
	public void courrir() {
		System.out.println("Je suis sur la terre");
	} 

}
