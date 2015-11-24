package it.corso.main;

import it.corso.banche.Banca;
import it.corso.banche.estere.BancaCayman;
import it.corso.banche.italiane.BancaIntesa;

public class Execution {

	public static void main(String[] args) {
		
		Banca bancaIntesa = new BancaIntesa(2, 5000, 20);
		Banca bancaCayman = new BancaCayman(25000, 50, 10000);
		

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
			}

	}

}
