package it.corso.main;

import java.util.Scanner;

import it.corso.banche.Banca;
import it.corso.banche.estere.BancaCayman;
import it.corso.banche.italiane.BancaIntesa;

public class Execution {

	public static void main(String[] args) {

		Scanner	scan = new Scanner(System.in);



		System.out.println("vuoi creare un nuovo conto(y\\n)?");

		//String creazione = scan.nextLine()
		//if(ceazione.equals("y"){ #codice# }
		if (scan.nextLine().equals("y")) {

			while(true){
				System.out.println("Con che banca vuoi crearlo(1 => Banca Intesa , 2 => Banca Cayman , 3 => Altro)?");			

				try {
					int scelta = Integer.parseInt(scan.nextLine());
					switch (scelta) {
					case 1:
						System.out.println("Vuoi un conto vuoto o vuoi depositare subito(vuoto\\deposito)?");
						
						if(scan.nextLine().equals("deposito")){ 
							
							while(true){
								
								System.out.print("Quanto vuoi depositare inizialmente (il versamentoMinimo è 500€)?");
								try{
									int depositoIniziale = Integer.parseInt(scan.nextLine());
									break;
								}
								catch (NumberFormatException e){
									System.out.println("ERRORE: Percortesia inserire un numero valido [no stringhe]\n\n");
									continue;
								}
								
							}
							
							Banca bancaIntesa = new BancaIntesa(2, 5000, 20); 
							}
						if(scan.nextLine().equals("vuoto")){ Banca bancaIntesa = new BancaIntesa(2, 5000, 20); }

						break;
					case 2:

						break;
					case 3:

						break;
					}

					break;
				} catch (Exception e) {
					System.out.println("ERRORE: Percortesia inserire un numero valido [no stringhe]\n\n");
					continue;
				}	
			}

		}


		Banca bancaCayman = new BancaCayman(25000, 50, 10000);		




/*
		boolean versamentoIntesa = bancaIntesa.versamento(200);
		if(!versamentoIntesa){
			System.out.println("Banca Intesa: Quantità di denaro inferiore ai limiti, minimo consentito 5000€");
			System.out.println("Banca Intesa:il suo saldo attuale è di:"+bancaIntesa.getConto()+"€");
		}
		versamentoIntesa = bancaIntesa.versamento(5000);

		if(versamentoIntesa){
			System.out.println("Banca Intesa:Versamento effettuato con successo!!");
			System.out.println("Banca Intesa:il suo saldo attuale è di:"+bancaIntesa.getConto()+"€");
		}

		boolean versamentoCayman = bancaCayman.versamento(5000);
		if(!versamentoCayman){
			System.out.println("Banca Cayman: Quantità di denaro inferiore ai limiti, minimo consentito 10000€");
			System.out.println("Banca Cayman:il suo saldo attuale è di:"+bancaCayman.getConto()+"€");

		}

		versamentoCayman = bancaCayman.versamento(10000);
		if(versamentoCayman){
			System.out.println("Banca Cayman:Versamento effettuato con successo!!");
			System.out.println("Banca Cayman:il suo saldo attuale è di:"+bancaCayman.getConto()+"€");
		}*/

	}

}
