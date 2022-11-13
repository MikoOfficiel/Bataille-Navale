package Bataille_Navale.modele.bateau;

public class Coordonnees {

	private int x;
	private int y;
	
	public Coordonnees(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Coordonnees() {
		this.x = (int)((Math.random()*10)+ (Math.random()*10)/2);
		this.y = (int)((Math.random()*10)+ (Math.random()*10)/2);
	}
	
	public Coordonnees(String s) {
		//methde utilisé afin d'assurer que la lettre est en majuscule
		s = s.toUpperCase();
		
		//afin de pouvoir s'assurer que la ligne prend une valeur de 1 a 26(un seul chiffre ou deux)
		if (s.length() < 2 || s.length() > 3) {
			throw new IllegalArgumentException("coordonnee dépasse limite (elle doit prendre 2 ou 3 caracteres)");
		}
		
		
		if (s.charAt(0) < 'A' || s.charAt(0) > 'Z') { // verifier que le premier caractere est une lettre
			throw new IllegalArgumentException("coordonnee dépasse limite (doit etre entre une lettre)");
		}
		
		//levé l'exception "NumberFormatException" car on essaye de modifier la fin de la chaine en entier
		try {
			Integer.parseInt(s.substring(1)); 
		} catch (NumberFormatException e) { 
			throw new IllegalArgumentException("indice de ligne doit etre un NOMBRE de 1 a 26"); 
		}
		
		
		if (Integer.parseInt(s.substring(1)) < 1 // on teste le nombre en 2eme partie de la string: doit etre entre 1 et
				// 26
|| Integer.parseInt(s.substring(1)) > 26) {
throw new IllegalArgumentException("coordonnee dépasse limite (doit etre entre 1 a 26)");
}
		int coorX = s.charAt(0) - 65;
		int coorY = Integer.parseInt(s.substring(1)) - 1;
		this.x = coorX ;
		this.y =  coorY;
	    

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "Coordonnee x=" + x + " Coordonnee y=" + y ;
	}
	
	public static void main(String[] args) {
		
		Coordonnees test = new Coordonnees("K10");
		
		System.out.println(test.toString());

	}
	
	
}
