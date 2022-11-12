package Bataille_Navale.modele.bateau;

public class Cuirase extends Bateau {
	

	public Cuirase(int x, int y) {
		super(7, 9, x, y);
		// TODO Auto-generated constructor stub
	}

	public Cuirase() {
		super(7, 9, (int)((Math.random()*10)+ (Math.random()*10)/2), (int)((Math.random()*10)+ (Math.random()*10)/2));
		// TODO Auto-generated constructor stub
	}

}
