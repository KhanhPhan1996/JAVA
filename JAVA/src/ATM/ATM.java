package ATM;

public interface ATM {
	public boolean withdraw(int iDWithdrawal ,double moneyWithdrawal);
	public boolean deposit(int iDDeposit,double moneyDeposit);
	public double queryBalance(double balance);
	public boolean login(String user,String password);
	public boolean logout(String user);
	
}
