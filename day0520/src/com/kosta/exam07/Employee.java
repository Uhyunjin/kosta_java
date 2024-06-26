package com.kosta.exam07;

public class Employee {
	protected String name;
	protected String no;
	
	protected void computeSalary() { //급여를 계산하는 메서드
		//월급제 사원과 시간제 사원의 급여 계산 방식이 다르기 때문에
		//부모 클래스를 만드는 시점에서 메서드의 body를 구체화 할 수 없다
	
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", no=" + no + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name, String no) {
		this.name = name;
		this.no = no;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	
	// 생성자
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	public Employee(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
