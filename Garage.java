package com.openclassrooms.garage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.openclassrooms.garage.vehicule.Vehicule;

public class Garage {

	private ArrayList<Vehicule> vehicules = new ArrayList<>();
	private File data = new File("garage.txt");
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private String allDescriptions = "";

	@SuppressWarnings("unchecked")
	public Garage() {
		if (data.exists()) {
			try {
				ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(data)));
				try {
					vehicules = (ArrayList<Vehicule>) ois.readObject();
					for (Vehicule vehicule : vehicules) {
						allDescriptions += vehicule;
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				ois.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void addVoiture(Vehicule vehicule) {

		try {
			if (!vehicules.contains(vehicule)) {
				vehicules.add(vehicule);
				oos = new ObjectOutputStream(new BufferedOutputStream(new DataOutputStream(new FileOutputStream(data))));
				oos.writeObject(vehicules);
				oos.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {

		String textToDisplay = "";
		String intro = "*****************************\n" + "*   GARAGE OPENCLASSROOMS   *\n"
				+ "*****************************\n";
		String emptyGarage = "AUCUNE VOITURE DANS CE GARAGE\n\n";

		if (data.length() == 0)
			textToDisplay = emptyGarage + intro;
		else
			textToDisplay = intro + allDescriptions;

		return textToDisplay;
	}
}
