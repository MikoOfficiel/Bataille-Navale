package Bataille_Navale;

public class Grille_de_jeu {

		//Attributs 
		private int Ligne;
		private int Colonnes;
		private char [][] grille;

		//Constructeur
		public Grille_de_jeu(int Ligne, int Col){

		this.Ligne = Ligne;
		this.Colonnes = Col;
		grille = new char[this.Ligne][this.Colonnes];
		
		for(int i = 0; i<this.Ligne;i++) {
			for (int j=0; j <this.Colonnes; j++) {
				grille[i][j] = 'V';
			}
		}
		
		}
		// Methodes test
public void Afficher() {
	
	System.out.println();
	for(int i = 0;i<this.Ligne;i++) {
		for (int j = 0; j< this.Colonnes;j++) {
			
			System.out.print(" | " +  grille[i][j] );
				
		}
		System.out.println();
	}
	
}


}
