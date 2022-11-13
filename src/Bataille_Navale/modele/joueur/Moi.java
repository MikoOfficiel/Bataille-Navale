package Bataille_Navale.modele.joueur;

import java.util.Scanner;

import Bataille_Navale.modele.bateau.Coordonnees;

public class Moi extends Joueur {
	
	private Scanner sc;

	public Moi(String nom) {
		super(nom);
		sc = new Scanner(System.in);
	}

	
	public Coordonnees tirer() {
		
		Coordonnees tire ;
		System.out.println("Afin d'attaquer veuillez choisir une coordonnée x et une une coordonnée Y ");
		String CoordonneesChoisis = sc.nextLine();
		
		 tire = new Coordonnees(CoordonneesChoisis);
		
		return tire;
	}

	
}
