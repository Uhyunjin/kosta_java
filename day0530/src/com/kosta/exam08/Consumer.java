package com.kosta.exam08;

public class Consumer extends Thread{
	
	private Product product;
	
	public Consumer(Product product) {
		this.product = product;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				product.useNumber();
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
