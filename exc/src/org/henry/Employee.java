package org.henry;

public class Employee {

	private String name;
	private int age;
	private int payment;
	private double bonus;
	
	
	public Employee(String name, int age, int payment, double bonus) {
		super();
		this.name = name;
		this.age = age;
		this.payment = payment;
		this.bonus = bonus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
}