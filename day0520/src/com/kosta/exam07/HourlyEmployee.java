package com.kosta.exam07;

public class HourlyEmployee extends Employee{
	
	private int salary;
	private int hourlyRate;
	private int workingHour;
	
	public HourlyEmployee() {}
	public HourlyEmployee(String name, String no, int hourlyRate, int workingHour) {
		super(name, no);
		this.hourlyRate = hourlyRate;
		this.workingHour = workingHour;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getWorkingHour() {
		return workingHour;
	}
	public void setWorkingHour(int workingHour) {
		this.workingHour = workingHour;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
//	@Override
//	protected void computeSalary() {
//		salary = hourlyRate * workingHour;
//	}
	@Override
	public String toString() {
		return "HourlyEmployee [salary=" + salary + ", hourlyRate=" + hourlyRate + ", workingHour=" + workingHour
				+ ", name=" + name + ", no=" + no + "]";
	}

}
