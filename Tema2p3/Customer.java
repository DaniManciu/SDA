package Tema2p3;

public class Customer{
	private String lastName, firstName;
	private int age;
	private Adress ad;
	private PaymentMethod pay;
	
	Customer(String fam, String prenume, int age, Adress adresa, PaymentMethod plata){
		super();
		lastName = fam;
		firstName = prenume;
		this.age = age;
		ad = adresa;
		pay = plata;
	}
	
	String getCompleteName(){
		return lastName + ' ' + firstName;
		
	}
	
	Adress getAdress() {
		return ad;
	}
	
	PaymentMethod getPaymentMethod() {
		return pay;
	}
	
	
	
}
