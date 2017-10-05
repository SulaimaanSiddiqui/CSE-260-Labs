import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		id = (int) (Math.random() * 1000 + 1);
		balance = 0;
		dateCreated = new Date();
	}
	
	public Account(int id, int balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	public int getID(){
		return id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getInterest(){
		return annualInterestRate;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	public void setID(int newID){
		id = newID;
	}
	
	public void setBalance(int newBalance){
		balance = newBalance;
	}
	
	public void setInterestRate(int newRate){
		annualInterestRate = newRate;
	}
	
	public void deposit(int numAdded){
		balance += numAdded;
	}
	
	public void withdraw(int numWithdrew){
		if(numWithdrew > balance)
			System.out.println("There is not enough money inside this account to do this. ");
		else 
			balance -= numWithdrew;
	}
}
