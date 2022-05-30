package bank_Account;

public class CreditAccount extends Account{

	
	
	
	
	public CreditAccount(int kontostand) {
		super(kontostand);
	}

	
	
	public void einzahlen(int geldbetrag)throws ExceptionLimit {
	
		if (this.getKontostand()>0 && getKontostand()>=geldbetrag) {
			setKontostand(getKontostand()-geldbetrag);
		
		} else{
			throw new ExceptionLimit("Zahlung übersteigt Kredit");
		}
	
		
		
		
		
	}
	

	
}
