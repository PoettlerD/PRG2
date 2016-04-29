package exceptions.ue.account;

import org.omg.PortableServer.ThreadPolicyOperations;

public class BankException extends Exception {

	public BankException(String string) {
		// TODO Auto-generated constructor stub
		System.out.println(string);
	}

	public BankException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
