package it.corso.banche.italiane;

import it.corso.banche.Banca;
import it.corso.banche.utils.BancaUtils;

public class BancaIntesa extends Banca {
	
	private int percentualeTasse;

	public BancaIntesa(long conto, int tassoInteresse, int minimoVersamento, int percentualeTasse ) {
		super(conto, tassoInteresse, minimoVersamento);
		this.percentualeTasse = percentualeTasse;
	}

	public BancaIntesa(int tassoInteresse, int minimoVersamento, int percentualeTasse) {
		super(tassoInteresse, minimoVersamento);
		this.percentualeTasse = percentualeTasse;
	}

	@Override
	public boolean prelievo(int quantita) {
		if ((getConto() > 0) && (quantita <= getConto())) {
			long valorePercentualeTasse = BancaUtils.calcolaPercentuale(quantita, getTasse());
			long valoreTotalePrelievo = quantita + valorePercentualeTasse;
			long contoAttuale = getConto() - valoreTotalePrelievo;
			setConto(contoAttuale);
			return true;
		}
		return false;
	}
	
	
	
		
	public int getTasse() {
		return percentualeTasse;
	}

	public void setTasse(int percentualeTasse) {
		this.percentualeTasse = percentualeTasse;
	}

}
