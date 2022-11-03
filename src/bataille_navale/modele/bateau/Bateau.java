package Bataille_Navale.modele.bateau;


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

}
