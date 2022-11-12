package Bataille_Navale.modele.bateau;

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
	

	public Bateau(int t, int puissance) {
		this.taille = t;
		this.puisanceTir = puissance;
		this.coordX = (int)((Math.random()*10)+ (Math.random()*10)/2);
		this.coordY =(int)((Math.random()*10)+ (Math.random()*10)/2);
	}
	


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

