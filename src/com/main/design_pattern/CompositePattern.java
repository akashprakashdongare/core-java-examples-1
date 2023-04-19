/**
 * 
 */
package com.main.design_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akash.d
 *
 */
interface Account {
	float getBalance();
}

class DepositeAccount implements Account {
	@SuppressWarnings("unused")
	private String accountNo;
	private float accountBalance;

	public DepositeAccount(String account_no, float account_balance) {
		this.accountNo = account_no;
		this.accountBalance = account_balance;
	}

	public float getBalance() {
		return accountBalance;
	}
}

class SavingAccount implements Account {
	@SuppressWarnings("unused")
	private String accountNo;
	private float accountBalance;

	public SavingAccount(String account_no, float account_balance) {
		this.accountNo = account_no;
		this.accountBalance = account_balance;
	}

	public float getBalance() {
		return accountBalance;
	}
}

class CompositeAccount implements Account {

	private float totalBalance;
	private List<Account> account_list = new ArrayList<Account>();

	@Override
	public float getBalance() {
		totalBalance = 0;
		for (Account a : account_list)
			totalBalance = totalBalance + a.getBalance();

		return totalBalance;
	}

	public void addAccount(Account ac) {
		account_list.add(ac);
	}

	public void removeAccount(Account ac) {
		account_list.remove(ac);
	}

}

public class CompositePattern {

	public static void main(String[] args) {
		CompositeAccount c_ac = new CompositeAccount();
		c_ac.addAccount(new DepositeAccount("DA001", 150));
		c_ac.addAccount(new DepositeAccount("DA002", 250));
		c_ac.addAccount(new SavingAccount("SA001", 500));

		System.out.println("TOTAL BALANCE : " + c_ac.getBalance());

	}

}
