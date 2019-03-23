package test;

public abstract class AbsKlasa {

	//apstraktna klasa jer ima rec abstract
	
	public abstract int absMetoda(); // apstraktna metoda koja se drugacije implementira u zavisnosti u kojoj klasi se nalazi. Ovde se pise njena deklaracija.
	
	public int neAbsMetoda(int a, int b) { //ovo nije apstraktna metoda. Kao i prethodna ona je tipa int i vraca tu vrednost. Uzima dva int i njih mnozi. Posto se 
		return a*b;						   //ovo radi isto u svakoj klasi ovde je uradjena njena implementacija.
	}
}
