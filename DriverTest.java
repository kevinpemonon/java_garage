package com.openclassrooms.garage;

import java.io.IOException;

import com.openclassrooms.garage.moteur.MoteurDiesel;
import com.openclassrooms.garage.moteur.MoteurElectrique;
import com.openclassrooms.garage.moteur.MoteurEssence;
import com.openclassrooms.garage.moteur.MoteurHybride;
import com.openclassrooms.garage.options.BarreDeToit;
import com.openclassrooms.garage.options.Climatisation;
import com.openclassrooms.garage.options.GPS;
import com.openclassrooms.garage.options.SiegeChauffant;
import com.openclassrooms.garage.options.VitreElectrique;
import com.openclassrooms.garage.vehicule.A300B;
import com.openclassrooms.garage.vehicule.D4;
import com.openclassrooms.garage.vehicule.Lagouna;
import com.openclassrooms.garage.vehicule.Vehicule;

public class DriverTest {

	public static void main(String[] args) throws IOException {
		Garage garage = new Garage();
		System.out.println(garage);

		Vehicule lag1 = new Lagouna();
		lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
		lag1.addOption(new GPS());
		lag1.addOption(new SiegeChauffant());
		lag1.addOption(new VitreElectrique());
		garage.addVoiture(lag1);
		

		Vehicule A300B_2 = new A300B();
		A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
		A300B_2.addOption(new Climatisation());
		A300B_2.addOption(new BarreDeToit());
		A300B_2.addOption(new SiegeChauffant());
		garage.addVoiture(A300B_2);

		Vehicule d4_1 = new D4();
		d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
		d4_1.addOption(new BarreDeToit());
		d4_1.addOption(new Climatisation());
		d4_1.addOption(new GPS());
		garage.addVoiture(d4_1);

		Vehicule lag2 = new Lagouna();
		lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
		garage.addVoiture(lag2);

		Vehicule A300B_1 = new A300B();
		A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
		A300B_1.addOption(new VitreElectrique());
		A300B_1.addOption(new BarreDeToit());
		garage.addVoiture(A300B_1);

		Vehicule d4_2 = new D4();
		d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
		d4_2.addOption(new SiegeChauffant());
		d4_2.addOption(new BarreDeToit());
		d4_2.addOption(new Climatisation());
		d4_2.addOption(new GPS());
		d4_2.addOption(new VitreElectrique());
		garage.addVoiture(d4_2);
		
	}

}
