package it.corso.main;

import java.util.Scanner;
import it.corso.utenti.Utente;

public class Main {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		String nome;
		String cognome;
		String username;
		String password;
		String anni;

		System.out.println("##### Questo programma che crea un oggetto Persona e ne stampa i valori degli attributi tramite getter #####");
		System.out.println("Buongiorno inserire username:");
		username = scanner.nextLine();
		System.out.println("Perfavore inserire la password:");
		password = scanner.nextLine();
		System.out.println("Perfavore inserisci il tuo nome:");
		nome = scanner.nextLine();
		System.out.println("Perfavore inserisci il tuo cognome:");
		cognome = scanner.nextLine();
		System.out.println("Perfavore inserisci quanti anni hai:");
		anni = scanner.nextLine();

		scanner.close();

		Utente danilo = new Utente(username , password);

		danilo.setNome(nome);
		danilo.setCognome(cognome);
		danilo.setAnni(anni);

		System.out.println(	"username:" + danilo.getUsername() + 
							" password:"+ danilo.getPassword() + 
							" nome:" + danilo.getNome() + 
							" cognome:" + danilo.getCognome() + 
							" anni:" + danilo.getAnni() 
						  );

		}

}
