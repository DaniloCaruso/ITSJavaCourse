package it.corso.animali.marini;

public class Balena extends AnimaliMarini {

	
	private int quantitaDiOssigeno;
	
	public Balena(String colore, String sesso, int peso, int lunghezza, int quantitaDiOssigeno) {
		super(colore, sesso, peso, lunghezza);
		controlloSeOssigenoVaOltreILimiti(quantitaDiOssigeno);		
	}
	
	public boolean emergePerRespirare(){
		return (this.quantitaDiOssigeno == 0);
	}
	
	@Override
	public boolean isCarnivoro() {
			return true;
	}
	@Override
	public boolean isDaFondaliProfondi() {
		return true;
	}
	public int getQuantitaDiOssigeno() {
		return quantitaDiOssigeno;
	}


	public void setQuantitaDiOssigeno(int quantitaDiOssigeno) {
		controlloSeOssigenoVaOltreILimiti(quantitaDiOssigeno);
	}
	
	private void controlloSeOssigenoVaOltreILimiti(int quantitaDiOssigeno){
		if (quantitaDiOssigeno>100){
			System.out.println("Massima quantità di ossigeno permessa 100, il valore è stato settato a 100");
		this.quantitaDiOssigeno = 100;
		}else{
			this.quantitaDiOssigeno = quantitaDiOssigeno;
		}
	}
		

}
