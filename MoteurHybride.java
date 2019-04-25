package com.openclassrooms.garage.moteur;

public class MoteurHybride extends Moteur {

	public MoteurHybride(String cylindre, double prix) {
		super(cylindre, prix);
		this.setTypeMoteur(TypeMoteur.HYBRIDE);
	}
}
