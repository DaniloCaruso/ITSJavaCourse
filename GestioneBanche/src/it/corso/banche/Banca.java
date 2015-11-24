package it.corso.banche;

import it.corso.banche.utils.BancaUtils;

public abstract class Banca {

	
	private long conto = 0;
	private int tassoInteresse;
	private int minimoVersamento;
	
	public Banca(long conto , int tassoInteresse , int minimoVersamento){
		this.conto = conto;
		this.minimoVersamento = minimoVersamento;
		this.tassoInteresse = tassoInteresse;
	}
	
	public Banca(int tassoInteresse , int minimoVersamento){
		this.minimoVersamento = minimoVersamento;
		this.tassoInteresse = tassoInteresse;	
	}
	
	private long calcolaInteresse(){
		long valoreInteresse = BancaUtils.calcolaPercentuale(getConto(), tassoInteresse);
		return valoreInteresse;
	}
	
	public void aggiungiInteresseConto(){
		long tmpInteresse = calcolaInteresse();
		setConto(getConto()+tmpInteresse);
	}	
	
	public boolean versamento(int quantita){
		if (quantita >= minimoVersamento) {
			this.conto += quantita;
			return true;
		}
		return false;
		// this.conto = this.conto + quantita;
	}
	
	public abstract boolean prelievo(int quantita);
	
	
	public long getConto() {
		return conto;
	}

	public void setConto(long conto) {
		this.conto = conto;
	}

	public int getTassoInteresse() {
		return tassoInteresse;
	}

	public void setTassoInteresse(int tassoInteresse) {
		this.tassoInteresse = tassoInteresse;
	}

	public int getMinimoVersamento() {
		return minimoVersamento;
	}

	public void setMinimoVersamento(int minimoVersamento) {
		this.minimoVersamento = minimoVersamento;
	}
	
	
	
	
	
	
	
	
}
