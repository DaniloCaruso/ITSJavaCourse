package it.corso.main;

import java.util.Scanner;

import it.corso.banche.Banca;
import it.corso.banche.estere.BancaCayman;
import it.corso.banche.italiane.BancaIntesa;

public class Execution {

	public static void main(String[] args) {

		int depositoIniziale;
		int deposito;
		int prelievo;
		String operazioni;
		Banca bancaIntesa = null;
		Banca bancaCayman = null;



		Scanner	scan = new Scanner(System.in);

		System.out.println("vuoi creare un nuovo conto(y\\n)?");

		String creazione = scan.nextLine();
		
		if (creazione.equals("y")) {

			while(true){
				System.out.println("Con che banca vuoi crearlo(1 => Banca Intesa , 2 => Banca Cayman)?");			

				try {
					int scelta = Integer.parseInt(scan.nextLine());
					switch (scelta) {
					case 1:
						
						
						System.out.println("Vuoi un conto vuoto o vuoi depositare subito(vuoto\\deposito)?");

						
						String sceltaDeposito1 = scan.nextLine();
						
						if(sceltaDeposito1.equals("deposito")){ 



							while(true){

								System.out.print("Quanto vuoi depositare inizialmente (il versamentoMinimo è 5000€)?");
								try{
									depositoIniziale = Integer.parseInt(scan.nextLine());
									break;
								}
								catch (NumberFormatException e){
									System.out.println("ERRORE: Percortesia inserire un numero valido [no stringhe]\n\n");
									continue;
								}

							}

							bancaIntesa = new BancaIntesa(depositoIniziale , 2 , 5000, 20); 
						}
						
						
						
						else if(sceltaDeposito1.equals("vuoto")){ bancaIntesa = new BancaIntesa(2, 5000, 20);}
						
						while(true){

							System.out.print("Vuoi effettuare nuove operazioni ( DIGITA \"versamento\" , \"prelievo\" , \"saldo\" o \"quit\" per uscire )?");

							operazioni = scan.nextLine();								

							if(operazioni.equals("versamento")){
								System.out.println("Quanto vuoi versare?");
								try{
									deposito = Integer.parseInt(scan.nextLine());
									System.out.println("Saldo iniziale di:" +bancaIntesa.getConto()+"€");
									boolean risultatoVersamento = bancaIntesa.versamento(deposito);
									if(risultatoVersamento){
										System.out.println("Deposito di:"+ deposito +"€");
										System.out.println("Saldo finale di:" +bancaIntesa.getConto()+"€");
									
									}else{
										System.out.println("Versamento minimo di :" +bancaIntesa.getMinimoVersamento()+"€");
										System.out.println("Effettuare una nuova operazione\n\n");
										
									}
									continue;
								}
								catch (NumberFormatException e){
									continue;
								}
								
							}
							else if(operazioni.equals("prelievo")){
								System.out.println("Quanto vuoi prelevare?");
								try{
									prelievo = Integer.parseInt(scan.nextLine());
									System.out.println("Saldo iniziale di:" +bancaIntesa.getConto()+"€");
									boolean risultatoPrelievo = bancaIntesa.prelievo(prelievo);
									
									if(risultatoPrelievo){
									System.out.println("Prelievo di:"+ prelievo +"€");
									System.out.println("Saldo finale di:" +bancaIntesa.getConto()+"€");
									}else{
										System.out.println("Versamento superiore al conto o conto vuoto");
										System.out.println("Effettuare una nuova operazione\n\n");
									}
									continue;
								}
								catch (NumberFormatException e){
									continue;
								}
							}
							else if(operazioni.equals("saldo")){
								System.out.println("Il saldo è di:" +bancaIntesa.getConto()+"€");
								
								continue;
							}
							else if(operazioni.equals("quit")){
								System.out.println("grazie per aver utilizzato questo programma fatto con gli while!");
								break;
							}
						}
						

						break;
					
					
					
					
					
					
					
					case 2:
						
						System.out.println("Vuoi un conto vuoto o vuoi depositare subito(vuoto\\deposito)?");

						String sceltaDeposito2 = scan.nextLine();
						
						if(sceltaDeposito2.equals("deposito")){ 

							while(true){

								System.out.print("Quanto vuoi depositare inizialmente (il versamentoMinimo è 10000€)?");
								try{
									depositoIniziale = Integer.parseInt(scan.nextLine());
									bancaCayman = new BancaCayman(depositoIniziale,50,10000); 
									break;
								}
								catch (NumberFormatException e){
									System.out.println("ERRORE: Percortesia inserire un numero valido [no stringhe]\n\n");
									continue;
								}

							}

						}
						else if(sceltaDeposito2.equals("vuoto")){ 
							bancaCayman = new BancaCayman(50,10000);
						}

						while(true){

							System.out.print("Vuoi effettuare nuove operazioni ( DIGITA \"versamento\" , \"prelievo\" , \"saldo\" o \"quit\" per uscire )?");

							operazioni = scan.nextLine();								

							if(operazioni.equals("versamento")){
								System.out.println("Quanto vuoi versare?");
								try{
									deposito = Integer.parseInt(scan.nextLine());
									System.out.println("Saldo iniziale di:" +bancaCayman.getConto()+"€");
									boolean risultatoVersamento = bancaCayman.versamento(deposito);
									if(risultatoVersamento){
										System.out.println("Deposito di:"+ deposito +"€");
										System.out.println("Saldo finale di:" +bancaCayman.getConto()+"€");
									
									}else{
										System.out.println("Versamento minimo di :" +bancaCayman.getMinimoVersamento()+"€");
										System.out.println("Effettuare una nuova operazione\n\n");
										
									}
									continue;
								}
								catch (NumberFormatException e){
									continue;
								}
								
							}
							else if(operazioni.equals("prelievo")){
								System.out.println("Quanto vuoi prelevare?");
								try{
									prelievo = Integer.parseInt(scan.nextLine());
									System.out.println("Saldo iniziale di:" +bancaCayman.getConto()+"€");
									boolean risultatoPrelievo = bancaCayman.prelievo(prelievo);
									
									if(risultatoPrelievo){
									System.out.println("Prelievo di:"+ prelievo +"€");
									System.out.println("Saldo finale di:" +bancaCayman.getConto()+"€");
									}else{
										System.out.println("Versamento superiore al conto o conto vuoto");
										System.out.println("Effettuare una nuova operazione\n\n");
									}
									continue;
								}
								catch (NumberFormatException e){
									continue;
								}
							}
							else if(operazioni.equals("saldo")){
								System.out.println("Il saldo è di:" +bancaCayman.getConto()+"€");
								
								continue;
							}
							else if(operazioni.equals("quit")){
								System.out.println("grazie per aver utilizzato questo programma fatto con gli while!");
								break;
							}
						}
						break;
					}
					break;
				} catch (Exception e) {
					System.out.println("ERRORE: Percortesia inserire un numero valido [no stringhe]\n\n");
					continue;
				}	
				
			}

		}

		scan.close();
		
	}
	

}
