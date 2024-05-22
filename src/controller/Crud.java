package controller;
import model.Veicolo;
@SuppressWarnings("unused")
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
	public Veicolo cercaVeicolo(int id) {
		for(int i=0;i<concessionario.length;i++) {
			if(concessionario[i]!=null) {
				if(concessionario[i].id==id) {
					return concessionario[i];
				}
			}
		}
		return null;
	}
	public Veicolo cercaVeicolo(String targa) {
		for(int i=0;i<concessionario.length;i++) {
			if(concessionario[i]!=null) {
				if(concessionario[i].targa.equals(targa)) {
					return concessionario[i];
				}
			}
		}
		return null;
	}


	public boolean eliminaVeicolo(int id) {
		boolean flag;
		for(int i=0;i<concessionario.length;i++) {
			if(concessionario[i]!=null) {
				if(concessionario[i].id==id) {
					concessionario[i]=null;
					return flag=true;
				}
			}
		}
		return flag=false;
	}

	public boolean eliminaVeicolo(String targa) {
		boolean flag;
		for(int i=0;i<concessionario.length;i++) {
			if(concessionario[i]!=null) {
				if(concessionario[i].targa.equals(targa)) {
					concessionario[i]=null;
					return flag=true;
				}
			}
		}
		return flag=false;
	}
}
