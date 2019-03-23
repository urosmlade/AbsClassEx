package test;

public class Main {

	public static void main(String[] args) {
		PrvaKlasa pk = new PrvaKlasa(10, 10);
		DrugaKlasa dk = new DrugaKlasa(20, 20);
		
		System.out.println("Prva klasa, apstraktna metoda: " + pk.absMetoda());
		System.out.println("Prva klasa, ne apstraktna metoda: " + pk.pkMetoda());
		
		System.out.println("Druga klasa, apstraktna metoda: " + dk.absMetoda());
		System.out.println("Druga klasa, ne apstraktna metoda: " + dk.dkMetoda());
		
	}
}
