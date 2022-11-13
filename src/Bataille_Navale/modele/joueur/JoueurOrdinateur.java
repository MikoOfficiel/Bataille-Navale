package Bataille_Navale.modele.joueur;

import Bataille_Navale.modele.bateau.Coordonnees;

public class JoueurOrdinateur extends Joueur {

	public JoueurOrdinateur() {
		super("Ordinateur");
	}

	public Coordonnees tirer() {
		
		Coordonnees leTire = new Coordonnees();	
		return leTire; 
		
		
	}

}
