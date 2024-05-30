package com.kosta.exam08;

public class MainTest {
	public static void main(String[] args) {
		Product product = new Product();
		Consumer consumer = new Consumer(product);
		Producer producer = new Producer(product);
		
		consumer.start();
		producer.start();
	}
}
