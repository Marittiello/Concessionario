package model;

public class Veicolo {
	
	public int id;
	public String targa;
	public String colore;
	public Double valore;
	public String modello;
	
	public Veicolo() {
		
	}
	
	public Veicolo(int ident, String t, String c, String m, Double v) {
		
		id=ident;
		targa=t;
		colore=c;
		modello=m;
		valore=v;
	}
	
}
