package Tema2p3;

public class main {

	public static void main(String[] args) {
	
	PaymentMethod metoda_plata = new PaymentMethod("Cash");
	Adress adresa = new Adress("Brasov", "Memorandului", 36);
	Customer customer1 = new Customer("Manciu", "Daniel", 22, adresa, metoda_plata);
	
	System.out.println("Numele si prenumele: " + customer1.getCompleteName());
	System.out.println("Adresa: " + customer1.getAdress().getFullAdress());
	System.out.println("Metoda de plata: " + customer1.getPaymentMethod().getName());
	}

}
