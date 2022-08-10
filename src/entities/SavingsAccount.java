package entities;

public final class SavingsAccount extends  Account{
	
	private Double interstRate;  //taxa de juros
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interstRate) {
		super(number, holder, balance);
		this.interstRate = interstRate;
	}

	public Double getInterstRate() {
		return interstRate;
	}

	public void setInterstRate(Double interstRate) {
		this.interstRate = interstRate;
	}
	
	//atualização da conta com base na taxa de juros
	public void  updateBalance() {
		balance += balance * interstRate;
	}

	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
	
}
