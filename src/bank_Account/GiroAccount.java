package bank_Account;

public class GiroAccount extends Account {

	private int maxueberziehungsrahmen; 
	public GiroAccount(int kontostand, int maxueberziehungsrahmen) {
		super(kontostand);
		this.maxueberziehungsrahmen=maxueberziehungsrahmen;
		
	}
	public int getMaxueberziehungsrahmen() {
		return maxueberziehungsrahmen;
	}
	public void setMaxueberziehungsrahmen(int maxueberziehungsrahmen) {
		if (maxueberziehungsrahmen <0) {
			this.maxueberziehungsrahmen = maxueberziehungsrahmen;
		}
		
	}
	
	public  void auszahlen(int geldbetrag) throws ExceptionLimit  {
		if(maxueberziehungsrahmen < getKontostand()-geldbetrag ) {
			setKontostand(getKontostand()-geldbetrag);
			}
		else {
			throw new ExceptionLimit("Maximale Überziehung erreicht");
		}
		
		
		
		
		
		 
	 }
	public void einzahlen(int geldbetrag) {
		if (geldbetrag >0 ) {
			setKontostand(getKontostand()+geldbetrag);
		}
		
		
	}
	
}
