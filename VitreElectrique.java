package com.openclassrooms.garage.options;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {
	
	private double prix = 212.35;
	private String nom = "Vitre électrique";
	
	@Override
	public double getPrix() {
		return this.prix;
	}
	@Override
	public String getNom() {
		return this.nom;
	}
}
