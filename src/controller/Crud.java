package controller;

import view.GestoreIO;
import model.Veicolo;

public class Crud {
	Veicolo[] concessionario= new Veicolo[5];


	public void aggiungiVeicolo(Veicolo veicolo){
		for(int i=0;i<concessionario.length;i++) {
			if(concessionario[i]==null) {
				concessionario[i]=veicolo;
				break;

			}

		}

	}
	public Veicolo[] getConcessionario() {
		return concessionario;
	}

	public boolean verificaPosizioniLibere() {
		int posizioniOccupate=0;
		for(int i=0;i<concessionario.length;i++) {
			if(concessionario[i]!=null) {
				posizioniOccupate++;
			}

		}
		if(posizioniOccupate==concessionario.length) {
			return true;
		}
		else {
			return false;
		}
	}
}


