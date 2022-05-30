package bank_Account;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int kontostand) {
		super(kontostand);
	}
	
	
	public void auszahlen(int geldbetrag) throws ExceptionLimit {
		
		
		
		if ((getKontostand()-geldbetrag)<0) {
			
			throw new ExceptionLimit("Kontostand ist kleiner als Null");
		}else {
			
			setKontostand(getKontostand()-geldbetrag);
			
		}
	}
		public void einzahlen(int geldbetrag) {
			if (geldbetrag >0 ) {
				setKontostand(getKontostand()+geldbetrag);
			}
	}
	
	
}

