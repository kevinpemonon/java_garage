package com.openclassrooms.garage.options;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {
	
	private double prix = 29.9;
	private String nom = "Barre de toit";
	
	@Override
	public double getPrix() {
		return this.prix;
	}
	
	@Override
	public String getNom() {
		return this.nom;
	}
}
