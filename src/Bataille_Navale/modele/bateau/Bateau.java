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
	
	// Methode permettant de placer bateau sur grille
	
	public String [][] placer_bateau(String [][] grille, int t, int x, int y, int orientation){
	int erreur = 0 ;
	int i = 0 ;
	this.taille = t;
	this.coordX = x;
	this.coordY = y;

	switch (orientation){
			case 1 :{
					for(int j = y ; j < y + t ; j++){ //colonne
						
						grille[x][j] = "\04" ;	
						
						}
					}
			break ;
		
			case 2 :{
					
					for(int j = x ; j < x + t ; j++){ //ligne
						
						grille[j][y] = "\04" ;	
						
						}
					}
			break ;		
		}
	return grille;
	}
	
	
	//Methode Permettant de placer bateau aléatoirement pour la grille ordi
	
	public void BateauOrdi(String grille [][], int t){
		
	int erreur = 0 ;
	
	do{
		int i = 0 ;
		int orientation = (int)(Math.random() * (2) + 1) ; //attribue une valeur aléatoire à orientation entre 0 et 2
		int x = (int)(Math.random() * (10) + 1) ; //attribue une valeur aléatoire à x entre 0 et 10 
		int y = (int)(Math.random() * (10) + 1) ; // le +1 permet d'ahouter la valeur exclue de MathRandom()
		
		erreur = 1 ;
	
		switch (orientation){
				case 1 :{
					if((y + t) > 11){
						erreur = 0 ;	
						}
					else{
						do{
							i = y ;
							
							for (int j = y ; j < (y + t) ; j++){
								if(grille[x][j] == "\04")
									{
									erreur = 0 ;
									i = y + t ;
									}	
								}
							
							if (erreur != 0){
								for (int j = y ; j < (y + t) ; j++)
									{
									grille[x][j] = "\04" ;
									
									}
								i = y + t ;		
								}	
							}
						while(i < y + t );
						}	
					}
				break ;
			
				case 2 :{
					if((x + t) > 11){
						erreur = 0 ;	
						}
					else{
						do{
							i = x ;
							
							for (int j = x ; j < (x + t) ; j++){
								if(grille[j][y] == "\04"){
									erreur = 0 ;
									i = x + t ;
									}	
								}
							
							if (erreur != 0){
								for (int j = x ; j < (x + t) ; j++){
									grille[j][y] = "\04" ;
									}
								i = x + t ;		
								}	
							}
						while(i < x + t );
						}	
					}
				break ;		
			}
	}
	while(erreur != 1) ;
		}
}

