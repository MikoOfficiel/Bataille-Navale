package Bataille_Navale.modele.bateau;

public class Destroyeur extends Bateau {

	public Destroyeur(int x, int y) {
		super(3, 1, x, y);
		// TODO Auto-generated constructor stub
	}
	
	public Destroyeur() {
		super(3, 1, (int)((Math.random()*10)+ (Math.random()*10)/2), (int)((Math.random()*10)+ (Math.random()*10)/2));
	}

}
