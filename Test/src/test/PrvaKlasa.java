package test;

public class PrvaKlasa extends AbsKlasa{
	//promenljive
	private int pk1; 
	private int pk2; 
	
	
	
	public PrvaKlasa(int pk1, int pk2) { //konstruktor 
		this.pk1 = pk1;
		this.pk2 = pk2;
	}
	
	
	@Override
	public int absMetoda() { //metoda koja je override iz apstraktne klase 
		return pk1+pk2;
	}
	
	
	public int pkMetoda() { //metoda koja je napravljena za ovu klasu
		return super.neAbsMetoda(pk1, pk2); // i u njoj se poziva metoda apstraktne klase koja je implementirana u AbsKlasa jer se svugde isto radi.
	}										//Poziva se koriscenjem reci super.imeMetode(parametri koje uzima).Posto je tamo receno da uzima dva integera i mnozi ih
											//ovde cemo proslediti integere sa pocetka klase
	
	
	
	//get i set metode za promenljive
	public int getPk1() {
		return pk1;
	}
	public void setPk1(int pk1) {
		this.pk1 = pk1;
	}
	public int getPk2() {
		return pk2;
	}
	public void setPk2(int pk2) {
		this.pk2 = pk2;
	}
}
