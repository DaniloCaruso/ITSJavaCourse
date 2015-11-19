package it.corso.utenti;

public class Utente {

	private String username;
	private String password;
	private String email;
	private String nome;
	private String cognome;
	private String anni;

	
	public Utente(){}
	
	public Utente(String user , String pwd){
		this.nome = user;
		this.cognome = pwd;
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getAnni() {
		return anni;
	}

	public void setAnni(String anni) {
		this.anni = anni;
	}	
	
	
}
