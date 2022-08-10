package entities;

// classe conta
public class Account {

	private Integer number; //número da conta
	private String holder; // nome do cliente
	protected Double balance; //saldo
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	//metodo para saque, o valor é descontado da conta junto com uma taxa de juros.
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	 //metodo para deposito,um valor será acrescentado ao saldo.
	public void deposit(double amount) {
		balance += amount;
	}
	
	
	
	
}
