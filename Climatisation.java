package com.openclassrooms.garage.options;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {
	
	private double prix = 347.3;
	private String nom = "Climatisation";
	
	@Override
	public double getPrix() {
		return this.prix;
	}
	
	@Override
	public String getNom() {
		return this.nom;
	}
}
