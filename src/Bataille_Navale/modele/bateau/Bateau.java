package Bataille_Navale.modele.bateau;

import Bataille_Navale.modele.grille.Grille_de_jeu;

public abstract class Bateau {

	private int taille ;
	private int puisanceTir ;
	private Coordonnees position ;
	
	



	public Bateau(int taille, int puisanceTir, Coordonnees position) {
		this.taille = taille;
		this.puisanceTir = puisanceTir;
		this.position = position;
	}
	

	public Bateau(int t, int puissance) {
		this.taille = t;
		this.puisanceTir = puissance;
		this.position.setX((int)((Math.random()*10)+ (Math.random()*10)/2));
		this.position.setY((int)((Math.random()*10)+ (Math.random()*10)/2));
	}
	


	public int getTaille() {
		return taille;
	}



	public int getPuisanceTir() {
		return puisanceTir;
	}



	public int getCoordX() {
		return position.getX();
	}



	public int getCoordY() {
		return position.getY();
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

