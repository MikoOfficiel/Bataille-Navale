package Bataille_Navale.modele.bateau;

public class Croiseur extends Bateau {

	public Croiseur(int x, int y) {
		super(5, 4, x, y);
		// TODO Auto-generated constructor stub
	}
	
	
	public Croiseur() {
		super(5, 4, (int)((Math.random()*10)+ (Math.random()*10)/2), (int)((Math.random()*10)+ (Math.random()*10)/2));
	}
}
