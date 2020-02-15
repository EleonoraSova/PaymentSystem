package lv.eleonora.paysystem;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {
	
	private List<Payee> payees;
	
	public PaymentSystem() {
		payees = new ArrayList<>();
	}
	
	public void addPayee(Payee payee){
		if(!payees.contains(payee)){
			payees.add(payee);
		}
	}
	public void processPayments() {
		for(Payee payee : payees){
			Double grossPayment = payee.grossPayment();
			
			System.out.println("Paying to "+ payee.name());
			System.out.println("Grosst "+ String.format("%1$,.2f",grossPayment));
			System.out.println("Transferred to Account: "+payee.bankAccount());
			
		}
	}
	@Override
	public String toString() {
		return "PaymentSystem [payees=" + payees + "]";
	}
	public void PrintName() {
		for(Payee payee : payees){
			
			System.out.println(" "+ payee.name()+ " ");
		}
	}
	
}