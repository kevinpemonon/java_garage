package com.openclassrooms.garage.vehicule;

import java.io.Serializable;
import java.util.ArrayList;

import com.openclassrooms.garage.moteur.Moteur;
import com.openclassrooms.garage.options.Option;

public class Vehicule implements Option, Serializable{

	private double prix;
	private String nom;
	private ArrayList<Option> options = new ArrayList<>();
	private Marque nomMarque;
	private Moteur moteur;

	@Override
	public String toString() {
		return "+ Voiture " + getNomMarque() + " : " + getNom() + " " + getMoteur() + " [" + getOptions() + "] \n";
	}
	
	public void addOption(Option option) {
		options.add(option);
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getOptions() {
		String allOptions = "";
		int index = 0;
		for (Option option : options) {
			index++;
			allOptions += option.getNom() + " (" + option.getPrix() + ")";
			if (index != (options.size()))
				allOptions = allOptions + ", ";
		}
		return allOptions;
	}

	public void setOptions(ArrayList<Option> options) {
		this.options = options;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Marque getNomMarque() {
		return nomMarque;
	}

	public void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}
	
	public String getMoteur() {
		return moteur.toString();
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
}
