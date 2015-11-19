package it.corso.persone;

public class Persona {

	private String nome;
	public String cognome;
	public int  anni;
	
	public Persona(String nome , String cognome , int anni){
		
		this.nome = nome;
		this.cognome = cognome;
		this.anni = anni;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getAnni() {
		return anni;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setAnni(int anni) {
		this.anni = anni;
	}	
	
}
