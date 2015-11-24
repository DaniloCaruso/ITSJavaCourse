package it.corso.banche.estere;

import it.corso.banche.Banca;

public class BancaCayman extends Banca {

	public BancaCayman(long conto, int tassoInteresse, int minimoVersamento) {
		super(conto, tassoInteresse, minimoVersamento);
	}

	public BancaCayman(int tassoInteresse, int minimoVersamento) {
		super(tassoInteresse, minimoVersamento);
	}

	@Override
	public boolean prelievo(int quantita) {
		if ((getConto() > 0) && (quantita <= getConto())) {
			long valoreTotaleConto = getConto() - quantita;
			setConto(valoreTotaleConto);
		}
		return false;
	}

}
