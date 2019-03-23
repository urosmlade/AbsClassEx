package test;

public class DrugaKlasa extends AbsKlasa {
	
	//promenljive
	private int dk1;
	private int dk2;
	
	
	
	public DrugaKlasa(int dk1, int dk2) { //konstruktor 
		super();
		this.dk1 = dk1;
		this.dk2 = dk2;
	}
	

	@Override
	public int absMetoda() { //metoda koja je override iz apstraktne klase
		return dk1-dk2;		
	}
	
	public int dkMetoda() { //metoda koja je napravljena za ovu klasu
		return super.neAbsMetoda(dk1, dk2);	// i u njoj se poziva metoda apstraktne klase koja je implementirana u AbsKlasa jer se svugde isto radi.
	}										//Poziva se koriscenjem reci super.imeMetode(parametri koje uzima).Posto je tamo receno da uzima dva integera i mnozi ih
											//ovde cemo proslediti integere sa pocetka klase

	
	// get i set metode za promenljive
	public int getDk1() {
		return dk1;
	}
	public void setDk1(int dk1) {
		this.dk1 = dk1;
	}
	public int getDk2() {
		return dk2;
	}
	public void setDk2(int dk2) {
		this.dk2 = dk2;
	}




}
