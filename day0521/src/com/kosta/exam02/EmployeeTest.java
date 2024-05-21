package com.kosta.exam02;

public class EmployeeTest {

	public static void main(String[] args) {
		SalariedEmployee e1 = new SalariedEmployee("spring", "A1000", 1);
		SalariedEmployee e2 = new SalariedEmployee("summer", "A1001", 2);
		HourlyEmployee h1 = new HourlyEmployee("autumn", "H1000", 100000, 20);
		
		e1.computeSalary();
		e2.computeSalary();
		h1.computeSalary();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(h1);
	}
}
