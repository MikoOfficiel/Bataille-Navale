package Bataille_Navale.modele.grille;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
//import Bataille_Navale.modele.bateau.Bateau;

public class Grille_de_jeu {
	//Cr�ation graphique
	JFrame Frame;

	//Attributs 
	private int Ligne;
	private int Colonnes;
	private char [][] grille;

	//Attributs placements des bateaux sur la grille
	private Grille_de_jeu debut_bateau;
	private Grille_de_jeu fin_bateau;
	private int nbTouches ;
	private Grille_de_jeu [] partiesTouches;

	//Cr�ation graphique
	//JFrame Frame;

	//Constructeur
	public Grille_de_jeu(int Ligne, int Col){

		this.Ligne = Ligne;
		this.Colonnes = Col;
		grille = new char[this.Ligne][this.Colonnes];

		for(int i = 0; i<this.Ligne;i++) {
			for (int j=0; j <this.Colonnes; j++) {
				grille[i][j] = '0';
			}
		}
	}

	// getters
	public int getLigne() {
		return this.Ligne;	
	}

	public int getColonnes() {
		return this.Colonnes;

	}



	// Methodes affichage du tableau 
	public void Afficher() {

		System.out.println();
		for(int i = 0;i<this.Ligne;i++) {
			System.out.print(i+1);

			for (int j = 0; j< this.Colonnes;j++) {
				System.out.print( " | " +  grille[i][j] );

			}

			System.out.println();
		}
		initialiserLaFenetre();

	}




	//Methodes TESTS

	//ICI Methode permettant de selectionner les coordonnees de la case que l'on veut viser � compl�ter

	public int coordonneesSelection() {

		return 0;	//Jahne : Pourquoi return 0; ?
	}





	// V�rification si les coordonn�es se retrouve sur l'une des cases d'un bateau adverse 
	public boolean comparaisonCoordonnees(Grille_de_jeu g) {

		if( g.getColonnes()>= debut_bateau.getColonnes() && g.getColonnes()<= fin_bateau.getColonnes()) {
			if( g.getLigne()>= debut_bateau.getLigne() 	&& g.getLigne() <= fin_bateau.getLigne()) {
				return true;
			}
		}

		return false;

	}


	//Bateau vertical si ligne de debut = ligne de fin
	//Bateau horizontal si colonnes de debut = colonnes de fin 

	//recherche pour voir si le bateau a �t� touch� 
	public boolean Touche(Grille_de_jeu g) {
		for(int i = 0; i< partiesTouches.length;i++) {
			if(partiesTouches[i].equals(g)) {
				return true;
			}
		}
		return false;
	}

	public boolean Coule(){

		return partiesTouches.length == nbTouches;
	}


	//AFFICHAGE FENETRE 
	//import java.util.*;

	public void initialiserLaFenetre() {

		Frame = new JFrame("BATAILLE NAVALE");
		Frame.setSize(800, 600);
		Frame.setBackground(Color.black);
		Frame.setVisible(true);
		Frame.setFocusable(true);
		}
}
