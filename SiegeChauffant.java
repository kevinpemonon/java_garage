package com.openclassrooms.garage.options;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {

	private double prix = 562.9;
	private String nom = "Siège chauffant";
	
	@Override
	public double getPrix() {
		return this.prix;
	}
	
	@Override
	public String getNom() {
		return this.nom;
	}
}
