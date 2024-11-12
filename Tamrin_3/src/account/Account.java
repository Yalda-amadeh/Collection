package account;

public class Account implements Comparable<Object>{
	private String name;
	private int branch;
	private int balance;
	
	public Account(String name,int branch,int balance) {
		super();
		this.balance = balance;
		this.name = name;
		this.branch = branch;
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBranch() {
		return branch;
	}
	public void setBranch(int branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", branch=" + branch + ", balance=" + balance + "]";
	}
	public int compareTo(Object o) {
		Account other = (Account)o;
		return this.balance - other.balance;
		
	}

}
