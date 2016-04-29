package exceptions.ue.account;

public class Konto {
private String owner;
private double balance;
private double overdraftFrame;
public Konto(String owner, double balance, double overdraftFrame) {
	super();
	this.owner = owner;
	this.balance = balance;
	this.overdraftFrame = overdraftFrame;
}
public String getOwner() {
	return owner;
}
public double getBalance() {
	return balance;
}
public double getOverdraftFrame() {
	return overdraftFrame;
}


public void credit (double amount)
{
	balance += amount;
}

public void debit(double amount) throws NotEnoughMoneyException
{
try {
	if ((balance+overdraftFrame) < amount)
	{
		throw new NotEnoughMoneyException(owner);
	}
} catch (NotEnoughMoneyException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
balance = balance-amount;
}


}
