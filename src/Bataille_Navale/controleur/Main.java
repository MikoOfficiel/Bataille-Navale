package Bataille_Navale.controleur;

import java.util.Scanner;

import Bataille_Navale.modele.bateau.Bateau;
import Bataille_Navale.modele.bateau.Croiseur;
import Bataille_Navale.modele.grille.Grille_de_jeu;
import Bataille_Navale.modele.grille.Grille_de_jeu_joueur;
import Bataille_Navale.modele.grille.Grille_de_jeu_ordinateur;
import Bataille_Navale.vue.grille.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//private int CoordX = get.CoordX();
		new Plateau_de_jeu(15,15); //mettre 15, 15 car dans Grille.java CASE_DIM = 28
		//Bateau b = new Bateau(5,5,3,4);

		Croiseur c = new Croiseur(5,4);

		int coordX = c.getCoordX();
		int coordY = c.getCoordY();		
		
		
	 Tir(coordX,coordY , c);
	}
	// Methode tirer/ toucher 
	public static void Tir(int tir_CoordX, int tir_CoordY, Bateau b) {

		System.out.println("Taper les coordonnées où vous souhaiter tirer");
		Scanner s = new Scanner(System.in);
		System.out.println("CoordonnéesX: ");
		tir_CoordX = s.nextInt();
		System.out.println("Coordonnées Y: ");
		tir_CoordY = s.nextInt();
		int co_batX = b.getCoordX();
		int co_batY = b.getCoordY();

		if(tir_CoordX == co_batX && tir_CoordY == co_batY) {
			System.out.println("Toucher un bateau!!!");

			new Plateau_de_jeu(15,15);
			new Plateau_de_jeu(15,15);//mettre 15, 15 car dans Grille.java CASE_DIM = 28

		}
		else {
			System.out.println("Pas touché de cases adverses.");
		}
	}

	
}


