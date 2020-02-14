package lv.eleonora.employee;

import lv.eleonora.paysystem.Payee;

public class SalaryEmployee implements Payee {
	
	private String name;
	private Integer bankAccount;
	protected double grossWage;
	
		public SalaryEmployee(String name, Integer bankAccount, double grossWage) {
		this.name = name;
		this.bankAccount = bankAccount;
		this.grossWage = grossWage;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Double grossPayment() {
		return grossWage;
	}

	@Override
	public Integer bankAccount() {
		
		return bankAccount;
	}
	
	

}
