package objectOriented;

public class BankAccounts {
	private double checkingAccount;
	private double savingsAccount;
	private double checkingInterest;
	private double savingsInterest;
	private double bankAccountNumber;
	
	public BankAccounts()
	{
		
	}
	public BankAccounts(double checkx, double savex, double cintx, double sintx)
	{
		checkingAccount = checkx;
		savingsAccount = savex;
		checkingInterest = cintx;
		savingsInterest = sintx;
	}
	public void depoC(double xdepoC)
	{
		checkingAccount+=xdepoC;
	}
	public void depoS(double xdepoS)
	{
		savingsAccount+=xdepoS;
	}
	public void cintx(double xcintx)
	{
		checkingInterest = xcintx;
	}
	public void sintx(double xsintx)
	{
		savingsInterest = xsintx;
	}
	public void financeChargeC(double amount)
	{
		checkingAccount-=amount;
	}
	public void financeChargeS(double amount)
	{
		savingsAccount-=amount;
	}
	public double getC()
	{
		return checkingAccount;
	}
	public double getS()
	{
		return savingsAccount;
	}
}
