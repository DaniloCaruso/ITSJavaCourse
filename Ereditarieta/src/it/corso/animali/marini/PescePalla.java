package it.corso.animali.marini;

public class PescePalla extends AnimaliMarini {
	
	private int lunghezzaAculei;

	public PescePalla(String colore, String sesso, int peso, int lunghezza, int lunghezzaAculei ) {
		super(colore, sesso, peso, lunghezza);
		this.lunghezzaAculei = lunghezzaAculei;
	}
	
	public boolean isVelenoso(){
		return true;
	}
	
	@Override
	public boolean isCarnivoro() {
		return true;
	}

	@Override
	public boolean isDaFondaliProfondi() {
		return false;
	}

	
	public int getLunghezzaAculei() {
		return lunghezzaAculei;
	}

	public void setLunghezzaAculei(int lunghezzaAculei) {
		this.lunghezzaAculei = lunghezzaAculei;
	}

}
