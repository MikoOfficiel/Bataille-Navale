package Bataille_Navale.modele.joueur;

import Bataille_Navale.modele.bateau.Coordonnees;

public abstract class Joueur {

	private String nom;

	public Joueur(String nom) {
		this.nom = nom;
	}

	public abstract Coordonnees tirer();
}
