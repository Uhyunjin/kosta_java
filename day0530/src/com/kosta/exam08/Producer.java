package com.kosta.exam08;

//생산자 클래스를 만든다
//소비자와 상관없이 계속해서 새로운 제품을 생산
//=>Thread 상속, 멀티스레드
public class Producer extends Thread{
	private Product product;
	
	
	
	public Producer(Product product) {	//생성시에 매개변수로 product를 받아
										//흠 못적음
		this.product = product;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			try {
				product.makeNumber();
				Thread.sleep(100);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	
}
