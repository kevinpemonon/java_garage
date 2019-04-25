package com.openclassrooms.garage.moteur;

import java.io.Serializable;

abstract public class Moteur implements Serializable {

	private TypeMoteur type;
	private String cylindre;
	private double prix;
	
	public Moteur(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "Moteur " + getTypeMoteur() + " " + cylindre + " " + "(" + prix + "€)";
	}
	
	public String getPrix() {
		String result = String.valueOf(this.prix);
		return result;	
	}
	
	public TypeMoteur getTypeMoteur() {
		return type;
	}
	
	public void setTypeMoteur(TypeMoteur type) {
		this.type = type;
	}
}
