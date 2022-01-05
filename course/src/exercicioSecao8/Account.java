package exercicioSecao8;

public class Account {
	
	private int number;
	private String holder;
	private double balance;

	public Account(int number, String name) {
		this.number = number;
		this.holder = name;
	}
	
	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.holder = name;
		deposit(initialDeposit);
	}
	

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
		public String getName() {
			return holder;
		}
	public void setName(String name) {
		this.holder = name;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	@Override
	public String toString() {
		return "Account "
				+number
				+" Holder: "
				+holder
				+", Balance: $"
				+String.format("%.2f", balance);
	}
}
