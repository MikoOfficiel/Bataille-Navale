package Bataille_Navale;

import Bataille_Navale.modele.grille.Grille_de_jeu;
import Bataille_Navale.modele.grille.Grille_de_jeu_joueur;
import Bataille_Navale.modele.grille.Grille_de_jeu_ordinateur;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grille_de_jeu g1 = new Grille_de_jeu_joueur(15,15);
		Grille_de_jeu g2 = new Grille_de_jeu_ordinateur(15,15);
		
		System.out.println("Grille joueur");
		g1.Afficher();	
		System.out.println("Grille ordinateur");
		g2.Afficher();	
	}

}
