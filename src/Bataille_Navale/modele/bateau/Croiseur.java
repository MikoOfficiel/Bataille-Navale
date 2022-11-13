package Bataille_Navale.modele.bateau;

public class Croiseur extends Bateau {

	public Croiseur(Coordonnees pos) {
		super(5, 4, pos);
	}
	
	public Croiseur() {
		super(5, 4, new Coordonnees());
	}
}
