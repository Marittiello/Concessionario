package controller;
import model.Veicolo;
import view.GestoreIO;

public class Avvio {

	public static void main(String[] args) {

		int scelta=0;	
		GestoreIO gestore= new GestoreIO();
		Crud opzione= new Crud();
		Veicolo veicolo= null;

		do {	
			gestore.menu();
			scelta=gestore.leggiIntero("Selezionare l'opzione... ");
			switch(scelta) {
			case 1:{
				boolean verifica= opzione.verificaPosizioniLibere();
				if(!verifica) {
					veicolo= new Veicolo();
					gestore.form(veicolo);
					opzione.aggiungiVeicolo(veicolo);
					break;
				}
				else {
					gestore.stampaVerificaInserimento(verifica);
				}
			}
			case 2:{
				break;
			}
			case 3:{
				Veicolo[] concessionario=opzione.getConcessionario();
				gestore.visualizzaVeicoli(concessionario);
				break;
			}
			}
		}while(scelta!=5);	

	}

}
