import java.util.Scanner;
class NegativeBalanceException extends Exception
{
	public NegativeBalanceException(String message){
		super(message);
	}
}


class BankAccount
{
	String name;
	double balance;

	public BankAccount(String name, double balance){
		this.name = name;
		this.balance = balance;
	};

	public void deposit(double money){

		balance += money;
		System.out.println("현재 잔액 : "+balance);
	}

	public void withdraw(double money)throws NegativeBalanceException{

		if (balance-money<0)
		{
			throw new NegativeBalanceException("잔액이 부족합니다 현재 잔액 : "+balance);
		}else{
			balance -= money;
		}
	}
}


class BankAccountTest
{

	public static void main(String[] args) 
	{	
		double money;
		Scanner sc = new Scanner(System.in);
		BankAccount a = new BankAccount("a",20000);
		System.out.println("얼마를 입금하시나요?");
		money = sc.nextDouble();
		a.deposit(money);
		System.out.println("얼마를 출금하시나요?");
		money = sc.nextDouble();
		try
		{
			a.withdraw(money);
		}
		catch (NegativeBalanceException e)
		{
			System.out.println(e);
		}
		
	}
}
