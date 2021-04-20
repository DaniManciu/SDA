package Tema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class tema1 {

	public static void main(String[] args) throws IOException{
		
		int a , b;
		int suma, diferenta, produsul, maxim, minim;
		double distanta, media;
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(x.readLine());
		b = Integer.parseInt(x.readLine());

		suma = a + b;
		diferenta = a - b;
		produsul = a * b;
		media = (a + b) / 2;
		distanta = Math.abs(a+b);
		
		if (a>b)
		{
			maxim = a;
			minim = b;
		}
		else
		{
			maxim = b;
			minim = a;
		}
		
		System.out.println("Suma celor 2 numere este " + suma);
		System.out.println("Diferenta celor 2 numere este: " + diferenta);
		System.out.println("Produsul celor 2 numere este:" + produsul);
		System.out.println("Media celor 2 numere este: " + media);
		System.out.println("Distanta dintre cele 2 numere este: " + distanta);
		System.out.println("Maximul dintre cele 2 numere este: " + maxim);
		System.out.println("Minimul dintre cele 2 numere este: " + minim);
		
	}

}
