package bank_Account;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;


public class Windowbuilder  {

	private JFrame frame;
	private JTextField giroKontonummerAusgabe;
	private JTextField giroKontostandAusgabe;
	private JTextField giroKontostand;
	private JTextField sparAccount;
	private JTextField sparAusgabe;
	private JTextField textField_4;
	private JTextField kreditAccount;
	private JTextField kredithoehe;
	private JTextField txtKredithhe;
	private JTextField giroUeberziehungsrahmenAusgabe;
	private JTextField zahlung;
	private JTextField betrag;
	static ArrayList<Account> accountAll= new ArrayList<>();
	private JTextField SparBetrag;
	private JTextField textField_2;
	private JTextField textField_7;
	private JTextField kreditMinderung;
	private JTextPane Maxueberziehung;
	private JPanel spargruppenPanel;
	

	public static void main(String[] args) {
	SavingsAccount savingsAccount = new SavingsAccount(200);//Kontonummer 1
	CreditAccount creditAccount = new CreditAccount(1000);//Kontonummer 2	
	GiroAccount account = new GiroAccount(0, -500);//Kontonummer 3
	
	accountAll.add(creditAccount);
	accountAll.add(savingsAccount);
	accountAll.add(account);
		
	
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windowbuilder window = new Windowbuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Windowbuilder() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 128, 128));
		frame.setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 1051, 796);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(59, 26, 943, 701);
		frame.getContentPane().add(tabbedPane);
		
		ButtonGroup auswahl = new ButtonGroup();
		ButtonGroup auswahlSpar=new ButtonGroup();
		
		JPanel sparPanel = new JPanel();
		sparPanel.setLayout(null);
		tabbedPane.addTab("Sparkonto", null, sparPanel, null);
		
		JTextPane txtpnKontonummer_1_1 = new JTextPane();
		txtpnKontonummer_1_1.setText("Kontonummer: ");
		txtpnKontonummer_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnKontonummer_1_1.setBounds(35, 40, 165, 38);
		sparPanel.add(txtpnKontonummer_1_1);
		
		sparAccount = new JTextField();
		sparAccount.setColumns(10);
		sparAccount.setBackground(Color.WHITE);
		sparAccount.setBounds(223, 40, 165, 38);
		sparPanel.add(sparAccount);
		
		sparAusgabe = new JTextField();
		sparAusgabe.setColumns(10);
		sparAusgabe.setBounds(763, 40, 165, 38);
		sparPanel.add(sparAusgabe);
		
		textField_4 = new JTextField();
		textField_4.setText("Kontostand:");
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(574, 40, 165, 38);
		sparPanel.add(textField_4);
		
		JButton SparButton = new JButton("Enter");
		SparButton.setForeground(Color.BLACK);
		SparButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		SparButton.setBackground(Color.YELLOW);
		SparButton.setBounds(23, 372, 889, 73);
		sparPanel.add(SparButton);
		
		SparBetrag = new JTextField();
		SparBetrag.setColumns(10);
		SparBetrag.setBounds(393, 132, 135, 38);
		sparPanel.add(SparBetrag);
		
		textField_2 = new JTextField();
		textField_2.setText("Betrag");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(274, 133, 110, 41);
		sparPanel.add(textField_2);
		
		spargruppenPanel = new JPanel();
		spargruppenPanel.setBounds(34, 235, 878, 126);
		sparPanel.add(spargruppenPanel);
		
		 
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Einzahlung");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spargruppenPanel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Auszahlung");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spargruppenPanel.add(rdbtnNewRadioButton_3);
		auswahlSpar.add(rdbtnNewRadioButton_2);
		auswahlSpar.add(rdbtnNewRadioButton_3);
		
		JPanel kreditPanel = new JPanel();
		kreditPanel.setLayout(null);
		tabbedPane.addTab("Kreditkonto", null, kreditPanel, null);
		
		JTextPane txtpnKontonummer_1_2 = new JTextPane();
		txtpnKontonummer_1_2.setText("Kontonummer: ");
		txtpnKontonummer_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnKontonummer_1_2.setBounds(35, 40, 165, 38);
		kreditPanel.add(txtpnKontonummer_1_2);
		
		kreditAccount = new JTextField();
		kreditAccount.setColumns(10);
		kreditAccount.setBackground(Color.WHITE);
		kreditAccount.setBounds(223, 40, 165, 38);
		kreditPanel.add(kreditAccount);
		
		kredithoehe = new JTextField();
		kredithoehe.setColumns(10);
		kredithoehe.setBounds(763, 40, 165, 38);
		kreditPanel.add(kredithoehe);
		
		txtKredithhe = new JTextField();
		txtKredithhe.setText("Kredith\u00F6he:");
		txtKredithhe.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtKredithhe.setEditable(false);
		txtKredithhe.setColumns(10);
		txtKredithhe.setBackground(Color.WHITE);
		txtKredithhe.setBounds(574, 40, 165, 38);
		kreditPanel.add(txtKredithhe);
		
		JButton kreditButton = new JButton("Enter");
		kreditButton.setForeground(Color.BLACK);
		kreditButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		kreditButton.setBackground(Color.YELLOW);
		kreditButton.setBounds(23, 372, 889, 73);
		kreditPanel.add(kreditButton);
		
		textField_7 = new JTextField();
		textField_7.setText("Betrag");
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(256, 261, 110, 41);
		kreditPanel.add(textField_7);
		
		kreditMinderung = new JTextField();
		kreditMinderung.setColumns(10);
		kreditMinderung.setBounds(403, 261, 165, 41);
		kreditPanel.add(kreditMinderung);
		
		JPanel giroPanel = new JPanel();
		giroPanel.setToolTipText("");
		giroPanel.setLayout(null);
		tabbedPane.addTab("Girokonto", null, giroPanel, null);
		
		JTextPane giroKontonummer = new JTextPane();
		giroKontonummer.setText("Kontonummer: ");
		giroKontonummer.setFont(new Font("Tahoma", Font.BOLD, 20));
		giroKontonummer.setBounds(35, 40, 165, 38);
		giroPanel.add(giroKontonummer);
		
		giroKontonummerAusgabe = new JTextField();
		giroKontonummerAusgabe.setEditable(true);
		giroKontonummerAusgabe.setColumns(10);
		giroKontonummerAusgabe.setBackground(Color.WHITE);
		giroKontonummerAusgabe.setBounds(223, 40, 165, 38);
		giroPanel.add(giroKontonummerAusgabe);
		
		giroKontostandAusgabe = new JTextField();
		giroKontostandAusgabe.setBounds(763, 40, 165, 38);
		giroPanel.add(giroKontostandAusgabe);
		giroKontostandAusgabe.setColumns(10);
		
		giroKontostand = new JTextField();
		giroKontostand.setBackground(new Color(255, 255, 255));
		giroKontostand.setFont(new Font("Tahoma", Font.BOLD, 20));
		giroKontostand.setEditable(false);
		giroKontostand.setText("Kontostand:");
		giroKontostand.setBounds(574, 40, 165, 38);
		giroPanel.add(giroKontostand);
		giroKontostand.setColumns(10);
		
		JButton giroButton = new JButton("Enter");
		giroButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		giroButton.setForeground(new Color(0, 0, 0));
		giroButton.setBackground(Color.YELLOW);
		giroButton.setBounds(23, 372, 889, 73);
		giroPanel.add(giroButton);
		
		giroUeberziehungsrahmenAusgabe = new JTextField();
		giroUeberziehungsrahmenAusgabe.setBackground(Color.WHITE);
		giroUeberziehungsrahmenAusgabe.setEditable(false);
		giroUeberziehungsrahmenAusgabe.setBounds(223, 89, 165, 38);
		giroPanel.add(giroUeberziehungsrahmenAusgabe);
		giroUeberziehungsrahmenAusgabe.setColumns(10);
		
		JPanel panelGiro = new JPanel();
		panelGiro.setBounds(23, 236, 878, 126);
		giroPanel.add(panelGiro);
		
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Einzahlung");
		panelGiro.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Auszahlung");
		panelGiro.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		auswahl.add(rdbtnNewRadioButton);
		auswahl.add(rdbtnNewRadioButton_1);
		
		
		zahlung = new JTextField();
		zahlung.setBounds(368, 184, 165, 41);
		giroPanel.add(zahlung);
		zahlung.setColumns(10);
		
		betrag = new JTextField();
		betrag.setFont(new Font("Tahoma", Font.PLAIN, 18));
		betrag.setText("Betrag");
		betrag.setBounds(248, 184, 110, 41);
		giroPanel.add(betrag);
		betrag.setColumns(10);
		
		Maxueberziehung = new JTextPane();
		Maxueberziehung.setText("Max\u00FCberziehung");
		Maxueberziehung.setFont(new Font("Tahoma", Font.BOLD, 16));
		Maxueberziehung.setBounds(35, 89, 165, 38);
		giroPanel.add(Maxueberziehung);
		
				giroButton.addActionListener(e->{
			
			try {
				GiroAccount selectAccount=(GiroAccount)this.getAccount(Integer.valueOf(giroKontonummerAusgabe.getText()));
				
				
				if (rdbtnNewRadioButton.isSelected()) {
					selectAccount.einzahlen(Integer.valueOf(zahlung.getText()));
					giroKontostandAusgabe.setText(String.valueOf(selectAccount.getKontostand()));
					giroUeberziehungsrahmenAusgabe.setText(String.valueOf(selectAccount.getMaxueberziehungsrahmen()));
					
				}else {
					try {
						selectAccount.auszahlen(Integer.valueOf(zahlung.getText()));
				
					} catch (ExceptionLimit e1) {
						
						e1.printStackTrace();
					}
					giroKontostandAusgabe.setText(String.valueOf(selectAccount.getKontostand()));
				}
			} catch (ClassCastException e2) {
				System.out.println("Fehler");
			}
			
		});
		SparButton.addActionListener(e->{
			
			try {
				SavingsAccount selectedAccount =(SavingsAccount) this.getAccount(Integer.valueOf(sparAccount.getText()));
				
				if (rdbtnNewRadioButton_2.isSelected()) {
					selectedAccount.einzahlen(Integer.valueOf(SparBetrag.getText()));
					sparAusgabe.setText(String.valueOf(selectedAccount.getKontostand()));
					
				}else {
					try {
						selectedAccount.auszahlen(Integer.valueOf(SparBetrag.getText()));
					} catch (ExceptionLimit e2) {
						e2.printStackTrace();
					}
					sparAusgabe.setText(String.valueOf(selectedAccount.getKontostand()));
				}
				
			} catch (ClassCastException e2) {
				System.out.println("Fehler");
			}
			
			
		});
				
				
		kreditButton.addActionListener(e->{
			CreditAccount kreditaccount= (CreditAccount)this.getAccount(Integer.valueOf(kreditAccount.getText()));
			kredithoehe.setText(String.valueOf(kreditaccount.getKontostand()));
			try {
				kreditaccount.einzahlen(Integer.valueOf(kreditMinderung.getText()));
			} catch (NumberFormatException | ExceptionLimit e1) {
				e1.printStackTrace();
			}
			kredithoehe.setText(String.valueOf(kreditaccount.getKontostand()));
				
			
					});
		
	}
	private  Account getAccount(int kontonummer) {
		for (Account account : accountAll) {
			if (account.getKontonummer()==kontonummer) {
				return account; 
			}
		}
		return null;
	}
}
