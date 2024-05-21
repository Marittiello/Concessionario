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
				gestore.menu2();
				scelta=gestore.leggiIntero("Selezionare l'opzione... ");


				switch(scelta) {
				case 1:{
					int id=gestore.leggiIntero("Inserisci l'id da ricercare");
					Veicolo veicoloCercato=opzione.cercaVeicolo(id);
					gestore.schedaVeicolo(veicoloCercato);
					break;
				}
				case 2:{
					String targa=gestore.leggiStringa("Inserisci la targa da ricercare");
					Veicolo veicoloCercato=opzione.cercaVeicolo(targa);
					gestore.schedaVeicolo(veicoloCercato);
					break;
				}
				}
				break;
			}


			case 3:{
				Veicolo[] concessionario=opzione.getConcessionario();
				gestore.visualizzaVeicoli(concessionario);
				break;
			}
			case 4:{
				boolean flag;
				int id=gestore.leggiIntero("Inserisci l'id dell'auto da eliminare.");
				flag=opzione.eliminaVeicolo(id);
				if(flag) {
					gestore.stampaStringa("L'auto e' stata eliminata con successo.");
				}
				else if(!flag) {
					gestore.stampaStringa("ID inesistente.");
				}
				break;
			}
			case 5:{
				gestore.stampaStringa("Il Programma e' terminato");
			}
			}
		}while(scelta!=5);	

	}

}
