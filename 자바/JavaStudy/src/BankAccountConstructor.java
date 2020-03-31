class BankAccount
{
	String AccNumber;
	String ssNumber;
	int balance;
	
	public BankAccount(String Acc,String ss,int bal)
	{
		AccNumber=Acc;
		ssNumber=ss;
		balance=bal;
	}
	
	public int deposit(int amount)
	{
		balance+=amount;
		return balance;
	}
	
	public int withdraw(int amount)
	{
		balance-=amount;
		return balance;
	}
	public void checkMybalance()
	{
		System.out.println("°èÁÂ ¹øÈ£ " + AccNumber);
		System.out.println("ÁÖ¹Î¹øÈ£ " + ssNumber);
		System.out.println("ÀÜ¾× " + balance);
	}
}

public class BankAccountConstructor {
	public static void main(String[] args)
	{
		BankAccount yoon = new BankAccount("777","1234",10000);
		BankAccount jim = new BankAccount("7657","1244434",10000);
		
		yoon.deposit(5000);
		jim.withdraw(1000);
		yoon.checkMybalance();
		jim.checkMybalance();
	}
}
