package view;
import java.util.Scanner;
import model.Veicolo;
@SuppressWarnings("resource")
public class GestoreIO {


	public String leggiStringa(String messaggio) {
		System.out.println(messaggio);
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	public int leggiIntero(String messaggio) {
		System.out.println(messaggio);
		Scanner input = new Scanner(System.in);
		return Integer.parseInt(input.nextLine());
	}


	public Double leggiDecimale(String messaggio) {
		System.out.println(messaggio);
		Scanner input = new Scanner(System.in);
		return Double.parseDouble(input.nextLine());
	}

	public void form(Veicolo veicolo) {

		veicolo.id = leggiIntero("Inserisci id: ");
		veicolo.targa = leggiStringa("Inserisci targa: ");
		veicolo.colore = leggiStringa("Inserisci colore: ");
		veicolo.modello = leggiStringa("Inserisci modello: ");
		veicolo.valore = leggiDecimale("Inserisci valore: ");
	}

	public void schedaVeicolo(Veicolo veicolo) {
		System.out.println(veicolo.id);
		System.out.println(veicolo.targa);
		System.out.println(veicolo.colore);
		System.out.println(veicolo.modello);
		System.out.println(veicolo.valore);
	}
	public void menu() {
		System.out.println("****MENU****");
		System.out.println("1)Aggiungi Veicolo");
		System.out.println("2)Cerca Veicolo");
		System.out.println("3)Leggi Veicoli");
		System.out.println("4)Rimuovi Veicolo");
		System.out.println("5)Termina Programma");
		System.out.println("************");
	}

	public void stampaVerificaInserimento(boolean risultato) {
		if (risultato) {
			System.out.println("La concessionaria e' satura");
			System.out.println("Premere invio per tornare al menu...");
			Scanner input = new Scanner(System.in);
			input.nextLine();
		}
		else {
			System.out.println("Inserisci un veicolo: ");
		}
	}

	public void visualizzaVeicoli(Veicolo[] concessionario) {

		for(int i=0;i<concessionario.length;i++) {
			if(concessionario[i]!=null) {
				schedaVeicolo(concessionario[i]);
			}
		}
	}

	public void menu2() {
		System.out.println("************");
		System.out.println("1)Cerca tramite id: ");
		System.out.println("2)Cerca tramite targa");
		System.out.println("************");
	}


	public void stampaStringa(String frase) {
		System.out.println(frase);
	}

}
