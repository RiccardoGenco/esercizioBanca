package BankCheckFeatures;

import java.util.ArrayList;

public class Funzione {

	ArrayList<Double> cronologiaTransazioni = new ArrayList<Double>();

	protected void aggiornaCronologia(double valore) {
		cronologiaTransazioni.add(valore);
		
	}
protected void readCronologia() {
	for (Double i: cronologiaTransazioni) {
		System.out.print(i);
	}
}
}
