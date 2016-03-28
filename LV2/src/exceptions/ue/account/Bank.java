package exceptions.ue.account;

import java.util.HashMap;

import com.sun.accessibility.internal.resources.accessibility;

import javafx.scene.control.Accordion;

public class Bank {
	private HashMap<String, Konto> Konten = new HashMap<>();
		
	public void addAccount(String owner, double balance,double overdraftFrame) throws BankException
	{
		if (Konten.containsKey(owner))
		{
			throw new BankException("account for "+owner+ " already exists");
	
		}
		Konten.put(owner, new Konto(owner, balance, overdraftFrame));
		
	}
	}
