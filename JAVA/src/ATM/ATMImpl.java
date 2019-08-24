package ATM;

import java.util.Scanner;

public class ATMImpl implements ATM{
	private int idATM;
	private int accountld;
	private double balance;

	
	public int getIdATM() {
		return idATM;
	}

	public void setIdATM(int idATM) {
		this.idATM = idATM;
	}

	public int getAccountld() {
		return accountld;
	}

	public void setAccountld(int accountld) {
		this.accountld = accountld;
	}

	@Override
	public boolean withdraw(int iDWithdrawal, double moneyWithdrawal) {
		Scanner sc = new Scanner(System.in);
		if(this.idATM == iDWithdrawal) {
			System.out.println(" Enter money withdrawal");
			moneyWithdrawal = sc.nextDouble();
			if (moneyWithdrawal < queryBalance(balance)) {
				System.out.println(" Not enough money");
			} else {
				return false;
			}
		}
		else return false;
		return false;
	}

	@Override
	public boolean deposit(int iDDeposit, double moneyDeposit) {
		Scanner sc = new Scanner(System.in);
		if(this.idATM ==  iDDeposit) {
			System.out.println(" Enter money withdrawal");
			moneyDeposit = sc.nextDouble();
			if (moneyDeposit < queryBalance(balance)) {
				System.out.println(" Not enough money");
			} else {
				return false;
			}
		}
		else return false;
		return false;
	}

	@Override
	public double queryBalance(double balance) {
		return balance;
		
	}

	@Override
	public boolean login(String user, String password) {
		return false;
	}

	@Override
	public boolean logout(String user) {
		return false;
	}

	
	




}
