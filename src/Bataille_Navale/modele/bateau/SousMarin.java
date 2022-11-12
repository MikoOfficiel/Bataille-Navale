package Bataille_Navale.modele.bateau;

public class SousMarin extends Bateau {

	public SousMarin(int x, int y) {
		super(1,1, x, y);
		// TODO Auto-generated constructor stub
	}
	
	public SousMarin() {
		super(1, 1, (int)((Math.random()*10)+ (Math.random()*10)/2), (int)((Math.random()*10)+ (Math.random()*10)/2));

	}

}