package TestPayment;

import java.util.Arrays;

import lv.eleonora.employee.CommissionEmployee;
import lv.eleonora.employee.SalaryEmployee;
import lv.eleonora.paysystem.PaymentSystem;

public class TestPayment {

public static void main(String[] args) {
	PaymentSystem paymentSystem = new PaymentSystem();
	
	CommissionEmployee toms = new CommissionEmployee("Toms Ozolins", 1010101, 5000.5);
	paymentSystem.addPayee(toms);
	CommissionEmployee ieva = new CommissionEmployee("Ieva Berzina", 2020202, 5600.5);
	paymentSystem.addPayee(ieva);
	
	SalaryEmployee valters = new SalaryEmployee("Valters Berzs", 3030303, 2000.4);
	paymentSystem.addPayee(valters);
	SalaryEmployee arita = new SalaryEmployee("Arita Klava", 4020204, 5432.4);
	paymentSystem.addPayee(arita);
	valters.giveBonus(10.0);
	ieva.giveBonus(7.0);
	
	//simulate work
	toms.giveCommission(4.0);
	toms.giveCommission(50.3);
	ieva.giveCommission(40.2);
	ieva.giveCommission(45.9);
	toms.giveCommission(54.3);
	toms.giveCommission(43.3);
	
	Double d = 40.3;
	String s = String.valueOf(d);
	System.out.println(s);
	System.out.println(String.format("%1$,  .2f",d));
	
	paymentSystem.processPayments();
	
}
}
