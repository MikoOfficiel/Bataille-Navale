package Bataille_Navale.controleur;

import java.util.Scanner;

import Bataille_Navale.modele.bateau.Bateau;
import Bataille_Navale.modele.bateau.Coordonnees;
import Bataille_Navale.modele.bateau.Croiseur;
import Bataille_Navale.modele.grille.Grille_de_jeu;
import Bataille_Navale.modele.grille.Grille_de_jeu_joueur;
import Bataille_Navale.modele.grille.Grille_de_jeu_ordinateur;
import Bataille_Navale.vue.grille.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Plateau_de_jeu(15,15); //mettre 15, 15 car dans Grille.java CASE_DIM = 28
		new Plateau_de_jeu(15,15);

	}

	
}


