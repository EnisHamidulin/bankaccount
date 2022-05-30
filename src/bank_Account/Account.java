package bank_Account;


public  abstract class Account {
	 
	static int nextID=1;
	private int kontostand;
	private final int kontonummer;
	 
	
	 
	 
	 public static int getNextID() {
		return nextID;
	}


	public Account(int kontostand) {
			this.kontostand = kontostand;
			kontonummer=nextID++;
		}

	 
	
	 
	 

	


	public int getKontostand() {
		return kontostand;
	}


	public void setKontostand(int kontostand) {
		this.kontostand = kontostand;
	}


	

	
	


	

	public String toString() {
		return "Kontostand "+kontostand + "in Cent "+"vom Konto :"+nextID;
		
		
	}


	public int getKontonummer() {
		return kontonummer;
	}


	
	
}
