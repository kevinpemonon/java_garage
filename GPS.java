package com.openclassrooms.garage.options;

import java.io.Serializable;

public class GPS implements Option, Serializable {

	private double prix = 113.5;
	private String nom = "GPS";

	@Override
	public double getPrix() {
		return this.prix;
	}

	@Override
	public String getNom() {
		return this.nom;
	}
}
