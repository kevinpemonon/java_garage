package com.openclassrooms.garage.moteur;

public class MoteurDiesel extends Moteur {
	
	public MoteurDiesel(String cylindre, double prix) {
		super(cylindre, prix);
		this.setTypeMoteur(TypeMoteur.DIESEL);
	}
}
