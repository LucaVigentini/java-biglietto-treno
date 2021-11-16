package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		
		double ticketKm = 0.21;
		
		Scanner input = new Scanner(System.in);
		
		double kmPercorsi;
		double age;
		
		
		System.out.print("Km percorsi: ");
		kmPercorsi = input.nextDouble();
		System.out.print("Età: ");
		age = input.nextDouble();
		
		
	
		double ticketPrice = kmPercorsi * ticketKm;
		double prezzo;
		
		
		
		
		
		if (age < 18) {	
			prezzo = (ticketPrice * 80 / 100);
		} else if (age > 65) {
			prezzo = (ticketPrice * 60 / 100);	
		} else {
			prezzo = (ticketPrice);
		}
		
		System.out.println("Il prezzo del biglietto è " + prezzo);
		
			
		
		input.close();
		
	}

}
