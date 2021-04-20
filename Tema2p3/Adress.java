package Tema2p3;

public class Adress {
	private String city, street;
	private int number;
	
	Adress(){}
	
	Adress(String oras, String strada, int nr){
		city = oras;
		street = strada;
		number = nr;
	}
	
	String getFullAdress(){
		return city + ' ' + ", strada " + street + ' ' + ", nr." + Integer.toString(number);
		
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public int getNumber() {
		return number;
	}
		
	
}
