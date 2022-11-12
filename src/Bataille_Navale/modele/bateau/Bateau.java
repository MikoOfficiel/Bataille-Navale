package Bataille_Navale.modele.bateau;
import Bataille_Navale.modele.grille.*;

import Bataille_Navale.modele.grille.Grille_de_jeu;

public abstract class Bateau {

	private int taille ;
	private int puisanceTir ;
	private int coordX ;
	private int coordY ;



	public Bateau(int t, int puissance, int x, int y) {
		this.taille = t;
		this.puisanceTir = puissance;
		this.coordX = x;
		this.coordY = y;
	}
	
<<<<<<< HEAD
=======
	
	
	// Methode permettant de placer bateau sur grille
	
>>>>>>> ff3c04b6ad59179e7f0425f02c9b783780eed58e
	public int getTaille() {
		return taille;
	}



	public int getPuisanceTir() {
		return puisanceTir;
	}



	public int getCoordX() {
		return coordX;
	}



	public int getCoordY() {
		return coordY;
<<<<<<< HEAD
=======
	}



	public Grille_de_jeu placer_bateau( int ligne, int colonne , int t, int x, int y, int orientation){
	int erreur = 0 ;
	int i = 0 ;
	this.taille = t;
	this.coordX = x;
	this.coordY = y;
	
	Grille_de_jeu grille = new Grille_de_jeu(ligne,colonne);


	switch (orientation){
			case 1 :{
					for(int j = y ; j < y + t ; j++){ //colonne
						
						= "\04" ;	
						
						}
					}
			break ;
		
			case 2 :{
					
					for(int j = x ; j < x + t ; j++){ //ligne
						
						grille(j,y) = "\04" ;	
						
						}
					}
			break ;		
		}
	return grille;
>>>>>>> ff3c04b6ad59179e7f0425f02c9b783780eed58e
	}
	
	public boolean orientationBateau() {
		
		int a = (int)(Math.random()*10);
		boolean estHorizontal=true;
		
		if(a%2==0) {
			return  estHorizontal;
			
		}else {
			return false;
		}
			
	}
}

