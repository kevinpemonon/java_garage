package com.openclassrooms.garage.moteur;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String cylindre, double prix) {
		super(cylindre, prix);
		this.setTypeMoteur(TypeMoteur.ELECTRIQUE);
	}
}
