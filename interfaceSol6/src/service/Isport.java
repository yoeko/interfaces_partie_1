package service;

public interface Isport {
	
	default void courir() {
		System.out.println("Je sais courir");
	}
	
	default void nager() {
		System.out.println("Je sais nager");
	}
	
	default void pedaler() {
		System.out.println(" Je sais pedaler");
	}
	
	default void grimper() {
		System.out.println(" Je sais pedaler");
	}

}
