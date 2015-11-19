package it.corso.animali.marini;

public abstract class AnimaliMarini {
	
	private String colore;
	private String sesso;
	private int peso;
	private int lunghezza;

	public AnimaliMarini(String colore, String sesso, int peso, int lunghezza) {
		this.colore = colore;
		this.sesso = sesso;
		this.peso = peso;
		this.lunghezza = lunghezza;
	}
	
	public abstract boolean isCarnivoro();
	public abstract boolean isDaFondaliProfondi();
	
	public String respira(){
		return "wow respiro";
	};
	
	public String nuota(){
		return "wow nuoto";
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	};	

}
