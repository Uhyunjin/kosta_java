package com.kosta.exam06;

public class TVARSTest {
	public static void main(String[] args) {
		Account account = new Account();	//모금액을 위한 어카운트 객체 생성
		
		//성금자의 이름과 모금액을 위한 account객체를 
		//매개변수로 하여 5명의 성금자를 생성
		
		Person donor1 = new Person("Donor1", account);
		Person donor2 = new Person("Donor2", account);
		Person donor3 = new Person("Donor3", account);
		Person donor4 = new Person("Donor4", account);
		Person donor5 = new Person("Donor5", account);
		
		//5명의 성금자가 경쟁적으로 입금을 하기 위하여 thread 가동
		donor1.start();
		donor2.start();
		donor3.start();
		donor4.start();
		donor5.start();
		
		try {
			donor1.join();
			donor2.join();
			donor3.join();
			donor4.join();
			donor5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//전체 모금액을 출력한다
		System.out.println("total : "+account.getBalance());
	}
}
