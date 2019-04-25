package com.openclassrooms.garage.moteur;

public class MoteurEssence extends Moteur{
	
	public MoteurEssence(String cylindre, double prix) {
		super(cylindre, prix);
		this.setTypeMoteur(TypeMoteur.ESSENCE);
	}
}
